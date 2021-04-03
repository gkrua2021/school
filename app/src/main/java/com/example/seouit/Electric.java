package com.example.seouit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Electric extends AppCompatActivity {



    TextView tv1;
    Button bt1;
    Button bt2;
    Button bt3;
    LinearLayout ll1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric);

        tv1=findViewById(R.id.tv1);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        ll1=findViewById(R.id.ll1);

        ll1.setVisibility(View.VISIBLE);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll1.setVisibility(View.INVISIBLE);
                tv1.setVisibility(View.VISIBLE);

                final String electricl1 = getString(R.string.electricl1);

                tv1.setText(electricl1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll1.setVisibility(View.INVISIBLE);
                tv1.setVisibility(View.VISIBLE);
                tv1.setTextSize(18);
                final String electricl2 = getString(R.string.electricl2);
                tv1.setText(electricl2);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
