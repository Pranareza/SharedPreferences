package com.example.appwisata.Wisata.Jawa_Barat.Bogor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class ParalayangBukitGantole extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bogor_paralayang_bukit_gantole);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Paralayang Bukit Gantole Puncak berada dalam kawasan Gunung Mas, dimana kegiatan paralayang ini akan di dampingi oleh instruktur yang berpengalaman dalam olahraga paralayang ini. Paralayang di Indonesia berinduk pada organisasi PLGI (Persatuan Layang Gantung Indonesia), dan berada di bawah FASI (Federasi Aero Sport Indonesia).\n\n" +
                "Keunikan    : Anda bisa menggunakan kamera selama melayang-layang diudara, dan itu aman-aman saja, tetapi Anda harus memegang kamera erat-erat agar tidak terjatuh atau dibuatkan pengikat khusus agar kamera atau handphone bisa aman selama melayang.\n\n" +
                "Harga Tiket : Rp13.000/orang serta biaya untuk tandem paralayang ini sebesar Rp350.000/orang dan Rp400.000 untuk wisatawan asing.\n\n" +
                "Jam Buka    : 24 jam\n\n" +
                "No.Telepon  : 081908961240\n\n" +
                "Alamat      : Jl.Raya Puncak Km 87 Bukit Gantole, Gunung Mas, Puncak, Bogor\n\n"+
                "Lokasi      : "+"https://www.google.com/maps/search/Paralayang+Bukit+Gantole+Puncak/@-6.7027973,106.9902667,15z/data=!3m1!4b1");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
