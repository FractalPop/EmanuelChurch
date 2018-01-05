package com.andreitalpos.emanuelchurch;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.IOException;

public class LiveActivity extends Fragment {

    //String churchStreamUrl = "https://www.youtube.com/user/empspot/live";
    //String churchStreamUrl = "https://www.youtube.com/watch?v=115G2nOxGPY";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_live, container, false);

        ImageButton imageButton = (ImageButton) view.findViewById(R.id.playImageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =  new Intent(getActivity(), YoutubePlayer.class);

                startActivity(intent);

            }

        });

        return view;
    }

}




