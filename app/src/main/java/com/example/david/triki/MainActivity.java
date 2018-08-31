package com.example.david.triki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int turno, contador, conta=0;
    EditText Edt_1;
    Button Btn_1,Btn_2,Btn_3,Btn_4,Btn_5,Btn_6,Btn_7,Btn_8,Btn_9,Btn_Salir,Btn_Reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        Edt_1 = findViewById(R.id.Edt_1);

        Btn_1 = findViewById(R.id.Btn_1);
        Btn_2 = findViewById(R.id.Btn_2);
        Btn_3 = findViewById(R.id.Btn_3);
        Btn_4 = findViewById(R.id.Btn_4);
        Btn_5 = findViewById(R.id.Btn_5);
        Btn_6 = findViewById(R.id.Btn_6);
        Btn_7 = findViewById(R.id.Btn_7);
        Btn_8 = findViewById(R.id.Btn_8);
        Btn_9 = findViewById(R.id.Btn_9);
        Btn_Salir=findViewById(R.id.Btn_Salir);
        Btn_Reset =findViewById(R.id.Btn_Reset);


        Btn_1.setOnClickListener(this);
        Btn_2.setOnClickListener(this);
        Btn_3.setOnClickListener(this);
        Btn_4.setOnClickListener(this);
        Btn_5.setOnClickListener(this);
        Btn_6.setOnClickListener(this);
        Btn_7.setOnClickListener(this);
        Btn_8.setOnClickListener(this);
        Btn_9.setOnClickListener(this);
        Btn_Salir.setOnClickListener(this);
        Btn_Reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        contador++;
        turno = contador % 2;

        if(turno == 0){
            imprimirXO ("X", v);
        }
        else {
            imprimirXO ("O", v);
        }

    }

    private void imprimirXO(String j, View v){
        if(v.getId() == R.id.Btn_Reset){
            resetear();
        }
        else if(v.getId() == R.id.Btn_Salir){
            System.exit(0);
        }
        if(v.getId() == R.id.Btn_1) {
            Btn_1.setText(j);
            Btn_1.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_2) {
            Btn_2.setText(j);
            Btn_2.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_3) {
            Btn_3.setText(j);
            Btn_3.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_4){
            Btn_4.setText(j);
            Btn_4.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_5){
            Btn_5.setText(j);
            Btn_5.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_6){
            Btn_6.setText(j);
            Btn_6.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_7){
            Btn_7.setText(j);
            Btn_7.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_8){
            Btn_8.setText(j);
            Btn_8.setEnabled(false);
        }
        else{
            Btn_9.setText(j);
            Btn_9.setEnabled(false);
        }
        Ganador(j);
    }

    private void Ganador(String letra){

        if(Btn_1.getText().toString().equals(letra+"") && (Btn_2.getText().toString().equals(letra+"")) && (Btn_3.getText().toString().equals(letra+""))){
            Edt_1.setText("El ganador es "+letra);
            deshabilitar();

        }else if(Btn_4.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"")) && (Btn_6.getText().toString().equals(letra+""))){
            Edt_1.setText("El ganador es "+letra);
            deshabilitar();

        }else if(Btn_7.getText().toString().equals(letra+"") && (Btn_8.getText().toString().equals(letra+"")) && (Btn_9.getText().toString().equals(letra+""))){
            Edt_1.setText("El ganador es "+letra);
            deshabilitar();

        }else if(Btn_1.getText().toString().equals(letra+"") && (Btn_4.getText().toString().equals(letra+"")) && (Btn_7.getText().toString().equals(letra+""))){
            Edt_1.setText("El ganador es "+letra);
            deshabilitar();

        }else if(Btn_2.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"")) && (Btn_8.getText().toString().equals(letra+""))){
            Edt_1.setText("El ganador es "+letra);
            deshabilitar();

        }else if(Btn_3.getText().toString().equals(letra+"") && (Btn_6.getText().toString().equals(letra+"")) && (Btn_9.getText().toString().equals(letra+""))){
            Edt_1.setText("El ganador es "+letra);
            deshabilitar();

        }else if(Btn_1.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"")) && (Btn_9.getText().toString().equals(letra+""))){
            Edt_1.setText("El ganador es "+letra);
            deshabilitar();

        }else if(Btn_3.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"")) && (Btn_7.getText().toString().equals(letra+""))){
            Edt_1.setText("El ganador es "+letra);
            deshabilitar();

        }else if(conta<9){
            conta++;
        }else {
            Edt_1.setText("Empate");
            deshabilitar();
        }
    }

    protected void deshabilitar(){
        Edt_1.setEnabled(false);
        Btn_1.setEnabled(false);
        Btn_2.setEnabled(false);
        Btn_4.setEnabled(false);
        Btn_6.setEnabled(false);
        Btn_8.setEnabled(false);
        Btn_9.setEnabled(false);
    }

    protected void resetear(){
        Edt_1.setEnabled(true);
        Edt_1.setText("");

        Btn_1.setEnabled(true);
        Btn_1.setText("");

        Btn_2.setEnabled(true);
        Btn_2.setText("");

        Btn_3.setEnabled(true);
        Btn_3.setText("");

        Btn_4.setEnabled(true);
        Btn_4.setText("");

        Btn_5.setEnabled(true);
        Btn_5.setText("");

        Btn_6.setEnabled(true);
        Btn_6.setText("");

        Btn_7.setEnabled(true);
        Btn_7.setText("");

        Btn_8.setEnabled(true);
        Btn_8.setText("");

        Btn_9.setEnabled(true);
        Btn_9.setText("");
    }
}
