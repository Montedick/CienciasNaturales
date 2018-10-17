package com.example.montelongo.cienciasnaturales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class listaHombreMujer extends AppCompatActivity implements View.OnClickListener {

    Button Btnhombre,Btnmujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hombre_mujer);

        Btnhombre=(Button)findViewById(R.id.BtnHombre);
        Btnmujer=(Button)findViewById(R.id.BtnMujer);

        Btnhombre.setOnClickListener(this);
        Btnmujer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.BtnHombre:
                Intent intent = new Intent(view.getContext(),infPersona.class);
                intent.putExtra("info",1);
                startActivity(intent);
                break;
            case R.id.BtnMujer:
                Intent intentMujer = new Intent(view.getContext(),infPersona.class);
                intentMujer.putExtra("info",0);
                startActivity(intentMujer);
                break;
        }
    }
}
