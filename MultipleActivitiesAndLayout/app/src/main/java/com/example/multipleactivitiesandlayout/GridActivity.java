package com.example.multipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class GridActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnmin,btnmul,btndiv,btndot,btnc,btneq;
    TextView tvinp,tvout;
    String process;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        btn0 = findViewById(R.id.zerobtn);
        btn1 = findViewById(R.id.onebtn);
        btn2 = findViewById(R.id.twobtn);
        btn3 = findViewById(R.id.threebtn);
        btn4 = findViewById(R.id.fourbtn);
        btn5 = findViewById(R.id.fivebtn);
        btn6 = findViewById(R.id.sixbtn);
        btn7 = findViewById(R.id.sevenbtn);
        btn8 = findViewById(R.id.eightbtn);
        btn9 = findViewById(R.id.ninebtn);

        btnadd = findViewById(R.id.addbtn);
        btnmin = findViewById(R.id.minbtn);
        btnmul = findViewById(R.id.multbtn);
        btndiv = findViewById(R.id.dvbtn);

        btndot = findViewById(R.id.dotbtn);
        btnc = findViewById(R.id.cbtn);
        btneq = findViewById(R.id.eqbtn);

        tvinp = findViewById(R.id.inpshow);
        tvout = findViewById(R.id.ans);

        btnc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvinp.setText("");
                tvout.setText("");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"9");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"+");
            }
        });
        btnmin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"−");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"×");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+".");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                tvinp.setText(process+"÷");
            }
        });

        btneq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                process = tvinp.getText().toString();
                process = process.replaceAll("×","*");
                process = process.replaceAll("÷","/");
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String finalresult = "";
                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalresult = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();
                }catch (Exception e){
                    finalresult="0";
                }

                tvout.setText(finalresult);
            }
        });


    }
    public void GRDBackClicked(View view){
        finish();
    }




}