package com.example.suza_calc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btngawa,btnzidisha,btnjumlisha,btnsawa,btntoa,btnfuta;
    EditText edl;
    float Res1,Res2;
    boolean gawa,zidisha,toa,jumlisha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btngawa = (Button) findViewById(R.id.btngawa);
        btnzidisha = (Button) findViewById(R.id.btnzidisha);
        btnjumlisha = (Button) findViewById(R.id.btnjumlisha);
        btnsawa = (Button) findViewById(R.id.btnsawa);
        btntoa = (Button) findViewById(R.id.btntoa);
        btnfuta = (Button) findViewById(R.id.btnfuta);
        edl = (EditText) findViewById(R.id.editText);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"8");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText()+"9");
            }
        });
//button za calculation
        btnjumlisha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edl==null){
                    edl.setText("");
                }else{
                    Res1=Float.parseFloat(edl.getText()+"");
                    jumlisha=true;
                    edl.setText(null);
                }
            }
        });

        btntoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edl==null){
                    edl.setText("");
                }else{
                    Res1=Float.parseFloat(edl.getText()+"");
                    toa=true;
                    edl.setText(null);
                }
            }
        });

        btngawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edl==null){
                    edl.setText("");
                }else{
                    Res1=Float.parseFloat(edl.getText()+"");
                    gawa=true;
                    edl.setText(null);
                }
            }
        });

        btnzidisha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edl==null){
                    edl.setText("");
                }else{
                    Res1=Float.parseFloat(edl.getText()+"");
                    zidisha=true;
                    edl.setText(null);
                }
            }
        });

        btnsawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Res2=Float.parseFloat(edl.getText()+"");

             if(jumlisha==true){
                edl.setText(Res1+Res2+"");
                jumlisha=false;
             }

                if(toa==true){
                    edl.setText(Res1 - Res2 +"");
                    toa=false;
                }

                if(zidisha=true){
                    edl.setText(Res1*Res2+"");
                    zidisha=false;
                }

                if(gawa=true){
                    edl.setText(Res1/Res2+"");
                    gawa=false;
                }
            }
        });

        //button ya kufuta

    btnfuta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edl.setText("");
        }
    });


    }
}