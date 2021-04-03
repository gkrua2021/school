package com.example.seouit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Chatbot extends AppCompatActivity {

    ScrollView sc1;
    TextView tv1;
    EditText et1;
    Button bt1;
    InputMethodManager imm;

    void keyboard(){
        et1.setText(null);
        hideKeyboard();
        sc1.fullScroll(View.FOCUS_DOWN);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);
        tv1=findViewById(R.id.tv1);
        et1=findViewById(R.id.et1);
        bt1=findViewById(R.id.bt1);
        sc1=findViewById(R.id.sc1);
        imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);


        final String main = getString(R.string.main);

        final String introduction = getString(R.string.introduction);
        final String specification = getString(R.string.specification);
        final String event = getString(R.string.event);
        final String numbers = getString(R.string.numbers);

        tv1.setText(main+"\n");

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().equals("1")){
                    tv1.append("");
                    tv1.append("\n"+introduction+"\n");
                }
                else if(et1.getText().toString().equals("2")){
                    tv1.append("\n"+specification+"\n");
                }
                else if(et1.getText().toString().equals("3")){
                    tv1.append("\n"+event+"\n");
                }
                else if(et1.getText().toString().equals("4")){
                    tv1.append("\n"+numbers+"\n");
                }
                else if(et1.getText().toString().equals("0")){
                    hideKeyboard();
                    finish();
                }
                else {
                    hideKeyboard();
                    Toast.makeText(getApplicationContext(),"알맞은 숫자를 입력해 주세요.", Toast.LENGTH_SHORT).show();
                }
                keyboard();
            }
        });
    }
    private void hideKeyboard()
    {
        imm.hideSoftInputFromWindow(et1.getWindowToken(), 0);
    }
}
