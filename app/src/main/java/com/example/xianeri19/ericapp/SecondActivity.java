package com.example.xianeri19.ericapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String teamNumber = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String launchNumber = intent.getStringExtra(MainActivity.TEST_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView text = findViewById(R.id.textDisplay);
        text.setText("Team " +teamNumber + "'s Launch #" + launchNumber);
    }

}
