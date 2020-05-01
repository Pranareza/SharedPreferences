package com.ayomakan.letseat;

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

import com.ayomakan.letseat.ListPlace.Wisata.Jawa_Barat.ListPlaceBandung;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner_provinsi;
    private Spinner spinner_kota;
    private Spinner spinner_category;
    private Button btn_cari;
    private TextView txtview,txtview2;

    private String tempat;
    private List<String> provinsi, jabar, tng, DKI, category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        provinsi = new ArrayList<String>();
        provinsi.add("Pilih Provinsi");
        provinsi.add("Jawa Barat");
        provinsi.add("Banten");
        provinsi.add("DKI Jakarta");

        jabar = new ArrayList<String>();
        jabar.add("Pilih Kota/Kabupaten");
        jabar.add("Bandung");
        jabar.add("Bekasi");


        tng = new ArrayList<String>();
        tng.add("Pilih Kota/Kabupaten");
        tng.add("Tangerang Selatan");
        tng.add("Kabupaten Tangerang");
        tng.add("Kota Tangerang");

        DKI = new ArrayList<String>();
        DKI.add("Pilih Kota/Kabupaten");
        DKI.add("Jakarta Utara");
        DKI.add("Jakarta Selatan");
        DKI.add("Jakarta Barat");
        DKI.add("Jakarta Timur");

        category = new ArrayList<String>();
        category.add("Pilih Kategori Makanan");
        category.add("appetizer");
        category.add("main course");
        category.add("dessert");
;

        spinner_provinsi = findViewById(R.id.spin_provinsi);
        spinner_kota = findViewById(R.id.spin_kota);
        spinner_category = findViewById(R.id.spin_category);
        txtview = findViewById(R.id.txt_view);
        btn_cari = findViewById(R.id.btnCari);
        txtview2 = findViewById(R.id.textView2);
        ArrayAdapter<String> arrayProvinsi = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_dropdown_item_1line,
                provinsi
        );
        spinner_provinsi.setAdapter(arrayProvinsi);

        spinner_provinsi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                List<String> kota = new ArrayList<String>();
                List<String> kategori = new ArrayList<String>();
                if(position != 0){
                    spinner_kota.setVisibility(View.VISIBLE);
                    txtview.setVisibility(View.VISIBLE);
                    spinner_category.setVisibility(view.VISIBLE);
                    txtview2.setVisibility(view.VISIBLE);
                    if (position == 1){
                        kota = jabar;
                        kategori = category;
                    } else if(position == 2){
                        kota = tng;
                        kategori = category;
                    }else if (position == 3){
                        kota = DKI;
                        kategori = category;
                    }
                    ArrayAdapter<String> arrayKota = new ArrayAdapter<String>(
                            getApplicationContext(), android.R.layout.simple_dropdown_item_1line,
                            kota
                    );
                    ArrayAdapter<String> arraykategori = new ArrayAdapter<String>(
                            getApplicationContext(), android.R.layout.simple_dropdown_item_1line,
                            kategori
                    );
                    spinner_kota.setAdapter(arrayKota);
                    spinner_category.setAdapter(arraykategori);
                } else{
                    spinner_kota.setVisibility(View.INVISIBLE);
                    txtview.setVisibility(View.INVISIBLE);
                    spinner_category.setVisibility(view.INVISIBLE);
                    txtview2.setVisibility(view.INVISIBLE);
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
                }
            }
        });
    }
}
