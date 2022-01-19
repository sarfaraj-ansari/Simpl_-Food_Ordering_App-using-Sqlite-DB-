package com.example.foodorderingapp.AdapterClasses;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderingapp.DetailsActivity;
import com.example.foodorderingapp.ModelClasses.MainModelClass;
import com.example.foodorderingapp.R;

import java.util.ArrayList;

public class MainAdapterClass extends RecyclerView.Adapter<MainAdapterClass.MyViewHolder>{

    ArrayList<MainModelClass> arrayList;
    Context context;

    public MainAdapterClass(ArrayList<MainModelClass> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.main_sample_layoutfile,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapterClass.MyViewHolder holder, int position) {

        MainModelClass index=arrayList.get(position);

        holder.maiImageView.setImageResource(index.getImage());
        holder.mainpricetextView.setText(index.getPrice());
        holder.maintitletextView.setText(index.getTitle());
        holder.maindescriptiontextView.setText(index.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context, DetailsActivity.class);

                intent.putExtra("image",index.getImage());
                intent.putExtra("description",index.getDescription());
                intent.putExtra("title",index.getTitle());
                intent.putExtra("price",index.getPrice());
                intent.putExtra("type",2);

                context.startActivity(intent);

                }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView maiImageView;
        TextView maintitletextView,mainpricetextView,maindescriptiontextView;
        public MyViewHolder(View itemView) {
            super(itemView);

            maiImageView=itemView.findViewById(R.id.main_imageViewid);
            mainpricetextView=itemView.findViewById(R.id.main_pricetextView);
            maintitletextView=itemView.findViewById(R.id.main_titletextViewid);
            maindescriptiontextView=itemView.findViewById(R.id.main_descriptiontextView);
        }
    }
}
