package com.example.myprogressbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    int progrees ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBarId);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        thread.start();

    }
    public void doWork(){

        for (progrees=20; progrees<=100;progrees=progrees+20) {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progrees);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}