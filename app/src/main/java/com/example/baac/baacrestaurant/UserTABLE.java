package com.example.baac.baacrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by BAAC on 19-Oct-15.
 */
public class UserTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;


    public UserTABLE(Context context) {

        objMyOpenHelper = new MyOpenHelper(context); // inherit
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        writeSqLiteDatabase = objMyOpenHelper.getReadableDatabase();


    }// Constructor
}//Main Class
