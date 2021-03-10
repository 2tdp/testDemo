package com.datnt.testdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DanhMucAdapter extends RecyclerView.Adapter<DanhMucAdapter.ViewHolder> {

    ArrayList<DanhMuc> danhMuc;
    Context context;

    public DanhMucAdapter(ArrayList<DanhMuc> danhMuc, Context context) {
        this.danhMuc = danhMuc;
        this.context = context;
    }


    @NonNull
    @Override
    public DanhMucAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_danhmuc, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DanhMucAdapter.ViewHolder holder, int position) {

        holder.ivAnh1.setImageResource(danhMuc.get(position).getAnh1());
        holder.ivAnh2.setImageResource(danhMuc.get(position).getAnh2());
        holder.ivAnh3.setImageResource(danhMuc.get(position).getAnh3());
        holder.ivAnh4.setImageResource(danhMuc.get(position).getAnh4());
        holder.tvTongmon.setText(String.valueOf(danhMuc.get(position).getTongMon()));
        holder.tvTongdat.setText(String.valueOf(danhMuc.get(position).getTongDat()));

    }

    @Override
    public int getItemCount() {
        if (danhMuc == null) {
            return 0;
        } else {
            return danhMuc.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivAnh1;
        ImageView ivAnh2;
        ImageView ivAnh3;
        ImageView ivAnh4;
        TextView tvTongmon;
        TextView tvTongdat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAnh1 = itemView.findViewById(R.id.ivanh1);
            ivAnh2 = itemView.findViewById(R.id.ivanh2);
            ivAnh3 = itemView.findViewById(R.id.ivanh3);
            ivAnh4 = itemView.findViewById(R.id.ivanh4);
            tvTongmon = itemView.findViewById(R.id.tvQuantity_tongmon);
            tvTongdat = itemView.findViewById(R.id.tvQuantity_tongdat);
        }
    }
}
