package com.example.appwisata.Wisata.Jawa_Barat.Bandung;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class ObservatoriumBosscha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bandung_observatorium_bosscha);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = (TextView) findViewById(R.id.txtview);
        txtView.setText("Observatorium Bosscha (dahulu bernama Bosscha Sterrenwacht) dibangun oleh Nederlandsch-Indische Sterrenkundige Vereniging (NISV) atau Perhimpunan Astronomi Hindia Belanda. Sayangnya, Anda tidak bisa masuk tanpa melakukan pemesanan setidaknya satu bulan sebelum waktu kedatangan. Tentu saja, waktu kunjungan pun juga tidak bisa setiap hari dan jam.\n\n" +
                        "Keunikan    : Merupakan salah satu tempat peneropongan bintang tertua di Indonesia.\n\n" +
                        "Harga Tiket : Rp15.000 - Rp20.000\n\n" +
                        "Jam Buka    : 09.00 - 14.30\n\n" +
                        "No. Telepon : 022 278 6001\n\n" +
                        "Alamat      : Jl. Peneropongan Bintang No.45, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391.\n\n" +
                        "Lokasi      : "+"https://www.google.com/maps/place/Bosscha/@-6.824505,107.6138962,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e11292b0db83:0xc0f73eee035e3ffd!8m2!3d-6.8245103!4d107.6160849");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
