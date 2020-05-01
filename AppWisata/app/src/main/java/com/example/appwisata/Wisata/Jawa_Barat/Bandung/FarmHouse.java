package com.example.appwisata.Wisata.Jawa_Barat.Bandung;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import com.example.appwisata.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class FarmHouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bandung_farm_house);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Farmhouse Lembang bisa dikatakan tempat liburan terbaru di Bandung yang dikelola dengan baik. Keberadaannya semakin melengkapi tempat wisata di Lembang yang bisa anda kunjungi. Berada tidak jauh dari pusat Lembang, popularitasnya melesat naik cukup cepat. Dari awal dibuka untuk umum langsung penuh dengan pengunjung.\n\n" +
                "Keunikan   : Sebagai salah satu tempat wisata lembang baru, Farm house Lembang mulai beroperasi sekitar tahun 2015. Tempat wisata di Bandung biasanya terbantu naik oleh medsos, terutama facebook dan instagram. Tampaknya tempat ini memaksimalkan banget hal ini.\n\n" +
                "Harga Tiket: Rp 25.000\n\n" +
                "Jam Buka   : 09.00 s/d 21.000 WIB.\n\n" +
                "No. Telepon: 022-82782400\n\n" +
                "Alamat     : Jln. Raya Lembang Nomor 108, Cihideung, Kabupaten Bandung Barat\n\n"+
                "Link       : "+"https://www.google.com/maps?ll=-6.832967,107.605726&z=15&t=m&hl=id-ID&gl=ID&mapclient=embed&cid=3849429709694378865");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
