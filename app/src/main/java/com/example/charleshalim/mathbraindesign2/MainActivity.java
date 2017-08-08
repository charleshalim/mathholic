package com.example.charleshalim.mathbraindesign2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void home (View view){
        Intent i=new Intent(MainActivity.this,Home.class);
        startActivity(i);
    }

    public void login (View view){
        Intent i=new Intent(MainActivity.this,Login.class);
        startActivity(i);
    }

    public void lobby (View view){
        Intent i=new Intent(MainActivity.this,Lobby.class);
        startActivity(i);
    }

    public void room (View view){
        Intent i=new Intent(MainActivity.this,Room.class);
        startActivity(i);
    }
}
