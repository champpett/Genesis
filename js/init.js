(function(exports) {
    'use strict';
	var $spotifytitle="PlaceHolder+";
	var $searchQuerySpotify="Drake";
	var $title = $spotifytitle;
	var $searchQuery = $searchQuerySpotify;
	
    var settings = {
        Model: YouTubeAPIModel,
        PlayerView: YouTubePlayerView,
        PlaylistView: PlaylistPlayerView,
        showSearch: true,
        skipLength: 30,
        controlsHideTime: 3000,
        user: "vevo",
        devKey: "AIzaSyDuwIBMgUnS9eug4NMmzpz8eCTwGWVmI2k",
        showLatestChannel: true,
		channels: [
          
            {
                type: "searchterm",
                query: $searchQuery,
                title: $title
            },
            {
                type: "searchterm",
                query: $searchQuery,
                title: $title
            }
        ],
        displayButtons: false
    };

    exports.app = new App(settings);
}(window));
