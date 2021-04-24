package com.project;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class smokingActivity extends TargetActivity {
    private EditText answer11;
    private EditText answer12;
    private EditText answer13;
    private EditText answer14;
    private EditText answer15;
    private EditText answer16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smoking);
        answer11 = (EditText) findViewById(R.id.answer11);
        answer12 = (EditText) findViewById(R.id.answer12);
        answer13 = (EditText) findViewById(R.id.answer13);
        answer14 = (EditText) findViewById(R.id.answer14);
        answer15 = (EditText) findViewById(R.id.answer15);
        answer16 = (EditText) findViewById(R.id.answer16);

    }
    public void FinishSmoke(View view2){
        String Answer11 = answer11.getText().toString();
        String Answer12 = answer12.getText().toString();
        String Answer13 = answer13.getText().toString();
        String Answer14 = answer14.getText().toString();
        String Answer15 = answer15.getText().toString();
        String Answer16 = answer16.getText().toString();
    }


    }
