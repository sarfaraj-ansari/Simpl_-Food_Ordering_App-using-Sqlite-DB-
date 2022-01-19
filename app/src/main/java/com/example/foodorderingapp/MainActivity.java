package com.example.foodorderingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.foodorderingapp.AdapterClasses.MainAdapterClass;
import com.example.foodorderingapp.ModelClasses.MainModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
   // ArrayList<MainModelClass> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Order your favourite food");

        recyclerView=findViewById(R.id.recyclerviewid);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


       ArrayList<MainModelClass> arrayList=new ArrayList<>();

        MainAdapterClass mainAdapterClass=new MainAdapterClass(arrayList,this);
        recyclerView.setAdapter(mainAdapterClass);

        MainModelClass model1=new MainModelClass(R.drawable.burger_with_fries,"120",
                getString(R.string.burger_with_fries), "Burger with fries");
        arrayList.add(model1);

        MainModelClass model2=new MainModelClass(R.drawable.cheeseburger,"150",
                getString(R.string.cheese_burger), "cheese burger");
        arrayList.add(model2);

        MainModelClass model3=new MainModelClass(R.drawable.chicken_biryani,"160",
                getString(R.string.chicken_biryani), "Chicken biryani");
        arrayList.add(model3);

        MainModelClass model4=new MainModelClass(R.drawable.chicken_chilli,"90",
                getString(R.string.chilli_chicken), "chicken chilli");
        arrayList.add(model4);

        MainModelClass model5=new MainModelClass(R.drawable.chicken_dosa,"80",
                getString(R.string.chicken_dosa), "Chicken dosa");
        arrayList.add(model5);

        MainModelClass model6=new MainModelClass(R.drawable.chicken_fries,"120",
                getString(R.string.chicken_fries), "Chicken Wings");
        arrayList.add(model6);

        MainModelClass model7=new MainModelClass(R.drawable.cold_cofee_milkshake,"70",
                getString(R.string.coldcoffe_milkshake), "cold coffee milk shake");
        arrayList.add(model7);

        MainModelClass model8=new MainModelClass(R.drawable.cold_coffee,"60",
                getString(R.string.cold_coffee), "cold coffee");
        arrayList.add(model8);

        MainModelClass model9=new MainModelClass(R.drawable.egg_chowmein,"50",
                getString(R.string.egg_chowmein), "Egg Chow mein");
        arrayList.add(model9);

        MainModelClass model10=new MainModelClass(R.drawable.egg_roll,"35",
                getString(R.string.egg_roll), "egg roll");
        arrayList.add(model10);

        MainModelClass model11=new MainModelClass(R.drawable.fried_rice,"70",
                getString(R.string.fried_rice), "fried rice");
        arrayList.add(model11);

        MainModelClass model12=new MainModelClass(R.drawable.fried_rice_with_chillichicken,"190",
                getString(R.string.fried_rice_with_chilli), "fried rice with chilli chicken");
        arrayList.add(model12);

        MainModelClass model13=new MainModelClass(R.drawable.fries,"40",
                getString(R.string.fries), "fries");
        arrayList.add(model13);

        MainModelClass model14=new MainModelClass(R.drawable.hamburger,"60",
                getString(R.string.hamburger), "hamburger");
        arrayList.add(model14);

        MainModelClass model15=new MainModelClass(R.drawable.hydrabadi_veg_biryani,"120",
                getString(R.string.hydrabadi_veg_biryani), "hydrabadi veg biryani");
        arrayList.add(model15);

        MainModelClass model16=new MainModelClass(R.drawable.iced_coffee,"65",
                getString(R.string.iced_coffee), "iced coffee");
        arrayList.add(model16);

        MainModelClass model17=new MainModelClass(R.drawable.margherita_pizza,"120",
                getString(R.string.pizza), "margherita pizza");
        arrayList.add(model17);

        MainModelClass model18=new MainModelClass(R.drawable.masala_dosa,"50",
                getString(R.string.masaladosa), "masala dosa");
        arrayList.add(model18);

        MainModelClass model19=new MainModelClass(R.drawable.mutton_biryani,"200",
                getString(R.string.mutton_biryani), "mutton biryani");
        arrayList.add(model19);

        MainModelClass model20=new MainModelClass(R.drawable.samosas,"40",
                getString(R.string.samosa), "Samosa");
        arrayList.add(model20);

        MainModelClass model21=new MainModelClass(R.drawable.veg_chowmein,"40",
                getString(R.string.veg_chowmein), "Veg chow mein");
        arrayList.add(model21);

        MainModelClass model22=new MainModelClass(R.drawable.veg_roll,"35",
                getString(R.string.veg_roll), "veg roll");
        arrayList.add(model22);

        MainModelClass model23=new MainModelClass(R.drawable.veg_spring_roll,"120",
                getString(R.string.veg_spring_roll), "veg spring roll");
        arrayList.add(model23);

    }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {

     getMenuInflater().inflate(R.menu.sample_menufile,menu);

  return super.onCreateOptionsMenu(menu);
 }

 @Override
 public boolean onOptionsItemSelected(@NonNull MenuItem item) {
     switch (item.getItemId()){
      case R.id.myordermenuuitemid:
       startActivity(new Intent(MainActivity.this,OrdersActivity.class));
       break;
     }
  return super.onOptionsItemSelected(item);
 }
}
