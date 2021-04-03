package com.example.seouit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Facility extends AppCompatActivity {

    Button bt1;

    int images[] ={
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g,
            R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l};

    ViewFlipper vf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);

        vf1 = findViewById(R.id.vf1);
        bt1=findViewById(R.id.bt1);

        for(int image : images){
            fllipperImages(image);
        }


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
    public void fllipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        vf1.addView(imageView);
        vf1.setFlipInterval(2500);
        vf1.setAutoStart(true);

        vf1.setInAnimation(this,android.R.anim.slide_in_left);
        vf1.setOutAnimation(this,android.R.anim.slide_out_right);
    }



}
