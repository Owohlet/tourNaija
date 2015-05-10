package com.iykeowoh.tournaija;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by iykeowoh on 4/28/15.
 */
public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openStartingPoint = new Intent(Splash.this, MainActivity.class);
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
