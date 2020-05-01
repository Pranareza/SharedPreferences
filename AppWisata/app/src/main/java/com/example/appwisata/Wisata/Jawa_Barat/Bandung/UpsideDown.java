package com.example.appwisata.Wisata.Jawa_Barat.Bandung;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class UpsideDown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bandung_upside_down);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText("Tempat wisata ini, sejak dibuka pertama kali berhasil memancing banyak orang untuk datang, setelah beragam foto-foto yang diambil pengunjung dari tempat ini diupload dan tersebar di dunia maya internet.\n\n" +
                        "Keunikan    : Di tempat ini, setiap pengunjung bisa berfoto baik berselfie maupun ber-wefie ria dengan posisi dimana anda akan terlihat seperti “Tijungkir” alias terbalik. \n\n" +
                        "Harga Tiket : Rp60.000 (Dewasa) Rp40.000 (Anak-anak < 120cm)\n\n" +
                        "Jam Buka    : 09.00 - 14.30\n\n" +
                        "No. Telepon : 0821-4718-6732\n\n" +
                        "Alamat      : Jl. H. Wasid No.31(Dipatiukur),Lebakgede,Coblong, Kota Bandung, Bandung, Jawa Barat, 40132\n\n" +
                        "Lokasi      : "+"https://www.google.com/maps/place/Upside+Down+World+Bandung/@-6.8962992,107.6148173,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e65212a87041:0xcd6e130647905f56!8m2!3d-6.8963045!4d107.617006");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
