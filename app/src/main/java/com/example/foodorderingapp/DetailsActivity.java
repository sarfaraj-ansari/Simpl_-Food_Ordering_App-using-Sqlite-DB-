package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodorderingapp.Classes.DBHelper;
import com.example.foodorderingapp.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    ActivityDetailsBinding binding;
    public final DBHelper dbHelper = new DBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Order Details");


            final int image = getIntent().getIntExtra("image", 0);

            final int price = Integer.parseInt(getIntent().getStringExtra("price"));

            final String title = getIntent().getStringExtra("title");
            final String description = getIntent().getStringExtra("description");

            binding.detailsfoodnametextViewid.setText(title);
            binding.detailsimageViewid.setImageResource(image);
            binding.detailspricetextviewid.setText(String.format("%d", price));
            binding.detailsdescriptiontextViewid.setText(description);

            binding.orderbtnid.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    boolean res=dbHelper.insertData(binding.nameedittextid.getText().toString(),
                            binding.phoneedittextid.getText().toString(),
                            image,
                            price,
                            title,
                            description,
                            Integer.parseInt(binding.quantitytextViewid.getText().toString()));

                    if(res){
                        Toast.makeText(DetailsActivity.this, "Order Placed Successfully", Toast.LENGTH_LONG).show();

                    }
                }
            });
        }



    }
