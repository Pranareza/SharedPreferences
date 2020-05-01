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

public class CurugCantelBumijawa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_tegal_curug_cantel_bumijawa);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Curug Cantel Bumijawa merupakan  salah satu air terjun palig megah di Tegal. Cukup terkenal dan ramai dikunjungi wisatawan dimasa liburan. Salah satu daya tarik sekaligus tantangan dari curug cantel adalah jalur trekking perbukitan yang ahrus dilalui untuk mencapainya. " +
                        "Atmosfer petualang terasa karena pengunjung juga harus melewati sungai dengan bebatuan cukup licin. Medannya bisa dibilang sulit , namun sangat pas bagi para penyuka tantangan.\n\n"+
                "Curug Cantel Bumijawa memiliki ketinggian 60meter , dan sisi air terjun di tumbuhi lumut serta tumbuhan merambat. " +
                        "Karena ketinggiannya , tidak disarankan berenang dibagian bawah. Air turun sangat deras dan bisa membahayakan.\n\n"+
                "Tiket Masuk\t: Rp5000 /Orang\n\n" +
                "Buka Jam\t   : " +
                        "Senin – Minggu : 08:30 – 16:00\n\n" +
                "Alamat\t\t   : Jl.Raya Kalipedes, Ladang,Hutan, Sigedong, Bumijawa, Kabupaten Brebes, Jawa Tengah, 52466\n\n"+
                "Lokasi       : "+"https://www.google.com/maps/place/Curug+Cantel/@-7.2253092,109.1262531,17z/data=!4m8!1m2!2m1!1scantel+bumijawa+tegal!3m4!1s0x2e6f8dbad0a38075:0x24661c5a1f98b182!8m2!3d-7.2262343!4d109.1291486");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
