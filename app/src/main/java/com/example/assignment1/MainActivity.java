package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.assignment1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    //Binding the activity page to the java page after binding has been enabled in the gradle scripts.

   ActivityMainBinding myBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myBind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(myBind.getRoot());

        /*Setting an OnClickListener for id btn to enable it perform a task when it is clicked.
        also creating 2 string variables for the first and last names and assigning values gotten
        from the text edited by the front end user. I also created a welcome message by
        concatenating the first and last names with a short message preceding them
        All these are passed onto the next page by adding them as extra to the intent*/

        myBind.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String fname = myBind.fname.getText().toString();
                final String lname = myBind.lname.getText().toString();
                String greeting = "You are welcome, " + fname + " " + lname;
                Intent intent = new Intent(getApplicationContext(), Welcome_page.class);
                intent.putExtra("greeting", greeting);
                startActivity(intent);
            }
        });


    }
}