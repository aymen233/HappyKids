package com.example.happykids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SignupActivity extends AppCompatActivity {
    ImageView imgBack;
    Button valider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        imgBack=findViewById(R.id.img_back);
        valider=findViewById(R.id.submit_button);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onBackPressed();}
        });
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}