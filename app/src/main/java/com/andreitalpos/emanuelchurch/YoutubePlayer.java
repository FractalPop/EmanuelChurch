package com.andreitalpos.emanuelchurch;


import android.os.Bundle;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubePlayer extends YoutubeFailureRecoveryActivity {

    private YouTubePlayerView playerView;
    private String youtube_url;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_youtube);

        // The unique video id of the youtube video (can be obtained from video url)
        //youtube_url = "j4eBvejTvMg";
        //youtube_url = "115G2nOxGPY";

        //https://youtu.be/izna8-mMB6g unique live stream ULR
        youtube_url = "izna8-mMB6g";

        playerView = (YouTubePlayerView) findViewById(R.id.player);
        playerView.initialize(getString(R.string.YOUTUBE_API_KEY), this);

    }

    @Override
    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return playerView;
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                        YouTubePlayer player, boolean wasRestored) {

        player.setFullscreen(true);
        player.setShowFullscreenButton(false);
        player.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);

        if (!wasRestored) {
            player.loadVideo(youtube_url);
        }

    }

}
