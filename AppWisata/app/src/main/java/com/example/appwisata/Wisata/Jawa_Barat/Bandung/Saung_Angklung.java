package com.example.appwisata.Wisata.Jawa_Barat.Bandung;

import android.os.Bundle;

import com.example.appwisata.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

public class Saung_Angklung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bandung_saung_angklung);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = (TextView) findViewById(R.id.txtview);
        txtView.setText(
                        "Saung Angklung Udjo dibangun pada tahun 1966 oleh Udjo Ngalagena atau juga dikenal sebagai Mang Udjo bersama dengan istrinya, Uum Sumiati, dengan tujuan melestarikan seni dan budaya tradisional Sunda.\n\n" +
                        "Keunikan    : Selain angklung, Udjo Ngalagena juga mendalami seni bela diri tradisional yaitu pencak silat, gamelan, kecapi, dan juga lagu-lagu daerah berbahasa Indonesia dan Belanda. Karena itu Saung Angklung Udjo tidak hanya menyajikan pertunjukan angklung, namun juga berbagai macam kesenian khas Jawa Barat.\n\n" +
                        "Harga Tiket : Rp50.000 - Rp120.000 \n\n" +
                        "Jam Buka    : 15.30 WIB - 17.00 WIB \n\n" +
                        "No. Telepon : (022)7271714 \n\n" +
                        "Alamat      : Jl. Padasuka No.118 Pasirlayung,Cibeunying Kidul,Bandung,Jawa Barat,Indonesia,40192.\n\n" +
                        "Lokasi      : "+"https://www.google.com/maps/place/Kawah+Putih/@-7.1661514,107.4010453,18z/data=!3m1!4b1!4m5!3m4!1s0x2e688c1383dc510f:0xfab41bb8e4a3a83e!8m2!3d-7.1662039!4d107.4021256");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
