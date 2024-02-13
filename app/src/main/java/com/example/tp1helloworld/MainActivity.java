package com.example.tp1helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.tp1helloworld.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{


    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        TextView tv = new TextView(this);
        tv.setText("Salut tout le monde !");
        setContent View(tv);
//binding.hellotv.setText("oui")


        Log.d("MainActivity: ",
        "onCreate");

        //@Override
        //        private void onStart() {
        //            Log.d("MainActivity: ","onStart");
        //            }




    }

}