//Name: Dev Patel
//Date: April 14, 2020

package com.example.mariotictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
    }

    public void tosplash(View view) {
        Intent s = new Intent(this, MainActivity.class);
        startActivity(s);

    }
}