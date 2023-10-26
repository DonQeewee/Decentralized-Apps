package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.assignment1.databinding.ActivityWelcomePageBinding;

public class Welcome_page extends AppCompatActivity {


    //the java page is also binded with the UI as was in the case in the first activity.
    ActivityWelcomePageBinding myBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myBind = ActivityWelcomePageBinding.inflate(getLayoutInflater());
        setContentView(myBind.getRoot());


        //The extra sent from the first page is hereby accepted.

        Intent intent = getIntent();
        String output = intent.getStringExtra("greeting");

        myBind.welcome.setText((output));

        /*Setting an OnClickListener for the back button and setting intent for
        it to go back to the previous page.*/

        myBind.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}