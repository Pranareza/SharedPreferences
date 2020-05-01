package com.example.appwisata.Wisata.Jawa_Barat.Sukabumi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class TamanBumiNasional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_sukabumi_taman_bumi_nasional);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Taman Bumi Nasional Ciletuh-Palabuhanratu adalah sebuah konsep manajemen pengelolaan kawasan yang menyerasikan keragaman geologi, hayati, dan budaya, melalui prinsip konservasi, edukasi, dan pembangunan yang berkelanjutan di 8 kecamatan di kawasan wilayah Sukabumi, Jawa Barat, Indonesia.\n\n" +
                "Keunikan    : Taman Nasional Ciletuh-Palabuhanratu juga merupakan tempat wisata baru di Kabupaten Sukabumi, Provinsi Jawa Barat sekaligus merupakan Geopark Nasional Indonesia yang telah diakui UNESCO pada tahun 2015 silam dan saat ini Geopark Nasional Palabuhanratu sedang diusulkan menjadi Geopark Internasional atau Global Geopark Network (GGN) agar diakui UNESCO pada tahun 2017 mendatang.\n\n" +
                "Harga Tiket : Gratis\n\n" +
                "Jam Buka    : 24 jam\n\n" +
                "No.Telepon  : 0227273209\n\n" +
                "Alamat      : Ciwaru,Ciemas,Sukabumi,Jawa Barat,Indonesia,43177.\n\n"+
                "Lokasi      : "+"https://www.google.com/maps/search/3.%09Taman+Bumi+Nasional+Ciletuh-Palabuhanratu/@-6.9841815,106.511553,12.25z");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
