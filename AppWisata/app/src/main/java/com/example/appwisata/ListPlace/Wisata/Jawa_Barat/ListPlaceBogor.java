package com.example.appwisata.ListPlace.Wisata.Jawa_Barat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appwisata.R;
import com.example.appwisata.Wisata.Jawa_Barat.Bogor.HighlandParkResort;
import com.example.appwisata.Wisata.Jawa_Barat.Bogor.JungleLand;
import com.example.appwisata.Wisata.Jawa_Barat.Bogor.JungleWaterpark;
import com.example.appwisata.Wisata.Jawa_Barat.Bogor.KebunRayaBogor;
import com.example.appwisata.Wisata.Jawa_Barat.Bogor.ParalayangBukitGantole;
import com.example.appwisata.Wisata.Jawa_Barat.Bogor.TamanBungaNusantara;

import java.util.ArrayList;
import java.util.List;

public class ListPlaceBogor extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> wisata_bogor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_place_bogor);

        wisata_bogor = new ArrayList<>();
        wisata_bogor.add("Kebun Raya Bogor");
        wisata_bogor.add("The Jungle Waterpark");
        wisata_bogor.add("Jungle Land");
        wisata_bogor.add("Paralayang Bukit Gantole Puncak");
        wisata_bogor.add("Taman Bunga Nusantara");
        wisata_bogor.add("Highland Park Resort");

        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, wisata_bogor);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        if (position == 0){
            intent = new Intent(ListPlaceBogor.this, KebunRayaBogor.class);
            startActivity(intent);
        }else if (position == 1){
            intent = new Intent(ListPlaceBogor.this, JungleWaterpark.class);
            startActivity(intent);
        }else if (position == 2){
            intent = new Intent(ListPlaceBogor.this, JungleLand.class);
            startActivity(intent);
        }else if (position == 3){
            intent = new Intent(ListPlaceBogor.this, ParalayangBukitGantole.class);
            startActivity(intent);
        }else if (position == 4){
            intent = new Intent(ListPlaceBogor.this, TamanBungaNusantara.class);
            startActivity(intent);
        }else if (position == 5){
            intent = new Intent(ListPlaceBogor.this, HighlandParkResort.class);
            startActivity(intent);
        }
    }
}
