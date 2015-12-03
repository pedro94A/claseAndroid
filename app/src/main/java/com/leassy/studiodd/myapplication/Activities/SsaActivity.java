package com.leassy.studiodd.myapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.WindowManager;

import com.leassy.studiodd.myapplication.R;

public class SsaActivity extends Activity {
    Thread tiempo = new Thread(){
        public void run(){
            try{sleep(3000);} catch (Exception e){}
            finally {
                Intent i= new Intent(getApplicationContext(), MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                finish();
            }
        }
    }  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ssa);
        tiempo.start();
    }

}
