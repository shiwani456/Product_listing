package com.myapplication.productlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.MyViewHolder> {

    private List<ProductListModel> listModels;
    private Context context;

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewProductName, textViewProductPrice;
        ImageView imageViewProductThumb;

        MyViewHolder(View view) {
            super(view);
            imageViewProductThumb = view.findViewById(R.id.imageViewProductThumb);
            textViewProductName = view.findViewById(R.id.textViewProductName);
            textViewProductPrice = view.findViewById(R.id.textViewProductPrice);
        }
    }


    ProductListAdapter(List<ProductListModel> listModels,Context context) {
        this.listModels = listModels;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ProductListModel productListModel = listModels.get(position);
        Picasso.with(context).load(productListModel.getId()).into(holder.imageViewProductThumb);

        holder.textViewProductName.setText(productListModel.getName());
        holder.textViewProductPrice.setText(productListModel.getPrice());
    }

    @Override
    public int getItemCount() {
        return listModels.size();
    }
}