package com.example.montelongo.cienciasnaturales;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.sql.BatchUpdateException;

public class video_ecosistema extends AppCompatActivity {

    VideoView videoView_ecosistemas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_ecosistema);
        videoView_ecosistemas=(VideoView)findViewById(R.id.videoView_ecosistema);

        Uri path = Uri.parse("android.resource://com.example.montelongo.cienciasnaturales/"
                + R.raw.ecosistema_video);


        //AMPLIACIÓN
        MediaController mc = new MediaController(this);
        videoView_ecosistemas.setMediaController(mc);

        videoView_ecosistemas.setVideoURI(path);
        videoView_ecosistemas.start();

    }


}
