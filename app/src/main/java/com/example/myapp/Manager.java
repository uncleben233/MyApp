package com.example.myapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private  DBhelper dbHelper;
    private String TBNAME;
    public Manager(Context context){
        dbHelper=new DBhelper(context);
        TBNAME=DBhelper.TB_NAME;
    }
    public void deleteAll(){
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        db.delete(TBNAME,null,null);
        db.close();
    }
    public void add(Item item){
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("WIDTH",item.getWIDTH());
        values.put("HIGHT",item.getHIGHT());
        values.put("CONTENT",item.getCONTENT());
        db.insert(TBNAME,null,values);
        db.close();


    }
    public List<Item> ListAll() {
        List<Item> list = null;
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query(TBNAME, null, null, null, null, null, null);
        if (cursor != null) {
            list = new ArrayList<Item>();
            while (cursor.moveToNext()) {
                Item item = new Item();
                item.setId(cursor.getInt(cursor.getColumnIndex("ID")));
                item.setWIDTH(cursor.getInt(cursor.getColumnIndex("WIDTH")));
                item.setHIGHT(cursor.getInt(cursor.getColumnIndex("HIGHT")));
                item.setCONTENT(cursor.getString(cursor.getColumnIndex("CONTENT")));
                list.add(item);

            }
            cursor.close();

        }

        db.close();
        return list;

    }

}
