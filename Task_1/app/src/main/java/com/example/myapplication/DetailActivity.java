package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Log.w("Myapp", "DetailActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("Myapp", "DetailActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("Myapp", "DetailActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("Myapp", "DetailActivity onPaused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("Myapp", "DetailActivity onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("Myapp", "DetailActivity onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("Myapp", "DetailActivity onDestroy");
    }




}