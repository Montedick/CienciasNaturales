package com.example.montelongo.cienciasnaturales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class infPersona extends AppCompatActivity implements View.OnClickListener {

    TextView Tipo,Texto;
    ImageView imagen;
    Button BtnResegresarMenus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf_persona);

        Tipo=(TextView)findViewById(R.id.TxtTipoSexual);
        Texto=(TextView)findViewById(R.id.TxtTextoSexual);
        imagen=(ImageView)findViewById(R.id.imagentipo);
        BtnResegresarMenus=(Button)findViewById(R.id.BtnRegresarMenu);
        Bundle bundle= getIntent().getExtras();

        if(bundle.getInt("info")==1){
            Tipo.setText("Caracteres sexuales del  hombre ");
            Texto.setText("En la especie humana existen mujeres y hombres, es decir, personas de sexo femenino y de sexo masculino\n" +
                    "El aparato reproductor masculino está formado por los órganos genitales internos y los órganos genitales externos. Los órganos genitales internos son los testículos, los conductos deferentes, la uretra, las vesículas seminales y la próstata. Los testículos producen unas células llamadas espermatozoides, necesarias para la reproducción. los conductos deferentes conducen los espermatozoides hasta la uretra, que los lleva al exterior. Las vesículas seminales y la próstata fabrican el líquido que alimenta y transporta a los espermatoides.\n" +
                    "Los órganos genitales externos son el escroto y el pene. El escroto es una bolsa de piel en la que están los testículos. El pene está recorrido en su interior por la uretra y se encarga de expulsar los espermatozoides.");
            imagen.setImageResource(R.mipmap.aparatoreproductormasculino);

        }else if(bundle.getInt("info")==0){
            Tipo.setText("Caracteres sexuales del mujer");
            Texto.setText("El aparato reproductor femenino está formado por los órganos genitales internos y los órganos genitales externos. (ver vídeo aparato reproductor femenino)\n" +
                    "Los órganos genitales internos son los ovarios, las trompas de Falopio, el útero y la vagina. En los ovarios se producen unas élulas llamadas óvulos, necesarias para la reproducción. Las trompas de Falopio son unos conductos que comunican los ovarios con el útero. El útero es cavidad donde se desarrolla el bebé durante el embarazo. La vagina es el canal que comunica el útero con el exterior.\n" +
                    "Los órganos genitales externos reciben el nombre de vulva. Incluyen unos pliegues de piel de forma alargada llamadas labios y los orificios de la vagina y la uretra.");
            imagen.setImageResource(R.mipmap.aparatoreproductormujer);
        }
        BtnResegresarMenus.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==BtnResegresarMenus.getId()){
            Intent intentRegresarMenu= new Intent(infPersona.this,Menu.class);
            startActivity(intentRegresarMenu);
        }
    }
}
