package com.datnt.testdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DanhMucFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<DanhMuc> danhMuc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_danh_muc, container, false);

        recyclerView = view.findViewById(R.id.rvDanh_muc);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(layoutManager);

        danhMuc = new ArrayList<>();
        danhMuc.add(new DanhMuc(R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, 100, 200));
        danhMuc.add(new DanhMuc(R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, 20, 50));

        recyclerView.setAdapter(new DanhMucAdapter(danhMuc, getContext()));

        return view;
    }
}