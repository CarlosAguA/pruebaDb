package com.example.android.pruebadb;

import android.provider.BaseColumns;

/**
 * Created by Paviliondm4 on 5/14/2017.
 */

public class PruebaContract {

    public static abstract class PruebaEntry implements BaseColumns {

        public static final String TABLE_NAME = "footwear";
        //Complejos

        public static final String _ID = BaseColumns._ID ;
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_PRICE = "price" ;
        public static final String COLUMN_QUANTITY = "quantity";
        public static final  String COLUMN_EMAIL = "email";
        public static final  String COLUMN_PHONE = "phone";
        public static final  String COLUMN_WEBPAGE = "webpage";
        public static final  String COLUMN_SOLD = "sold" ;
        public static final String COLUMN_IMAGE = "image";

    }

}


