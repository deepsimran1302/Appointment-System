package com.example.project_pranav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                finish();
                startActivity(new Intent(MainActivity.this, LoginPage.class));
            }
        };
        Timer opening =new Timer();
    opening.schedule(task,2500);
    }


}