package com.example.xianeri19.ericapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String TEST_MESSAGE = "guesswhatchickenbutt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToSecondActivity(View view) {

        Intent intentTeam = new Intent(this, SecondActivity.class);
        EditText teamNumInput = findViewById(R.id.teamNumInput);
        String teamNumber = teamNumInput.getText().toString();
        intentTeam.putExtra(EXTRA_MESSAGE, teamNumber);
        EditText launchNumInput = findViewById(R.id.launchNumInput);
        String launchNumber = launchNumInput.getText().toString();
        intentTeam.putExtra(TEST_MESSAGE, launchNumber);
        startActivity(intentTeam);

}
}
