package com.example.appwisata.Wisata.Jawa_Barat.Sukabumi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class JembatanSituGunung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_sukabumi_jembatan_situ_gunung);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Jembatan Situ Gunung Sukabumi merupakan jembatan gantung yang memiliki panjang 250 meter dengan ketinggian 150 meter. Tak heran jika jembatan ini dinobatkan sebagai jembatan gantung terpanjang se-Asia.\n\n" +
                "Keunikan    : Rasakan sensasi berjalan di atas kanopi hutan dengan pohon dan bukit bersebaran ke sejauh mata dapat memandang. Dikelilingi oleh alam hijau, Anda dapat merasakan kesunyian dan ketenangan yang sulit untuk ditandingi.\n\n" +
                "Harga Tiket : Rp50.0000 untuk dewasa, anak anak Rp25.000 dan manula Rp25.000\n\n" +
                "Jam Buka    : 05.00 – 23.00 WIB\n\n" +
                "Alamat      : Jl.Kadudampit, Gede Pangrango, Kadudampit, Sukabumi, Jawa Barat ,43153\n\n"+
                "Lokasi      : "+"https://www.google.com/maps/place/Situ+Gn./@-6.8319229,106.9143008,15z/data=!3m1!4b1!4m5!3m4!1s0x2e684a7d24eb8f4f:0x1e5e0f34bcb62779!8m2!3d-6.8319444!4d106.9230556");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
