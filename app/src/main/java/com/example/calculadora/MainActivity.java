package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnS, btnSu, btnMu, btnD, btnV, btnI, btnLimpa, btnBack;
    private TextView txt;
    private double v1,v2;
    private boolean add, sub, div, mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt_visor);
        btn0 = findViewById(R.id.bt_0);
        btn1 = findViewById(R.id.bt_1);
        btn2 = findViewById(R.id.bt_2);
        btn3 = findViewById(R.id.bt_3);
        btn4 = findViewById(R.id.bt_4);
        btn5 = findViewById(R.id.bt_5);
        btn6 = findViewById(R.id.bt_6);
        btn7 = findViewById(R.id.bt_7);
        btn8 = findViewById(R.id.bt_8);
        btn9 = findViewById(R.id.bt_9);
        btnS = findViewById(R.id.bt_soma);
        btnSu = findViewById(R.id.bt_subt);
        btnMu = findViewById(R.id.bt_multi);
        btnD = findViewById(R.id.bt_divi);
        btnV = findViewById(R.id.bt_ponto);
        btnI = findViewById(R.id.bt_igual);
        btnLimpa = findViewById(R.id.bt_limpar);
        btnBack = findViewById(R.id.bt_sair);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"1");

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"2");

            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString()+"3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"4");

            }
        });btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"5");

            }
        });btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"6");

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"8");

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"0");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"9");

            }
        });

        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt.getText().toString().contains(".")) {

                } else {
                    txt.setText(txt.getText() + ".");
                }
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(txt.getText() + "");
                add = true;
                txt.setText(null);
            }
        });

        btnSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(txt.getText() + "");
                sub = true;
                txt.setText(null);
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(txt.getText() + "");
                div = true;
                txt.setText(null);
            }
        });

        btnMu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(txt.getText() + "");
                mul = true;
                txt.setText(null);
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2 =  Double.parseDouble(txt.getText().toString());
                if(add==true){
                    txt.setText(v1+v2+"");
                    add = false;
                }
                if(sub==true){
                    txt.setText(v1-v2+"");
                    sub = false;
                }
                if(div==true){
                    txt.setText(v1/v2+"");
                    div = false;
                }
                if(mul==true){
                    txt.setText(v1*v2+"");
                    mul = false;
                }
            }
        });

        btnLimpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = txt.getText().toString();
                String sub_str = str.substring(0,str.length() - 1);
                txt.setText(sub_str);
            }
        });







    }

}
