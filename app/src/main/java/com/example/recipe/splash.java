package com.example.recipe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class splash extends AppCompatActivity {
    public static int splash_timeout=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent (splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },splash_timeout);

    }
}
