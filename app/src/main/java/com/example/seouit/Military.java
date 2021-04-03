package com.example.seouit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Military extends AppCompatActivity {

    public static final int Job = 1001;

    Button bt1, bt2, bt3;
    int a =0;
    Intent intent;

    ImageView lv1,lv2, lv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_military);

        lv1=findViewById(R.id.lv1);
        lv2=findViewById(R.id.lv2);
        lv3=findViewById(R.id.lv3);

        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);

        lv3.setVisibility(View.INVISIBLE);
        lv2.setVisibility(View.INVISIBLE);
        lv1.setVisibility(View.VISIBLE);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), Job.class);
                startActivityForResult(intent,Job);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a == 0){
                    lv1.setVisibility(View.INVISIBLE);
                    lv2.setVisibility(View.VISIBLE);
                    a++;
                }
                else if (a == 1){
                    lv2.setVisibility(View.INVISIBLE);
                    lv3.setVisibility(View.VISIBLE);
                    a++;
                }
                else if (a == 2){
                    lv3.setVisibility(View.INVISIBLE);
                    lv1.setVisibility(View.VISIBLE);
                    a = 0;
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
