package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =  (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Log.w("Myapp", "MainActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("Myapp", "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("Myapp", "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("Myapp", "MainActivity onPaused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("Myapp", "MainActivity onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("Myapp", "MainActivity onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("Myapp", "MainActivity onDestroy");
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
            startActivity(browserIntent);
    }
}


