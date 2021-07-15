package com.example.articlescrollingwithrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Holder>{
    private ArrayList<Model> modellist;

    public Adapter(ArrayList<Model> modellist) {
        this.modellist = modellist;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Model model=modellist.get(position);
        holder.setdata(model);
    }

    @Override
    public int getItemCount() {
        return modellist.size();
    }
}
