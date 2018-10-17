package com.example.montelongo.cienciasnaturales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import java.sql.BatchUpdateException;

public class ecosistema extends AppCompatActivity implements View.OnClickListener {

    Button BtnReproducir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecosistema);
        BtnReproducir=(Button)findViewById(R.id.BtnVideo);
        BtnReproducir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==BtnReproducir.getId()){
            Intent intent = new Intent(ecosistema.this,video_ecosistema.class);
            startActivity(intent);
        }
    }
}
