package com.example.foodorderingapp.AdapterClasses;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderingapp.DetailsActivity;
import com.example.foodorderingapp.ModelClasses.OrdersModelClass;
import com.example.foodorderingapp.R;

import java.util.ArrayList;

public class OrdersAdapterClass extends RecyclerView.Adapter<OrdersAdapterClass.OrdersViewHolder> {

    ArrayList<OrdersModelClass> arrayList;
    Context context;

    public OrdersAdapterClass(ArrayList<OrdersModelClass> arrayList,Context context) {
        this.arrayList = arrayList;
        this.context=context;
    }

    @Override
    public OrdersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.orders_sample_layoufile,parent,false);

        return new OrdersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OrdersAdapterClass.OrdersViewHolder holder, int position) {

        final OrdersModelClass model=arrayList.get(position);

        holder.ordersImageView.setImageResource(model.getImage());
        holder.orderspricetextView.setText(model.getOrderprice());
        holder.ordersNumbertextView.setText(model.getOrderNumber());
        holder.ordersfoodNametextView.setText(model.getOrdersFoodName());

        
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class OrdersViewHolder extends RecyclerView.ViewHolder{

        ImageView ordersImageView;
        TextView ordersfoodNametextView,ordersNumbertextView,orderspricetextView;
        public OrdersViewHolder(View itemView) {
            super(itemView);

            ordersImageView=itemView.findViewById(R.id.ordersimageViewid);
            ordersfoodNametextView=itemView.findViewById(R.id.ordersfoodNametextViewid);
            ordersNumbertextView=itemView.findViewById(R.id.ordersOrderNotextViewid);
            orderspricetextView=itemView.findViewById(R.id.orderspricetextViewid);
        }
    }
}
