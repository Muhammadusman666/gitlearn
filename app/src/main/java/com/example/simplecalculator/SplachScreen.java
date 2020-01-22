package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplachScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);

        Thread td =new Thread(){
            public void run () {
                try {
                    sleep(3000);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    Intent it =new Intent(SplachScreen.this ,MainActivity.class);
                    startActivity(it);
                }
            }
        };
        td.start();
    }
}


