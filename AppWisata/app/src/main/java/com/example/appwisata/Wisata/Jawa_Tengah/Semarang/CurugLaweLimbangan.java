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

public class CurugLaweLimbangan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_semarang_curug_lawe_limbangan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Nama Curug Lawe sendiri diambil dari bahasa jawa , dari kata ‘selawe’ yang diartikan adalah dua puluh lima dalam bahasa indonesia, sekaligus menunjukan jumlah air terjun yang ada. " +
                        "Ada juga mengatakan berbeda Curug Lawe dari kata ‘ kawa lawe’ atau jaring laba-laba karena air yang jatuh dari air terjun terlihat seperti benang-benang putih menyerupai jaring laba-laba.\n\n"+
                "Curug Lawe unik karena bentuknya yang hampir menyerupai setengah lingkaran, terdiri dari satu air terjun utama dan beberapa air terjun kecil berasal dari sela-sela dinding bebatuan yang ada. Dengan ketinggian mencapai 30 meter, membuatnya semakin indah dan eksotis. " +
                        "Bentuk dari tebing curug lawe senndiri menyerupai cekungan , lalu dibagian tengahnya mengalir air terjun yang cukup deras, dengan debit air cukup tinggi, terutama ketika musim hujan.\n\n"+
                "Tiket Masuk\t: Rp4.000 – Rp5.000 /Orang\n\n" +
                "Buka Jam\t   : \n" +
                "    Senin – Minggu  : 06:00 – 15:00\n\n" +
                "Alamat\t     : Gunungsari, Limbangan, Hutan, Kec. Ungaran Bar., Semarang, Jawa Tengah , 51383\n\n"+
                "Lokasi       : "+"https://www.google.com/maps/place/Curug+Lawe+limbangan/@-7.1586109,110.3558296,17z/data=!4m8!1m2!2m1!1sCurug+Lawe+Semarang!3m4!1s0x2e7a874499b6419d:0xff795a6f4718102e!8m2!3d-7.1598604!4d110.3548041");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
