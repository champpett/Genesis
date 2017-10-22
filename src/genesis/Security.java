package genesis;

public class Security {
	
	public void getOuathToken(){
		
	}

	public boolean spotifyLogin(String username, String password) {
		
		username = this.username;
		password = this.password;
		
		
		return false;
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	private String username="";
	private String password="";
	private String client_id="";
	private String response_type ="";
	private String redirect_uri  = "";
	private String state = "";
	private String scope = "";
	private String show_dialog ="";
}
