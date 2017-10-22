package genesis;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.script.*;

public class App {

	public static void main(String[] args) throws ScriptException {
		Security login = new Security();
		SpotifyPlaylist playlist = new SpotifyPlaylist();

		
		File htmlFile = new File(url);
		try {
			Desktop.getDesktop().browse(htmlFile.toURI());
		} catch (IOException e) {
			System.out.println("Oops: "+ e.getMessage());
		}
		
/*
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			engine.eval(new java.io.FileReader("welcome.js"));
		} catch (FileNotFoundException e) {
			System.out.println("Oops: " + e.getMessage());
		}
*/
		
		if (login.spotifyLogin("sampleUserName", "samplePasswrod") == true) {
			playlist.generatePlaylist();
		} else {
			System.out.println("Incorrect Username or Password");
			
			
			
		}

	}
	private static String url = "";
}
