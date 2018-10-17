package com.example.montelongo.cienciasnaturales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.BatchUpdateException;

public class salud extends AppCompatActivity implements View.OnClickListener{

    String vecTitulo[]={
      /* 1 */ "1. Hidrátate",
      /* 2 */ "2. Come verde",
      /* 3 */ "3. Sin vicios",
      /* 4 */ "4. Balancea tus comidas",
      /* 5 */ "5. hacer ejercicio"};

    String vecTexto[]={
    /* 1 */ "Tomar mucha agua esto  ayudará a tu cuerpo a  desempeñar funciones vitales como la digestión, el transporte de nutrientes y la expulsión de desechos.",
    /* 2 */ "Los consejos de la Organización Mundial de la Salud indican que es recomendable comer 5 raciones de frutas y vegetales al día. Te aportan vitaminas, fibra y antioxidantes, y reducen la posibilidad de cáncer, tensión alta y enfermedades intestinales.",
    /* 3 */ "Fumar y beber alcohol acortan tu tiempo de vida y tienen efectos perjudiciales en la salud de tu hígado, corazón, estómago, piel y pulmones.",
    /* 4 */ "Llevar una dieta balanceada en la que incluyas alimentos de todo tipo es la mejor manera de garantizarle a tu cuerpo el combustible y nutrientes para mantenerse sano y ejecutar las actividades del día a día.",
    /* 5 */ "realizar actividad física 3 veces a la semana evita el riesgo de enfermedad cardiovascular, osteoporosis, diabetes; ayuda a bajar el colesterol y te hará sentirte llena de vitalidad."};

    int vecImg[]={
            R.mipmap.hidratacion,
            R.mipmap.comeverde,
            R.mipmap.vicio,
            R.mipmap.comebalanceado,
            R.mipmap.ejercicio};

    TextView Titulo,Texto;
    ImageView Img;
    Button BtnSiguiente;
    int variable=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);
        Titulo=(TextView)findViewById(R.id.TxtTitulo);
        Texto=(TextView)findViewById(R.id.TxtTexto);
        Img=(ImageView)findViewById(R.id.ImagenSalud);
        BtnSiguiente=(Button)findViewById(R.id.Siguiente);

        Titulo.setText(vecTitulo[0]);
        Texto.setText(vecTexto[0]);
        Img.setImageResource(vecImg[0]);

        BtnSiguiente.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        switch (variable){
            case 1:
                //Comer Verde
                Img.setImageResource(vecImg[1]);
                Titulo.setText(vecTitulo[1]+"\n");
                Texto.setText(vecTexto[1]+"\n");
                variable++;
                break;
            case 2:
                //Sin vicios
                Img.setImageResource(vecImg[2]);
                Titulo.setText(vecTitulo[2]+"\n");
                Texto.setText(vecTexto[2]+"\n");
                variable++;
                break;
            case 3:
                //Balance
                Img.setImageResource(vecImg[3]);
                Titulo.setText(vecTitulo[3]+"\n");
                Texto.setText(vecTexto[3]+"\n");
                variable++;
                break;
            case 4:
                //Ejercicio
                Img.setImageResource(vecImg[4]);
                Titulo.setText(vecTitulo[4]+"\n");
                Texto.setText(vecTexto[4]+"\n");
                variable++;
                break;
            case 5:
                Toast.makeText(this,"Gracias por mirar los 5 consejos",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(salud.this,Menu.class);
                startActivity(intent);
                break;

        }
    }
}
