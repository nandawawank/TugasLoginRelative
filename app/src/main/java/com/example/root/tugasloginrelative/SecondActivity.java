package com.example.root.tugasloginrelative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent tampil = getIntent();
        String user = tampil.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView username = (TextView) findViewById(R.id.username);
        username.setText(user);
    }
}
