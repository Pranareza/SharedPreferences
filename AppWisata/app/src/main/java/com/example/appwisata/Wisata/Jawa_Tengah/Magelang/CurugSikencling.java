package com.example.appwisata.Wisata.Jawa_Tengah.Magelang;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import com.example.appwisata.R;

public class CurugSikencling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_magelang_curug_sikencling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Curug Sikencling adalah destinasi wisata alam yang merupakan air terjun kecil dikabupaten magelang yang lokasinya berada didusun sikencling, Desa Dampit, Kecamatan Windusari , kabupaten Magelang. " +
                        "Curug sikencling memiliki debit air yang tidak terlalu besar, namun sangat menarik untuk kunjungi karena air terjun ini memiliki spot foto yang lumayan banyak . spot foto utama berada di pintu masuk wisata yang dibangun menggunakan bambu. Gardu pandang utama ini memiliki tinggi sekitar 6 meter dan terdiri dari 4 tingkat. " +
                        "Dari gardu pandang ini kita bisa lihat pemandangan yang luar biasa yakni rumah-rumah penduduk dengan latar Gunung Sumbing.\n\n" +
                "Dibawah gardu pandang utama, terdapat kolam ikan tang bersih dan unik. Karena kolam ikan ini dibuat menyerupai bentuk love/cinta\n\n"+
                "Tiket Masuk : Rp5.000\n" +
                "Jam Buka    : 08:00 – 17:00\n"+
                "Alamat      : Sikencling , Dampit, Windusari , Magelang, Jawa Tengah"+
                "Lokasi      : "+"https://www.google.com/maps/place/Air+Terjun+Sikencling+Dampit/@-7.4149594,110.1148929,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a9b41d18d2099:0x9c2a16c4025d7762!8m2!3d-7.4149594!4d110.1170816");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
