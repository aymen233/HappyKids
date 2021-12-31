package com.example.happykids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColorActivity extends AppCompatActivity {
    List<Color> c ;
    Button Btn1,Btn2,Btn3;
    Color red, blue, green;
    Integer i;
    Color col;
    LinearLayout Ll;
    TextView Tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        Tv=findViewById(R.id.res);
        Btn1=findViewById(R.id.Btn1);
        Btn2=findViewById(R.id.Btn2);
        Btn3=findViewById(R.id.Btn3);
        Ll=findViewById(R.id.color);
        red=new Color(0xFFe01b1b,"red");
        blue=new Color(0xFF4287f5,"blue");
        green=new Color(0xFF14f50c,"green");
        c= new ArrayList<>() ;
        c.add(red);
        c.add(blue);
        c.add(green);
        i= new Random().nextInt(3);
        col=c.get(i);
        Ll.setBackgroundColor((col.getId()));
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (col.getNom()=="red") {
                    Tv.setTextColor(0xFF14f50c);
                    Tv.setText("bravo ! ");
                } else {
                    Tv.setTextColor(0xFFe01b1b);
                    Tv.setText("try again");
                    }
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (col.getNom()=="blue") {
                    Tv.setTextColor(0xFF14f50c);
                    Tv.setText("bravo");
                } else {
                    Tv.setTextColor(0xFFe01b1b);
                    Tv.setText("try again");
                    }
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (col.getNom()=="green") {
                    Tv.setTextColor(0xFF14f50c);
                    Tv.setText("Bravo");
                } else {
                    Tv.setTextColor(0xFFe01b1b);
                    Tv.setText("Try again");
                    }
            }
        });
    }

}