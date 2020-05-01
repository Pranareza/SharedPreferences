package com.example.appwisata.ListPlace.Wisata.Jawa_Barat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appwisata.R;
import com.example.appwisata.Wisata.Jawa_Barat.Bekasi.ColumbusWaterpark;
import com.example.appwisata.Wisata.Jawa_Barat.Bekasi.CurugParigi;
import com.example.appwisata.Wisata.Jawa_Barat.Bekasi.GoWetWaterpark;
import com.example.appwisata.Wisata.Jawa_Barat.Bekasi.HutanKota;
import com.example.appwisata.Wisata.Jawa_Barat.Bekasi.Waterboom;

import java.util.ArrayList;
import java.util.List;

public class ListPlaceBekasi extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> wisata_bekasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_place_bekasi);

        wisata_bekasi = new ArrayList<>();
        wisata_bekasi.add("Go!Wet Waterpark – Grand Wisata");
        wisata_bekasi.add("Waterboom Lippo Cikarang");
        wisata_bekasi.add("Hutan Kota Bekasi");
        wisata_bekasi.add("Curug Parigi");
        wisata_bekasi.add("Columbus Waterpark");

        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, wisata_bekasi);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        if (position == 0){
            intent = new Intent(ListPlaceBekasi.this, GoWetWaterpark.class);
            startActivity(intent);
        }else if (position == 1){
            intent = new Intent(ListPlaceBekasi.this, Waterboom.class);
            startActivity(intent);
        }else if (position == 2){
            intent = new Intent(ListPlaceBekasi.this, HutanKota.class);
            startActivity(intent);
        }else if (position == 3){
            intent = new Intent(ListPlaceBekasi.this, CurugParigi.class);
            startActivity(intent);
        }else if (position == 4){
            intent = new Intent(ListPlaceBekasi.this, ColumbusWaterpark.class);
            startActivity(intent);
        }
    }
}
