package com.ayomakan.letseat.Wisata.Jawa_Barat.Bekasi;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import com.ayomakan.letseat.R;

public class amouzgourmet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amouzgourmet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
        "BEKASI \n" +
                "Alamat: The Energy Building (2nd Floor,Lot 11A,SCBD Jalan Jendral Sudirman No.Kav. 52-53, RT.5/RW.3, Senayan\n"+
                "Kec. Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12190\n" +
                "Jam buka: Tutup ⋅ Buka pukul 11.30 hari Jum'at\n"+
                "Lokasi : "+"https://www.google.com/maps/dir/-6.8973322,107.6096949/resto+main+course+jakarta/@-6.5528541,106.6480227,9z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x2e69f150f1c1dd75:0x9b3afbe2475adca7!2m2!1d106.8064865!2d-6.2257824");

        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
