package com.example.appwisata.ListPlace.Wisata.Jawa_Tengah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appwisata.R;
import com.example.appwisata.Wisata.Jawa_Tengah.Semarang.CurugLaweLimbangan;
import com.example.appwisata.Wisata.Jawa_Tengah.Semarang.PantaiMarina;
import com.example.appwisata.Wisata.Jawa_Tengah.Semarang.VanaprasthaGedongSongo;
import com.example.appwisata.Wisata.Jawa_Tengah.Semarang.WatuGunung;

import java.util.ArrayList;
import java.util.List;

public class ListPlaceSemarang extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> wisata_semarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_place_semarang);

        wisata_semarang = new ArrayList<>();
        wisata_semarang.add("Watu Gunung");
        wisata_semarang.add("Pantai Marina");
        wisata_semarang.add("Vanaprastha Gedong Songo Park");
        wisata_semarang.add("Curug Lawe Limbangan");

        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, wisata_semarang);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        if (position == 0){
            intent = new Intent(ListPlaceSemarang.this, WatuGunung.class);
            startActivity(intent);
        }else if (position == 1){
            intent = new Intent(ListPlaceSemarang.this, PantaiMarina.class);
            startActivity(intent);
        }else if (position == 2){
            intent = new Intent(ListPlaceSemarang.this, VanaprasthaGedongSongo.class);
            startActivity(intent);
        }else if (position == 3){
            intent = new Intent(ListPlaceSemarang.this, CurugLaweLimbangan.class);
            startActivity(intent);
        }
    }
}
