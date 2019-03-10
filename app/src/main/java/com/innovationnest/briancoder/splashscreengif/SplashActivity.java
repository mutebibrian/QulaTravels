package com.innovationnest.briancoder.splashscreengif;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.innovationnest.briancoder.splashscreengif.HomeActivity;
import com.innovationnest.briancoder.splashscreengif.R;


public class SplashActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  // Need full screen without title bars for splash screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_splash);
        Thread t = new Thread(){
            public void run(){
                try {
                    Thread.sleep(8000);  // change the time according to your needs(its in milliseconds)
                    Intent i = new Intent(getApplicationContext(),HomeActivity.class);     // change the activity you want to load
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}