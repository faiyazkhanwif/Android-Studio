package com.example.multipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void RelativeLayoutClicked(View view){
        Intent RLAct = new Intent(this,RelativeActivity.class);
        startActivityForResult(RLAct,1);
    }
    public void ConstraintLayoutClicked(View view){
        Intent CNSAct = new Intent(this,ConstraintActivity.class);
        startActivityForResult(CNSAct,1);
    }
    public void onActivityResult(int requestcode,int resultcode,Intent data){
        super.onActivityResult(requestcode,resultcode,data);
        if (requestcode==1){
            if (resultcode==RESULT_OK){
                String strName = data.getStringExtra("Name");
                Toast.makeText(getApplicationContext(),"Welcome Back, "+strName+"!",Toast.LENGTH_LONG).show();
            }
        }
    }
}