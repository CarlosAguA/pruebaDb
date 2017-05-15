package com.example.android.pruebadb;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Database helper that will provide us access to the database
     */
    private DataBaseHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayDatabaseInfo();


    }


    private void displayDatabaseInfo() {


        mDbHelper = new DataBaseHelper(this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        /* The projection means the columns the cursor object will return */
        String[] projection = {
                PruebaContract.PruebaEntry._ID,
                PruebaContract.PruebaEntry.COLUMN_NAME};

        /* Query method : Create cursor object for retrieving the row of the table */
        Cursor cursor = db.query(
                PruebaContract.PruebaEntry.TABLE_NAME,          // The table to query
                projection,                    // The columns to return
                null,
                null,
                null,
                null,
                null);

        // FindView TextView
        TextView displayView = (TextView) findViewById(R.id.text_view_footwear);
        // Try
        try {
        /* 1. Create header */
            displayView.setText("The pets table contains " + cursor.getCount() + " pets.\n\n");
            displayView.append(PruebaContract.PruebaEntry._ID
                    + "-" +  PruebaContract.PruebaEntry.COLUMN_NAME + "\n");

            int idColumnIndex = cursor.getColumnIndex(PruebaContract.PruebaEntry._ID);
            int nameColumnIndex = cursor.getColumnIndex( PruebaContract.PruebaEntry.COLUMN_NAME);

        /* Iterate until cursor.moveToNext() returns false */
            while (cursor.moveToNext()) {

                //Save the values form the individual db field in variables
                int currentID = cursor.getInt(idColumnIndex);
                String currentName = cursor.getString(nameColumnIndex);

                displayView.append(("\n"
                        + currentID + " - "
                        + currentName + " - "
                ) ) ;
            }

        } finally

        {

            cursor.close();
            // Finally
        }
    }

}


