package com.example.fragmentviajava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                if (v == findViewById(R.id.btnpeng)){
                    fragment = new FragmentPenguin();
                } else {
                    fragment = new FragmentRabbit();
                }
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragoutput, fragment);
                transaction.commit();
            }
        };
        Button BtnPenguin = (Button)findViewById(R.id.btnpeng);
        BtnPenguin.setOnClickListener(listener);
        Button BtnRabbit = (Button)findViewById(R.id.btnrab);
        BtnRabbit.setOnClickListener(listener);

    }
}