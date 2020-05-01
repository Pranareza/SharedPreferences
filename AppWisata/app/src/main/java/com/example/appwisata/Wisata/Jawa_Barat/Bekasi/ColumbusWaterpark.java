package com.example.appwisata.Wisata.Jawa_Barat.Bekasi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class ColumbusWaterpark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bekasi_columbus_waterpark);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Columbus Waterpark Merupakan sebuah tempat wisata terkenal di Kota Bekasi. Banyak wisatawan dari dalam daerah maupun dari luar daerah yang datang di akhir pekan untuk berlibur. Karena kolam renang ini sangat cocok untuk liburan bersama keluarga tercinta maupun bersama orang terdekat anda.\n\n" +
                "Keunikan    : Obyek wisata Columbus Waterpark ini juga sangat recomended untuk anak – anak anda untuk bermain atau berenang. Karena memang obyek wisata ini berkonsep sebagai tempat wisata untuk keluarga. Selain itu banyak fasilitas dan aktifitas yang dapat anda coba di wisata ini.\n\n" +
                "Harga Tiket : Senin – jum’at/Hari kerja (Anak – anak Rp. 30.000,- & Dewasa Rp. 40.000,-) & Sabtu, Minggu/Hari libur Nasional (Anak – anak Rp. 60.000,- & Dewasa Rp. 65.000,-)\n\n" +
                "Jam Buka    : Setiap hari (08.00 – 18.00)\n\n" +
                "No.Telepon  : (021) 29081234\n\n" +
                "Alamat      : Perumahan Mutiara Gading Timur, Kelurahan, Kecamatan, Mustika Jaya, Mustikajaya, Kota Bks, Jawa Barat 171582\n\n"+
                "Lokasi      : "+"https://www.google.com/maps/place/Columbus+Waterpark/@-6.2862913,107.0285404,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698e2038cdefef:0x4d6aabf57672f676!8m2!3d-6.2862966!4d107.0307291");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
