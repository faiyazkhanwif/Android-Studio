package com.example.umnewsfeed171283972;
//171283972
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void NewsfeedClicked(View view){
        Intent RLAct = new Intent(this,ViewNewsFeed.class);
        startActivityForResult(RLAct,1);
    }
    public void feedClicked(View view){
        Intent RLAct = new Intent(this,SubmitFeedback.class);
        startActivityForResult(RLAct,1);
    }
}