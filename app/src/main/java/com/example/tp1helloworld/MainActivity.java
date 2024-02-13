package com.example.tp1helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        //

        Log.d("MainActivity: ",
        "onCreate");

        //@Override
        //        private void onStart() {
        //            Log.d("MainActivity: ","onStart");
        //            }




    }

}