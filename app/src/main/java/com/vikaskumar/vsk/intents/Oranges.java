package com.vikaskumar.vsk.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Oranges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oranges);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Apples.class);
        startActivity(i);
    }

}
