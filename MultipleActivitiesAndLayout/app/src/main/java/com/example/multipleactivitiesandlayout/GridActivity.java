package com.example.multipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
        
    }
    public void GRDBackClicked(View view){
        finish();
    }




}