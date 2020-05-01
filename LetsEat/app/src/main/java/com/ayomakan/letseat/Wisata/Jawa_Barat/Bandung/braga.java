package com.ayomakan.letseat.Wisata.Jawa_Barat.Bandung;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.ayomakan.letseat.R;

public class braga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bandung_farm_house);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "BANDUNG \n" +
                        "Braga Street No.58, Sumur Bandung, West Java 40111\n" +
                        "+62 22 4233778, +62 85282929292, info@bragapermai.com\n" +
                        "Braga Street No.58, Sumur Bandung, West Java 40111\n" +
                        "+62 22 4233778, +62 85282929292, info@bragapermai.com\n" +
                        "Jam buka: \n" +
                        "Buka ⋅ Tutup pukul 00.00\n" +
                        "\t\n" +
                        "Telepon: (022) 4233778\n"+
                "Lokasi : "+"https://www.google.com/maps/dir/-6.8973322,107.6096949/restoran+main+course+bandung/@-6.9095465,107.5996171,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x2e68e63aa8f14e4b:0x6ff769d88c0594cd!2m2!1d107.6095032!2d-6.9173892");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
