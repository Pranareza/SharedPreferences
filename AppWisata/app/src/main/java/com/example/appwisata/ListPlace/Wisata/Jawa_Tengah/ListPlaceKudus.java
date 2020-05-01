package com.example.appwisata.ListPlace.Wisata.Jawa_Tengah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appwisata.R;

import java.util.ArrayList;
import java.util.List;

public class ListPlaceKudus extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> wisata_kudus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_place_kudus);

        wisata_kudus = new ArrayList<>();
        wisata_kudus.add("Air Terjun Banteng");
        wisata_kudus.add("Museum Kretek Kudus");
        wisata_kudus.add("Air terjun pengantin");

        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, wisata_kudus);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        if (position == 0){

        }else if (position == 1){

        }
    }
}
