package com.example.baac.baacrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    //Explicit
    private UserTABLE objUserTABLE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create & Conncet Database
        creteAndConnceted(); //create Method


    }//Main Method

    private void creteAndConnceted() {
        objUserTABLE = new UserTABLE(this);

    }
}// Main Class