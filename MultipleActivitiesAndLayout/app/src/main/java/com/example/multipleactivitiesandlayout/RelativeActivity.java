package com.example.multipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import javax.microedition.khronos.egl.EGLDisplay;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
    }
    public void RLBackClicked(View view){
        EditText ETName = (EditText)findViewById(R.id.ETname);
        Intent RTBackIntent = new Intent();
        RTBackIntent.putExtra("Name",ETName.getText().toString());
        setResult(RESULT_OK,RTBackIntent);
        finish();
    }
}