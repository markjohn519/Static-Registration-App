package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class home extends AppCompatActivity {

    public TextView setText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();
        String user = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        setText=findViewById(R.id.text);
        setText.setText(user);
    }
}