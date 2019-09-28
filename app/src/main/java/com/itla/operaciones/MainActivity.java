package com.itla.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;

    Button btnRes,btnMul,btnDiv,btnSum,btnResul,btnPorc,btnPun,btnEli;

    TextView txtResult;

    String agregar,operacion,ultioperador;
    double resumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* -- NUMEROS -- */
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);

        /* -- OPERADORES -- */
        btnSum = findViewById(R.id.btnSum);
        btnRes = findViewById(R.id.btnRes);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnResul = findViewById(R.id.btnResul);
        btnPorc = findViewById(R.id.btnPorc);
        btnPun = findViewById(R.id.btnPun);
        btnEli = findViewById(R.id.btnEli);

        /* -- CAJA DE RESULTADO -- */
        txtResult = findViewById(R.id.txtResul);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += "1";
                txtResult.setText(agregar);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += "2";
                txtResult.setText(agregar);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += "3";
                txtResult.setText(agregar);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += "4";
                txtResult.setText(agregar);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += "5";
                txtResult.setText(agregar);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += "6";
                txtResult.setText(agregar);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += "7";
                txtResult.setText(agregar);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += "8";
                txtResult.setText(agregar);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += "9";
                txtResult.setText(agregar);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += "0";
                txtResult.setText(agregar);
            }
        });

        btnPun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                agregar = txtResult.getText().toString();
                agregar += agregar != "" && !agregar.contains(".") ? "." : "";
                txtResult.setText(agregar);
            }
        });

        btnEli.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtResult.setText("");
            }
        });


        /* -- OPERACIONES -- */

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "multi";

                if(ultioperador!=""){
                    return;
                }
                ultioperador = operacion;
                resumo += Double.parseDouble(txtResult.getText().toString());
                txtResult.setText("");
            }
        });


        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "resta";
                if(ultioperador!=""){
                    return;
                }
                ultioperador = operacion;
                resumo += Double.parseDouble(txtResult.getText().toString());
                txtResult.setText("");



            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "divi";
                if(ultioperador!=""){
                    return;
                }
                ultioperador = operacion;
                resumo += Double.parseDouble(txtResult.getText().toString());
                txtResult.setText("");
            }
        });

        btnPorc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "porc";
                if(ultioperador!=""){
                    return;
                }
                ultioperador = operacion;
                resumo = Double.parseDouble(txtResult.getText().toString());
                txtResult.setText("");
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion = "suma";
                if(ultioperador!=""){
                    return;
                }
                ultioperador = operacion;
                resumo += Double.parseDouble(txtResult.getText().toString());
                txtResult.setText("");
            }
        });


        btnResul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operacion){
                    case "multi":
                        resumo = resumo * (Double.parseDouble(txtResult.getText().toString()));
                        txtResult.setText(String.valueOf(resumo));
                        resumo = 0;
                        break;
                    case "resta":
                        resumo = resumo - (Double.parseDouble(txtResult.getText().toString()));
                        txtResult.setText(String.valueOf(resumo));
                        resumo = 0;
                        break;
                    case "divi":
                        resumo = resumo / (Double.parseDouble(txtResult.getText().toString()));
                        txtResult.setText(String.valueOf(resumo));
                        resumo = 0;
                        break;
                    case "porc":
                        resumo = (Double.parseDouble(txtResult.getText().toString()) * resumo) / 100;
                        txtResult.setText(String.valueOf(resumo));
                        resumo = 0;
                    case "suma":
                        resumo = Double.parseDouble(txtResult.getText().toString()) + resumo;
                        txtResult.setText(String.valueOf(resumo));
                        resumo = 0;
                }
                ultioperador = "";
            }


        });



    }



}
