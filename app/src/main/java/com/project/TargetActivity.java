package com.project;// окно с выбором категории

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TargetActivity extends MainActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.target);
        Button button11 = (Button)findViewById(R.id.button11);
        button11.setOnClickListener(this);
    }
    public void onClick(View view1) {
        Intent intent1 = new Intent(TargetActivity.this, smokingActivity.class);
        startActivity(intent1);

    }
}
