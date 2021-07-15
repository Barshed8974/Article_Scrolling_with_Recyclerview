package com.example.articlescrollingwithrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    private ImageView mImage;
    private TextView mInfo;

    public Holder(@NonNull View itemView) {
        super(itemView);
        initview(itemView);
    }
    public void initview(View itemview)
    {
        mImage=itemview.findViewById(R.id.ivImage1);
        mInfo=itemview.findViewById(R.id.svInfo);
    }
    public void setdata(Model model)
    {
        mImage.setImageResource(model.getmImage());
        mInfo.setText(model.getmInfo());
    }
}
