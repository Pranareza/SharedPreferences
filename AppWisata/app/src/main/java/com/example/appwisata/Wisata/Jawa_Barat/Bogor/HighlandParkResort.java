package com.example.appwisata.Wisata.Jawa_Barat.Bogor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class HighlandParkResort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bogor_highland_park_resort);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Highland Park Resort adalah sebuah penginapan yang berada di atas lahan dengan luas 12 hektar. Daya tarik dari tempat ini adalah sangat unik konsepnya. Terkenal dengan status kelas atas, tempat ini memiliki konsep ala Mongolia. Yaitu suatu negara perbatasan antara Rusia dan China dimana tempatnya terdiri dari tenda-tenda putih berjejer dengan latar belakang gunung Salak.\n\n" +
                "Keunikan    : Terkenal dengan status kelas atas, tempat ini memiliki konsep ala Mongolia. Yaitu suatu negara perbatasan antara Rusia dan China dimana tempatnya terdiri dari tenda-tenda putih berjejer dengan latar belakang gunung Salak.\n\n" +
                "Harga Tiket : Rp1.500.000,00 (tarif minimal per malam)\n" +
                "Jam Buka    : 24 jam\n\n" +
                "No.Telepon  : 0855-8132-999\n\n" +
                "Alamat      : Jl.Curug Nangka Sinarwangi, Sukajadi, Kec.Tamansari, Bogor, Jawa Barat, 16610\n\n"+
                "Lokasi      : "+"https://www.google.com/maps/place/The+Highland+Park+Resort+-+Hotel+Bogor/@-6.6587427,106.7270278,17z/data=!3m1!4b1!4m8!3m7!1s0x2e69cfd9620a67ad:0xbe236969c0c6a85c!5m2!4m1!1i2!8m2!3d-6.658748!4d106.7292165");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
