package com.example.appwisata.Wisata.Jawa_Tengah.Tegal;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import com.example.appwisata.R;

public class PemandianAirPanas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_tegal_pemandian_air_panas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Pemandian Air panas Guci adalah destinasi wisata paling populer di kabupaten tegal. " +
                        "Letaknya berada dikaki gunung slamet. Kawasan tersebut menyediakan air hangat alami dari perut bumi serta udara sejuk pegunungan.\n\n"+
                "Wisata panas ini memiliki daya tarik tersendiri, selain tempatnya yang asri dan sejuk , juga terdapat air terjun yang menambah pemandangan semakin indah. " +
                        "Selain itu ada sebuah tanah lapang yang biasa dipakai untuk berkemah.\n\n"+
                "Harga Tiket Masuk :\n" +
                        "Senin – Jum’at : Rp5.000,-\n" +
                        "Sabtu – Minggu : Rp7.000,-\n\n" +
                "Jam Buka :\n" +
                        "Senin – Minggu : 06:00 – 21:00\n\n" +
                "Alamat\t : Kalengan, Guci , Bumijawa , Tegal , Jawa Tengah, 52466\n\n"+
                "Lokasi   : "+"https://www.google.com/maps/place/Wisata+Pemandian+Air+Panas+GUCI+Tegal/@-7.2180449,109.1029088,12z/data=!4m8!1m2!2m1!1sPemandian+Air+Panas+Guci!3m4!1s0x2e6f8dbb373482a1:0x66cba71e5d9344b7!8m2!3d-7.1986431!4d109.1641923");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
