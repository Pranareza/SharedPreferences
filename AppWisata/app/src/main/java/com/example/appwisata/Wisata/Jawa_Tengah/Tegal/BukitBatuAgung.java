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

public class BukitBatuAgung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_tegal_bukit_batu_agung);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Bukit Batu Agung memiliki pemandangan yang luar biasa indah. Oleh karena itu, tempat ini sering dijadikan sebagai spot fotografi favorit bagi para fotografer. Hanya orang pemberani saja untuk berfoto di tempat esktrem ini. " +
                        "Setiap wisatawan yang datang harus dalam keadaan sehat, karena nantinya untuk menuju kesana harus berjalan kaki 25-30 menit . " +
                        "Medan untuk ditempuh cukup menyulitkan dan perlu menggunakan sandal khusus mendaki atau sepatu yang memiliki alas licin.\n\n"+
                        "Wisatawan tak perlu khawatir akan tersesat selama berada di Bukit Batu Agung. " +
                        "Terdapat petugas siap membantu para wisatawan untuk menikmati indahnya tempat ini. " +
                        "Petugas wisata disana juga menyiapkan berbagai fasilitas yang diberikan kepada wisatawan : mushala , kamar mandi dan penginapan.\n\n"+
                "Harga Tiket Masuk :\n" +
                        "Senin – Jum’at : Rp7.000\n" +
                        "Sabtu – Minggu : Rp15.000 \n\n" +
                "Jam Buka : \n" +
                        "Senin – Minggu :  08:00 – 17:00\n\n" +
                "Alamat   : Harjowinangun, Balapulang , Tegal , Jawa Tengah, 52466\n\n"+
                "Lokasi   : "+"https://www.google.com/maps/dir//Wisata+Batu+Agung,+Batuagung,+Kec.+Balapulang,+Tegal,+Jawa+Tengah+52464/@-7.102497,109.0749515,14z/data=!4m8!4m7!1m0!1m5!1m1!1s0x2e6f95d4ac625e59:0xd56ab90ef4be2c46!2m2!1d109.0958489!2d-7.1022083");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
