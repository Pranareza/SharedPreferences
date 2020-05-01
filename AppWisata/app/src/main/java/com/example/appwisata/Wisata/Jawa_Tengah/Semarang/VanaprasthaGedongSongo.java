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

public class VanaprasthaGedongSongo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_semarang_vanaprastha_gedong_songo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Tempat wisata yang masih satu area dengan Candi Gedong Songo ini menawarkan kesejukan udara diantara hutan pinus. Tempat yang adem dan cocok untuk menghilangkan penat. " +
                        "Apalagi selain tempatnya bagus dan pemandangannya indah , ada jumlah spot foto seperti gardu pandang hingga area outbond.\n\n"+
                "Selain bisa jalan-jalan mengiatari hutan pinus bisa juga menginap, baik ngecampcmaupun sewa villa.\n\n"+
                "Tiket Masuk\t: Rp5.000/orang\n\n" +
                "Buka Jam\t   : Senin – Minggu 08:00 – 18:00\n\n" +
                "Alamat\t\t   : Jl.Ke Candi Gedong Songo No.16, Krajan, Banyukuning, Kec.Bandungan, Semarang, Jawa Tengah , 50614\n\n"+
                "Lokasi       : "+"https://www.google.com/maps/place/Vanaprastha+Gedong+Songo+Park+Perhutani/@-7.206586,110.3418185,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70875d27f500d7:0xe66d8179b82ec37a!8m2!3d-7.206586!4d110.3418185");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
