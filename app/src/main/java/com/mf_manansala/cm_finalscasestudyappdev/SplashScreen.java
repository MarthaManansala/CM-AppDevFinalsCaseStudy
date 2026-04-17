package com.mf_manansala.cm_finalscasestudyappdev;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class SplashScreen extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        intent = new Intent(".MainActivity");

        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}