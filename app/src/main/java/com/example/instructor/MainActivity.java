package com.example.instructor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar1;
    private int CurrentProgress1=45;
    private ProgressBar progressBar2;
    private int CurrentProgress2=30;
    private ProgressBar progressBar3;
    private int CurrentProgress3=30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar1=findViewById(R.id.progressBar);
        progressBar1.setProgress(CurrentProgress1);
        progressBar1= findViewById(R.id.progressBar1);
        progressBar1.setProgress(CurrentProgress2);
        progressBar1=findViewById(R.id.progressBar2);
        progressBar1.setProgress(CurrentProgress3);
    }
}

