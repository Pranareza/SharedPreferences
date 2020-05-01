package com.ayomakan.letseat.Wisata.Jawa_Barat.Bandung;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import com.ayomakan.letseat.R;

public class restodior extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restodior);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "BANDUNG \n" +
                        "Alamat: Jl. Sultan Tirtayasa No.41, Citarum\n"+ "Kec. Bandung Wetan, Kota Bandung, Jawa Barat 40115\n"+
                        "Jam buka:Tutup ⋅ Buka pukul 11.00 hari Jum'at\n"+
                        "Lokasi : https://www.google.com/maps/dir/-6.8973322,107.6096949/restoran+main+course+bandung/@-6.9110296,107.5916944,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x2e68e88260d018eb:0x1c6eff3b5082d2d1!2m2!1d107.6133915!2d-6.9267101");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }


}
