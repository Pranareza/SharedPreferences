package com.example.appwisata.Wisata.Jawa_Barat.Bogor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class TamanBungaNusantara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bogor_taman_bunga_nusantara);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Taman Bunga Nusantara didirikan atas prakarsa ibu Dani Bustanil Arifin pada tahun 1992. Beliau saat itu memang menjadi ketua Yayasan Bunga Nusantara, dan membangun taman ini sebagai area agrowisata. Secara resmi, Taman Bunga Nusantara diresmikan oleh Presiden Soeharto pada tahun 1995.\n\n" +
                "Keunikan    : Anda bisa menggunakan kamera selama melayang-layang diudara, dan itu aman-aman saja, tetapi Anda harus memegang kamera erat-erat agar tidak terjatuh atau dibuatkan pengikat khusus agar kamera atau handphone bisa aman selama melayang.\n\n" +
                "Harga Tiket : Rp30.000,00\n\n" +
                "Jam Buka    : 08.00 – 17.00 WIB\n\n" +
                "No. Telepon : (0263) 581617\n\n" +
                "Alamat      : Jl.Raya Puncak Km 87 Bukit Gantole, Gunung Mas, Puncak, Bogor.\n\n"+
                "Lokasi      : "+"https://www.google.com/maps/place/Taman+Bunga+Nusantara/@-6.7271934,107.0798678,17z/data=!3m1!4b1!4m5!3m4!1s0x2e69b3e586b6266d:0x1c9b14260d4319ab!8m2!3d-6.7271987!4d107.0820565");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
