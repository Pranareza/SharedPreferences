package com.example.appwisata.Wisata.Jawa_Tengah.Semarang;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import com.example.appwisata.R;

public class WatuGunung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_semarang_watu_gunung);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Objek wisata alam ini sangat cocok dikunjungi, terlebih saat akhir pekan. Dulunya Watu Gunung ini bukanlah suatu objek wisata. Hanya tanah yang ditumbuhi pohon pala dan cengkeh yang lebat. Sayangnya , kawasan tersebut gersang dan susah mendapatkan air. " +
                        "Kemudian tahun 2004 sang pemilik berinisiatif untuk mendirikan villa pribadi dan lama kelamaan dibuatlah objek wisata yang dibuka untuk umum. Dengan tetep mempertahankan bangunan joglo sebagai ciri khasnya.\n\n"+
                "Watu Gunung menawarkan wisata alam dengan nuansa khas jawa. Hal ini dapat dilihat dari beberapa bangunan joglo yang ada di objek wisata. Dan bangunan ini dilengkapi pernak-pernik etnik wayang. " +
                        "Keunikan wisata watu gunung ini adalah bangunan joglo dan memberikan setiap nama unik bangunannya. Seperti rumah etnik jawa bali yang dinamai progo. Dan wisata ini menawarkan gedung maupun area outdoor yang dapat disewa pengunjung dan dapat menyewa gedung dengan kapasitas 50-70 orang.\n\n"+
                "Harga Tiket Masuk :\n" +
                        "Senin – Sabtu\t: Rp20.000\n" +
                        "Minggu\t\t     : Rp25.000\n\n" +
                "Jam Buka \t  : 08:00 – 17:00 \n\n" +
                "Alamat \t\t  : Lerep Satu, Lerep, Unggaran Barat, Semarang, Jawa Tengah , 50519\n\n"+
                "Lokasi       : "+"https://www.google.com/maps/place/Watu+Gunung/@-7.1298013,110.3866433,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70818626b52037:0x6e0804ea44384d66!8m2!3d-7.1298066!4d110.388832");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
