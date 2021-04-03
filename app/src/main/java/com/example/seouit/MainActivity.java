package com.example.seouit;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public static final int Electric=1001;
    public static final int Security=1001;
    public static final int Webcontent=1001;
    public static final int Mechanics=1001;
    public static final int map=1001;
    public static final int Facility = 1001;
    public static final int Military = 1001;
    public static final int PreWork = 1001;
    public static final int Chatbot = 1001;

    ImageButton bt1;
    ImageButton bt2;
    ImageButton bt3;
    ImageButton bt4;
    ImageButton bt5;
    ImageButton bt6;
    ImageButton bt7;
    Button bt8;
    Button bt9;
    Button bt10;
    Button bt11;
    Button bt12;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt5=findViewById(R.id.bt5);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);
        bt10=findViewById(R.id.bt10);
        bt11=findViewById(R.id.bt11);
        bt12=findViewById(R.id.bt12);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), Electric.class);
                startActivityForResult(intent,Electric);
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),Security.class);
                startActivityForResult(intent,Security);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), Webcontent.class);
                startActivityForResult(intent,Webcontent);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), Mechanics.class);
                startActivityForResult(intent,Mechanics);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://seoulit.sen.hs.kr/index.do"));
                startActivity(intent);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/channel/UCpcjGmF5x9Ib5kj-_Jsq7GQ"));
                startActivity(intent);
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.tiktok.com/@seoulit2020?lang=ko-KR"));
                startActivity(intent);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), Chatbot.class);
                startActivityForResult(intent,Chatbot);
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), Map.class);
                startActivityForResult(intent,map);
            }
        });

        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), Facility.class);
                startActivityForResult(intent,Facility);
            }
        });

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), Military.class);
                startActivityForResult(intent,Military);
            }
        });

        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), PreWork.class);
                startActivityForResult(intent,PreWork);
            }
        });








    }
}
