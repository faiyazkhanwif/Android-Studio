package com.example.colorselection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getActionBar().setTitle(Html.fromHtml("<font color='#FF000000'>ActionBarTitle </font>"));
    }
    public void colorfunction(View view){
        CheckBox ch1,ch2,ch3;
        Button btn1;
        ch1 = (CheckBox)findViewById(R.id.rb1);
        ch2 = (CheckBox)findViewById(R.id.rb2);
        ch3 = (CheckBox)findViewById(R.id.rb3);
        btn1 = (Button)findViewById(R.id.btn1);
        if (ch1.isChecked() && !ch2.isChecked() && !ch3.isChecked()){
            Toast.makeText(getApplicationContext(),"You selected RED!",Toast.LENGTH_SHORT).show();
        }else if (!ch1.isChecked() && ch2.isChecked() && !ch3.isChecked()){
            Toast.makeText(getApplicationContext(),"You selected GREEN!",Toast.LENGTH_SHORT).show();
        }else if (!ch1.isChecked() && !ch2.isChecked() && ch3.isChecked()) {
            Toast.makeText(getApplicationContext(), "You selected BLUE!", Toast.LENGTH_SHORT).show();
        }else if (ch1.isChecked() && ch2.isChecked() && !ch3.isChecked()) {
            Toast.makeText(getApplicationContext(), "You selected RED and GREEN!", Toast.LENGTH_SHORT).show();
        }else if (ch1.isChecked() && ch3.isChecked() && !ch2.isChecked()) {
            Toast.makeText(getApplicationContext(), "You selected RED and BLUE!", Toast.LENGTH_SHORT).show();
        }else if (ch2.isChecked() && ch3.isChecked() && !ch1.isChecked()) {
            Toast.makeText(getApplicationContext(), "You selected GREEN and BLUE!", Toast.LENGTH_SHORT).show();
        }else if (ch1.isChecked() && ch2.isChecked() && ch3.isChecked()) {
            Toast.makeText(getApplicationContext(), "You selected RED, GREEN and BLUE!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "You have no colors.", Toast.LENGTH_LONG).show();
        }
    }
}