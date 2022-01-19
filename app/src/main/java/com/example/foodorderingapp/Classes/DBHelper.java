package com.example.foodorderingapp.Classes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.foodorderingapp.ModelClasses.OrdersModelClass;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME="FoodDetails.db";

    public DBHelper(Context context) {
        super(context, DBNAME, null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        database.execSQL("CREATE TABLE foodDetailsTable (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "phoneNo TEXT," +
                "foodImage INTEGER," +
                "orderPrice INTEGER," +
                "orderNo INTEGER," +
                "foodName TEXT," +
                "quantity INTEGER," +
                "description TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS foodDetailsTable");
        onCreate(db);
    }

    public boolean insertData(String userName,String phoneNo,int image, int orderprice,
                               String orderedFoodName,String description,int quantity){

        SQLiteDatabase database=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",userName);
        contentValues.put("phoneNo",phoneNo);
        contentValues.put("foodImage",image);
        contentValues.put("orderPrice",orderprice);
        contentValues.put("foodName",orderedFoodName);
        contentValues.put("description",description);
        contentValues.put("quantity",quantity);


      long id=database.insert("foodDetailsTable",null,contentValues);

        if(id<=0){
            return false;
        }else{
            return true;
        }
    }

    public ArrayList<OrdersModelClass> getData(){

        SQLiteDatabase database=getReadableDatabase();


        Cursor cursor=database.rawQuery("SELECT foodImage,orderPrice,foodName,id,description FROM foodDetailsTable",null);

        ArrayList<OrdersModelClass> arrayList=new ArrayList<>();


            while (cursor.moveToNext()){

                OrdersModelClass model=new OrdersModelClass();

                model.setImage(cursor.getInt(0));
                model.setOrderprice(cursor.getLong(1)+"");
                model.setOrdersFoodName(cursor.getString(2));
                model.setOrderNumber(cursor.getInt(3)+"");

                arrayList.add(model);

            }

        return arrayList;
    }
    public Cursor getOrderedItemById(int id){
        SQLiteDatabase database=getReadableDatabase();

        Cursor cursor=database.rawQuery("SELECT * FROM foodDetailsTable WHERE id="+id,null);

        cursor.close();
        database.close();
        return cursor;
    }
}
