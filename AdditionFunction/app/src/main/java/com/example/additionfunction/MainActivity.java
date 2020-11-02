package com.example.additionfunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Addition(View view){
        EditText etnum1 = (EditText)findViewById(R.id.et1);
        EditText etnum2 = (EditText)findViewById(R.id.et2);
        TextView tvres = (TextView)findViewById(R.id.tv2);
        TextView tvheadres = (TextView)findViewById(R.id.tv3);
        tvheadres.setText("Result: ");
        int result = Integer.parseInt(etnum1.getText().toString()) + Integer.parseInt(etnum2.getText().toString());
        tvres.setText(Integer.toString(result));

    }
}