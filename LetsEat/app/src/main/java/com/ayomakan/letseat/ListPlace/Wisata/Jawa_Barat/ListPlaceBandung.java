package com.ayomakan.letseat.ListPlace.Wisata.Jawa_Barat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ayomakan.letseat.R;
import com.ayomakan.letseat.Wisata.Jawa_Barat.Bandung.braga;

import java.util.ArrayList;
import java.util.List;

public class ListPlaceBandung extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> wisata_bandung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_place_bandung);

        wisata_bandung = new ArrayList<String>();
        wisata_bandung.add("Braga Permai");

        wisata_bandung = new ArrayList<String>();
        wisata_bandung.add("atmosphare");

        wisata_bandung = new ArrayList<String>();
        wisata_bandung.add("restodior");



        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, wisata_bandung);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        if (position == 0) {
            intent = new Intent(ListPlaceBandung.this, braga.class);
            startActivity(intent);
        }

        if (position == 1) {
            intent = new Intent(ListPlaceBandung.this, braga.class);
            startActivity(intent);
        }

        if (position == 2) {
            intent = new Intent(ListPlaceBandung.this, braga.class);
            startActivity(intent);
        }
    }
}
