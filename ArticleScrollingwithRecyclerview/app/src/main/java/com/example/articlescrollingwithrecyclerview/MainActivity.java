package com.example.articlescrollingwithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private ArrayList<Model> modellist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        buildStudentList();
        setRecyclerView();
    }



    private void buildStudentList() {
        for(int i=1;i<10;i++)
        {
            int x=i%2;
            if (x==0)
            {
                Model model = new Model(R.drawable.maldives, R.string.Maldives);
                modellist.add(model);
            }
            else if(x==1)
            {
                    Model model=new Model(R.drawable.shimla,R.string.shimla);
                    modellist.add(model);
            }
        }
    }

    private void initviews() {
        recyclerView=findViewById(R.id.recycler1);
    }
    private void setRecyclerView() {
        Adapter adapter=new Adapter(modellist);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}