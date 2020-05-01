package com.example.appwisata.ListPlace.Wisata.Jawa_Barat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appwisata.R;
import com.example.appwisata.Wisata.Jawa_Barat.Sukabumi.JembatanSituGunung;
import com.example.appwisata.Wisata.Jawa_Barat.Sukabumi.KawahRatu;
import com.example.appwisata.Wisata.Jawa_Barat.Sukabumi.TamanBumiNasional;

import java.util.ArrayList;
import java.util.List;

public class ListPlaceSukabumi extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> wisata_sukabumi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_place_sukabumi);

        wisata_sukabumi = new ArrayList<>();
        wisata_sukabumi.add("Jembatan Situ Gunung");
        wisata_sukabumi.add("Kawah Ratu");
        wisata_sukabumi.add("Taman Bumi Nasional Ciletuh");

        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, wisata_sukabumi);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        if (position == 0){
            intent = new Intent(ListPlaceSukabumi.this, JembatanSituGunung.class);
            startActivity(intent);
        }else if (position == 1){
            intent = new Intent(ListPlaceSukabumi.this, KawahRatu.class);
            startActivity(intent);
        }else if (position == 2){
            intent = new Intent(ListPlaceSukabumi.this, TamanBumiNasional.class);
            startActivity(intent);
        }
    }
}
