package com.example.appwisata.ListPlace.Wisata.Jawa_Tengah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appwisata.R;
import com.example.appwisata.Wisata.Jawa_Tengah.Tegal.BukitBatuAgung;
import com.example.appwisata.Wisata.Jawa_Tengah.Tegal.CurugCantelBumijawa;
import com.example.appwisata.Wisata.Jawa_Tengah.Tegal.PemandianAirPanas;

import java.util.ArrayList;
import java.util.List;

public class ListPlaceTegal extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> wisata_tegal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_place_tegal);

        wisata_tegal = new ArrayList<>();
        wisata_tegal.add("Pemandian Air Panas Guci");
        wisata_tegal.add("Bukit Batu Agung");
        wisata_tegal.add("Curug Cantel Bumijawa");

        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, wisata_tegal);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        if (position == 0){
            intent = new Intent(ListPlaceTegal.this, PemandianAirPanas.class);
            startActivity(intent);
        }else if (position == 1){
            intent = new Intent(ListPlaceTegal.this, BukitBatuAgung.class);
            startActivity(intent);
        }else if (position == 2){
            intent = new Intent(ListPlaceTegal.this, CurugCantelBumijawa.class);
            startActivity(intent);
        }
    }
}
