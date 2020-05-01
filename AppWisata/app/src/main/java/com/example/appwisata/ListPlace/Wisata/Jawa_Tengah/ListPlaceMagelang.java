package com.example.appwisata.ListPlace.Wisata.Jawa_Tengah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appwisata.R;
import com.example.appwisata.Wisata.Jawa_Tengah.Magelang.CandiSelogriyo;
import com.example.appwisata.Wisata.Jawa_Tengah.Magelang.CurugSikencling;
import com.example.appwisata.Wisata.Jawa_Tengah.Magelang.CurugWatuploso;

import java.util.ArrayList;
import java.util.List;

public class ListPlaceMagelang extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> wisata_magelang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_place_magelang);

        wisata_magelang = new ArrayList<>();
        wisata_magelang.add("Curug Watuploso");
        wisata_magelang.add("Curug Sikencling");
        wisata_magelang.add("Candi Selogriyo");

        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, wisata_magelang);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        if (position == 0){
            intent = new Intent(ListPlaceMagelang.this, CurugWatuploso.class);
            startActivity(intent);
        }else if (position == 1){
            intent = new Intent(ListPlaceMagelang.this, CurugSikencling.class);
            startActivity(intent);
        }else if (position == 2){
            intent = new Intent(ListPlaceMagelang.this, CandiSelogriyo.class);
            startActivity(intent);
        }
    }
}
