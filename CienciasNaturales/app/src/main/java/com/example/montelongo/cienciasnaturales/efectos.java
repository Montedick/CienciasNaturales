package com.example.montelongo.cienciasnaturales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class efectos extends AppCompatActivity implements View.OnClickListener {

    Button BtnRegrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efectos);
        BtnRegrear=(Button)findViewById(R.id.BtnRes);

        BtnRegrear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==BtnRegrear.getId()){
            Intent regresar =new Intent(efectos.this,Menu.class);
            startActivity(regresar);
        }
    }
}
