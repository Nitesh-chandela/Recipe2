package com.example.recipe;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class dbclass extends SQLiteOpenHelper {

    int image;
    String text;


    private static final int DATABASE_VERSION =11 ;
    private static final String DATABASE_NAME = "fav_db";
    public static final String TABLE_NAME = "myfav";
    public static final String COL1 = "id";
    public static final String COL2 = "IMAGE";
    public static final String COL3 = "txt";
    public static final String COL4 = "txt2";

    public dbclass(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //db.execSQL("CREATE TABLE " + TABLE_NAME + "(" + COL1 + " INTEGER PRIMARY KEY AUTOINCREMENT," + COL2 + " TEXT " + COL3 + " TEXT" )");
        db.execSQL("create table "+TABLE_NAME+" ("+COL1+" integer primary key autoincrement, "+COL2+
                " text, "+COL3+" text,  "+COL4+" text)");  //
        Log.i("DBCheck","onCreate");
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int ib) {
        db.execSQL("DROP TABLE "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertdata(String image, String text,String text_2)   //,
     {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COL2, image);
        values.put(COL3, text);
        values.put(COL4,text_2);

        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + COL2 + " = '" + image + "' and "+COL3 + " = '" + text+ "' and "+COL4 + " = '" + text_2+"'", null);  //"' and"++
        if (res.getCount() > 0) {
            return false;
        }
        else {
            long result = db.insert(TABLE_NAME, null,values);
            if (result == -1){
                return false;
            } else {
                return true;
            }
        }

    }


    public  Cursor getalldata() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return res;
    }

    public Cursor getimage(int image, String text,String text_2)    //
    {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor res = database.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + COL2 + " = '" +image+"' AND "+COL3+" = '"+text +"' and "+COL4+" = '"+text_2+"'", null);  //"' AND "+
        return res;
    }


    public int delete(int image) {
        SQLiteDatabase db = this.getWritableDatabase();
        int res=db.delete(TABLE_NAME,COL2+"="+image,null);
        return res;

    }

}