package com.example.appwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appwisata.ListPlace.Wisata.Jawa_Barat.ListPlaceBandung;
import com.example.appwisata.ListPlace.Wisata.Jawa_Barat.ListPlaceBekasi;
import com.example.appwisata.ListPlace.Wisata.Jawa_Barat.ListPlaceBogor;
import com.example.appwisata.ListPlace.Wisata.Jawa_Barat.ListPlaceSukabumi;
import com.example.appwisata.ListPlace.Wisata.Jawa_Tengah.ListPlaceMagelang;
import com.example.appwisata.ListPlace.Wisata.Jawa_Tengah.ListPlaceSemarang;
import com.example.appwisata.ListPlace.Wisata.Jawa_Tengah.ListPlaceTegal;
import com.example.appwisata.ListPlace.Wisata.Jawa_Timur.ListPlaceMadiun;
import com.example.appwisata.ListPlace.Wisata.Jawa_Timur.ListPlaceMalang;
import com.example.appwisata.ListPlace.Wisata.Jawa_Timur.ListPlaceSurabaya;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner_provinsi;
    private Spinner spinner_kota;
    private Button btn_cari;
    private TextView txtview;
    private String tempat;
    private List<String> provinsi, jabar, jatim, jateng, Lampung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        provinsi = new ArrayList<String>();
        provinsi.add("Pilih Provinsi");
        provinsi.add("Jawa Barat");
        provinsi.add("Jawa Timur");
        provinsi.add("Jawa Tengah");
        provinsi.add("Lampung");

        jabar = new ArrayList<String>();
        jabar.add("Pilih Kota/Kabupaten");
        jabar.add("Bandung");
        jabar.add("Bogor");
        jabar.add("Bekasi");
        jabar.add("Sukabumi");

        jatim = new ArrayList<String>();
        jatim.add("Pilih Kota/Kabupaten");
        jatim.add("Surabaya");
        jatim.add("Malang");
        jatim.add("Madiun");

        jateng = new ArrayList<String>();
        jateng.add("Pilih Kota/Kabupaten");
        jateng.add("Semarang");
        jateng.add("Tegal");
        jateng.add("Magelang");
        jateng.add("Kudus");

        Lampung = new ArrayList<String>();
        Lampung.add("Pilih Kota/Kabupaten");
        Lampung.add("Bandar Lampung");
        Lampung.add("Pesawaran");
        Lampung.add("Lampung Barat");
        Lampung.add("Metro");
        Lampung.add("Kota Bumi");

        spinner_provinsi = findViewById(R.id.spin_provinsi);
        spinner_kota = findViewById(R.id.spin_kota);
        txtview = findViewById(R.id.txt_view);
        btn_cari = findViewById(R.id.btnCari);

        ArrayAdapter<String> arrayProvinsi = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_dropdown_item_1line,
                provinsi
        );
        spinner_provinsi.setAdapter(arrayProvinsi);

        spinner_provinsi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                List<String> kota = new ArrayList<String>();
                if(position != 0){
                    spinner_kota.setVisibility(View.VISIBLE);
                    txtview.setVisibility(View.VISIBLE);
                    if (position == 1){
                        kota = jabar;
                    } else if(position == 2){
                        kota = jatim;
                    }else if (position == 3){
                        kota = jateng;
                    }else if (position == 4){
                        kota = Lampung;
                    }
                    ArrayAdapter<String> arrayKota = new ArrayAdapter<String>(
                            getApplicationContext(), android.R.layout.simple_dropdown_item_1line,
                            kota
                    );
                    spinner_kota.setAdapter(arrayKota);
                } else{
                    spinner_kota.setVisibility(View.INVISIBLE);
                    txtview.setVisibility(View.INVISIBLE);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner_kota.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tempat = spinner_kota.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        btn_cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                if (tempat == jabar.get(0)){
                    Toast.makeText(MainActivity.this, "Pilihan Tidak Tersedia", Toast.LENGTH_SHORT).show();
                }else if(tempat == jabar.get(1)){
                    i = new Intent(MainActivity.this, ListPlaceBandung.class);
                    startActivity(i);
                }else if(tempat == jabar.get(2)){
                    i = new Intent(MainActivity.this, ListPlaceBogor.class);
                    startActivity(i);
                }else if(tempat == jabar.get(3)){
                    i = new Intent(MainActivity.this, ListPlaceBekasi.class);
                    startActivity(i);
                }else if(tempat == jabar.get(4)) {
                    i = new Intent(MainActivity.this, ListPlaceSukabumi.class);
                    startActivity(i);
                }else if (tempat == jatim.get(0)){
                    Toast.makeText(MainActivity.this, "Pilihan Tidak Tersedia", Toast.LENGTH_SHORT).show();
                }else if(tempat == jatim.get(1)) {
                    i = new Intent(MainActivity.this, ListPlaceSurabaya.class);
                    startActivity(i);
                }else if(tempat == jatim.get(2)) {
                    i = new Intent(MainActivity.this, ListPlaceMalang.class);
                    startActivity(i);
                }else if(tempat == jatim.get(3)) {
                    i = new Intent(MainActivity.this, ListPlaceMadiun.class);
                    startActivity(i);
                }else if(tempat == jateng.get(0)) {
                    Toast.makeText(MainActivity.this, "Pilihan Tidak Tersedia", Toast.LENGTH_SHORT).show();
                }else if(tempat == jateng.get(1)) {
                    i = new Intent(MainActivity.this, ListPlaceSemarang.class);
                    startActivity(i);
                }else if(tempat == jateng.get(2)) {
                    i = new Intent(MainActivity.this, ListPlaceTegal.class);
                    startActivity(i);
                }else if(tempat == jateng.get(3)) {
                    i = new Intent(MainActivity.this, ListPlaceMagelang.class);
                    startActivity(i);
                }else if(tempat == jateng.get(4)) {
                    i = new Intent(MainActivity.this, ListPlaceMalang.class);
                    startActivity(i);
                }else if(tempat == Lampung.get(0)) {
                    Toast.makeText(MainActivity.this, "Pilihan Tidak Tersedia", Toast.LENGTH_SHORT).show();
                }else if(tempat == Lampung.get(1)) {
                    i = new Intent(MainActivity.this, ListPlaceMalang.class);
                    startActivity(i);
                }else if(tempat == Lampung.get(2)) {
                    i = new Intent(MainActivity.this, ListPlaceMalang.class);
                    startActivity(i);
                }else if(tempat == Lampung.get(3)) {
                    i = new Intent(MainActivity.this, ListPlaceMalang.class);
                    startActivity(i);
                }else if(tempat == Lampung.get(4)) {
                    i = new Intent(MainActivity.this, ListPlaceMalang.class);
                    startActivity(i);
                }else if(tempat == Lampung.get(5)) {
                    i = new Intent(MainActivity.this, ListPlaceMalang.class);
                    startActivity(i);
                }
            }
        });
    }
}
