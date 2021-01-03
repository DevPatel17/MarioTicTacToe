//Name: Dev Patel
//Date: April 14, 2020

package com.example.mariotictactoe;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void toins(View view) {
        Intent i = new Intent(this, Instructions.class);
        startActivity(i);

    }
    public void togame(View view) {
        Intent g = new Intent(this, GameScreen.class);
        startActivity(g);

    }
}