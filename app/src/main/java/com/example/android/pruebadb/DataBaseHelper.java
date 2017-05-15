package com.example.android.pruebadb;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by Paviliondm4 on 5/14/2017.
 */

public class DataBaseHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "clothes.db";
    private static final int DATABASE_VERSION = 1;


    public DataBaseHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }


}
