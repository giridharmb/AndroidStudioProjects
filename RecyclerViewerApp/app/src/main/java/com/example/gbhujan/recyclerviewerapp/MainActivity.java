package com.example.gbhujan.recyclerviewerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gbhujan.recyclerviewerapp.Adapter.MyAdapter;
import com.example.gbhujan.recyclerviewerapp.Model.ListItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for(int i=0; i<10; i++) {
            ListItem listItem = new ListItem("Item " + (i+1), "Description " + (i+1));

            listItems.add(listItem);
        }

        adapter = new MyAdapter(this, listItems);

        recyclerView.setAdapter(adapter);
    }
}
