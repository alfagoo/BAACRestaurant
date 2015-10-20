package com.example.baac.baacrestaurant;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    //Explicit
    private UserTABLE objUserTABLE;
    private FoodTABLE objFoodTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create & Conncet Database
        creteAndConnceted(); //create Method

        //Tester Add New Value
        //testerAdd();

        deleteAllSQLite();

    }//Main Method

    private void deleteAllSQLite() {

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase("BAAC.db", MODE_PRIVATE, null);
        objSqLiteDatabase.delete("userTABLE", null, null);
        objSqLiteDatabase.delete("foodTABLE", null, null);

    }

    private  void testerAdd() {

        objUserTABLE.addNewUser("test","password", "ทดสอบชื่อภาษาไทย");
        objFoodTABLE.addNewFood("อาหาร", "testSource", "123");
    }

    private void creteAndConnceted() {
        objUserTABLE = new UserTABLE(this);
        objFoodTABLE = new FoodTABLE(this);

    }
}// Main Class