package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodorderingapp.AdapterClasses.OrdersAdapterClass;
import com.example.foodorderingapp.Classes.DBHelper;
import com.example.foodorderingapp.ModelClasses.OrdersModelClass;

import java.util.ArrayList;

public class OrdersActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        setTitle("Your Orders");

        recyclerView=findViewById(R.id.ordersrecyclerviewid);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DBHelper dbHelper=new DBHelper(this);

        ArrayList<OrdersModelClass> arrayList=dbHelper.getData();
        OrdersAdapterClass adapterClass=new OrdersAdapterClass(arrayList,this);

        recyclerView.setAdapter(adapterClass);




    }
}