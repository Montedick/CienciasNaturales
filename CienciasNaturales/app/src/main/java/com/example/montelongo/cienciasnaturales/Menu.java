package com.example.montelongo.cienciasnaturales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    Button BtnDescripcion,BtnSatelites,BtnInstrumentos,BtnPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        BtnDescripcion=(Button)findViewById(R.id.BTNDescripcion);
        BtnSatelites=(Button)findViewById(R.id.BTNSatelite);
        BtnInstrumentos=(Button)findViewById(R.id.BTNInstrumento);
        BtnPlanetas=(Button)findViewById(R.id.BTNPlanetas);

        BtnDescripcion.setOnClickListener(this);
        BtnSatelites.setOnClickListener(this);
        BtnInstrumentos.setOnClickListener(this);
        BtnPlanetas.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            //Lista de hombre o mujer
            case R.id.BTNDescripcion:
                Intent descripcion = new Intent(view.getContext(),listaHombreMujer.class);
                startActivity(descripcion);
                break;

            //Salud con acciones
            case R.id.BTNSatelite:
                Intent SateliteyAsteroide = new Intent(view.getContext(),salud.class);
                startActivity(SateliteyAsteroide);
                break;

            //Cuidados al ecosistema
            case R.id.BTNInstrumento:
                Intent intrumentos = new Intent(view.getContext(),ecosistema.class);
                startActivity(intrumentos);
                break;

            //Efectos del calor en los materiales
            case R.id.BTNPlanetas:
                Intent planetas = new Intent(view.getContext(),efectos.class);
                startActivity(planetas);
                break;

        }

    }
}
