package com.example.nithra;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper {

    public static String DB_PATH = "/data/data/com.example.nithra/databases/";
    private static String DB_NAME = "NITHRA.db";
    private SQLiteDatabase myDataBase;
    private final Context myContext;
    private SQLiteOpenHelper sqLiteOpenHelper;

    // Table name in the database.
    public static final String Employee = "Employee";

    public DbHelper(Context context) {
        super(context, DB_NAME, null, 1);
        this.myContext = context;
        DB_PATH = myContext.getDatabasePath(DB_NAME).toString();
    }

    public DbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, Context myContext) {
        super(context, name, factory, version);
        this.myContext = myContext;
    }

    public void createDataBase()
            throws IOException {

        boolean dbExist = checkDataBase();

        if (dbExist) {
            // do nothing - database already exist
        } else {

            this.getWritableDatabase();
            try {
                copyDataBase();
            } catch (IOException e) {
                throw new Error(
                        "Error copying database");
            }
        }
    }

    private boolean checkDataBase() {
        SQLiteDatabase checkDB = null;
        try {
            String myPath = DB_PATH;
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
        } catch (SQLiteException e) {

            // database doesn't exist yet.
            Log.e("message", "" + e);

        }
        if (checkDB != null) {
            checkDB.close();
        }
        return checkDB != null;
    }

    private void copyDataBase()
            throws IOException {
        InputStream myInput
                = myContext.getAssets()
                .open(DB_NAME);
        String outFileName = DB_PATH;
        OutputStream myOutput = new FileOutputStream(outFileName);


        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }

        // Close the streams
        myOutput.flush();
        myOutput.close();
        myInput.close();
    }

    public void openDataBase()
            throws SQLException {
        // Open the database
        String myPath = DB_PATH;
        myDataBase = SQLiteDatabase
                .openDatabase(
                        myPath, null,
                        SQLiteDatabase.OPEN_READONLY);
    }

    @Override
    public synchronized void close() {
        // close the database.
        if (myDataBase != null)
            myDataBase.close();
        super.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db,
                          int oldVersion,
                          int newVersion) {
    }

    public List<list> getData(
            Activity activity) {
        sqLiteOpenHelper = new DbHelper(activity);
        SQLiteDatabase db = sqLiteOpenHelper.getWritableDatabase();

        List<list> listnew = new ArrayList<>();
        //String query = "select * from Employee where Team NOT IN ('Chief Executive Officer','Director','Chief Technology Officer' )";
        String query = "select DISTINCT Team from Employee where Team = 'Program and Product Management'";

        Cursor cursor = db.rawQuery(query, null);
        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            System.out.println(" result view :" + cursor);
            list listnew1 = new list();

           /* listnew1.setEmployee_code(cursor.getInt(cursor.getColumnIndexOrThrow("Employee_Code")));
            listnew1.setName(cursor.getString(cursor.getColumnIndexOrThrow("Name")));
            listnew1.setDesignation(cursor.getString(cursor.getColumnIndexOrThrow("Designation")));
           listnew1.setDob(cursor.getInt(cursor.getColumnIndexOrThrow("DOB")));
           listnew1.setJoining(cursor.getInt(cursor.getColumnIndexOrThrow("Joining")));
           listnew1.setMobile(cursor.getInt(cursor.getColumnIndexOrThrow("Mobile")));*/
            listnew1.setTeam(cursor.getString(cursor.getColumnIndexOrThrow("Team")));
            listnew.add(listnew1);
        }
        db.close();
        return listnew;
    }

    public List<list> getName(
            Activity activity, String name) {
        System.out.println("result====" + name);
        sqLiteOpenHelper = new DbHelper(activity);
        SQLiteDatabase db = sqLiteOpenHelper.getWritableDatabase();

        List<list> listname = new ArrayList<>();

        String query = "SELECT * FROM Employee WHERE Team= '" + name + "' ";

        Cursor cursor = db.rawQuery(query, null);

        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            System.out.println(" result view :" + cursor.getString(cursor.getColumnIndexOrThrow("Employee_Code")));
            System.out.println(" result view :" + cursor.getString(cursor.getColumnIndexOrThrow("Name")));
            list listname1 = new list();

            listname1.setEmployee_code(cursor.getString(cursor.getColumnIndexOrThrow("Employee_Code")));
            listname1.setName(cursor.getString(cursor.getColumnIndexOrThrow("Name")));
            listname1.setTeam(cursor.getString(cursor.getColumnIndexOrThrow("Team")));
            listname1.setDesignation(cursor.getString(cursor.getColumnIndexOrThrow("Designation")));
            listname1.setDob(cursor.getString(cursor.getColumnIndexOrThrow("DOB")));
            listname1.setJoining(cursor.getString(cursor.getColumnIndexOrThrow("Joining")));
            listname1.setMobile(cursor.getString(cursor.getColumnIndexOrThrow("Mobile")));
            listname1.setFirstapp(cursor.getString(cursor.getColumnIndexOrThrow("Firstapp")));
            listname.add(listname1);
        }
        db.close();
        return listname;
    }

}

