package com.example.appwisata.Wisata.Jawa_Barat.Sukabumi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class KawahRatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_sukabumi_kawah_ratu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Kawah Ratu berada di Kawasan Taman Nasional Gunung Halimun Salak. Seperti yang diketahui bersama. Wilayah Gunung Salak termasuk dalam wilayah yang bisa dibilang angker. Penuh misteri dan kejadian mistis yang tidak bisa masuk di akal. Seperti halnya, terjatuhnya pesawat Sukhoi pada waktu itu.\n\n" +
                "Keunikan    : Daya Tarik utama dari kawasan ini terletak di aliran sungai Cikuwulung yang melintas kurang lebih 1 km. Inilah yang membedakan antara Kawah Ratu dengan kawah yang lainnya dan bisa dibilang menjadi keunikan dari kawah ratu. Bila, sobat native lihat dari kejauhan, aliran sungai ini berwarna biru tosca.\n\n" +
                "Harga Tiket : Rp.7.500,-\n\n" +
                "Jam Buka    : 08.00 – 17.00 WIB\n" +
                "No.Telepon  : 0857-8000-2200\n\n" +
                "Alamat      : Desa Gunung Sari, Kecamatan Pamijahan.\n\n"+
                "Lokasi      : "+"https://www.google.com/maps/place/Kawah+Ratu,+Taman+Nasional+Gunung+Halimun+Salak/@-6.7175128,106.7109514,17z/data=!3m1!4b1!4m5!3m4!1s0x2e69d203401d696f:0xa83f2ef511ce5810!8m2!3d-6.7175181!4d106.7131401");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
