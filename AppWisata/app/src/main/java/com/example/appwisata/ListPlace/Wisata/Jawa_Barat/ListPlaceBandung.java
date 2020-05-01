package com.example.appwisata.ListPlace.Wisata.Jawa_Barat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appwisata.R;
import com.example.appwisata.Wisata.Jawa_Barat.Bandung.FarmHouse;
import com.example.appwisata.Wisata.Jawa_Barat.Bandung.KawahPutih;
import com.example.appwisata.Wisata.Jawa_Barat.Bandung.ObservatoriumBosscha;
import com.example.appwisata.Wisata.Jawa_Barat.Bandung.Saung_Angklung;
import com.example.appwisata.Wisata.Jawa_Barat.Bandung.TangkubanPerahu;
import com.example.appwisata.Wisata.Jawa_Barat.Bandung.UpsideDown;

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
        wisata_bandung.add("Kawah Putih");
        wisata_bandung.add("Farm House");
        wisata_bandung.add("Gunung Tangkuban Perahu");
        wisata_bandung.add("Upside Down World Bandung");
        wisata_bandung.add("Observatorium Bosscha");
        wisata_bandung.add("Saung Angklung Udjo");

        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, wisata_bandung);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        if (position == 0) {
            intent = new Intent(ListPlaceBandung.this, KawahPutih.class);
            startActivity(intent);
        }else if (position == 1) {
            intent = new Intent(ListPlaceBandung.this, FarmHouse.class);
            startActivity(intent);
        }else if (position == 2) {
            intent = new Intent(ListPlaceBandung.this, TangkubanPerahu.class);
            startActivity(intent);
        }else if (position == 3) {
            intent = new Intent(ListPlaceBandung.this, UpsideDown.class);
            startActivity(intent);
        }else if (position == 4) {
            intent = new Intent(ListPlaceBandung.this, ObservatoriumBosscha.class);
            startActivity(intent);
        }else if (position == 5) {
            intent = new Intent(ListPlaceBandung.this, Saung_Angklung.class);
            startActivity(intent);
        }
    }
}
