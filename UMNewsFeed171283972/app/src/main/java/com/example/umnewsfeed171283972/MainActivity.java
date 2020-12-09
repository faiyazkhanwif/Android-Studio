package com.example.umnewsfeed171283972;
//171283972
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void LoginClicked(View view){
        Intent RLAct = new Intent(this,MainMenu.class);
        startActivityForResult(RLAct,1);
    }
}