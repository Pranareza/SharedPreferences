package com.example.appwisata.Wisata.Jawa_Barat.Bekasi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class GoWetWaterpark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bekasi_go_wet_waterpark);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Sinarmas Land menghadirkan waterpark di Grand Wisata Bekasi, Go! Wet Waterpark. Beroperasi sejak 9 Februari 2015, Go! Wet adalah taman air untuk segala usia yang dirancang oleh Whitewater, konsultan taman air internasional terkenal dari Kanada.\n\n" +
                "Keunikan    : Go! Wet dibangun di area seluas 7,5 hektar dengan 5 hektar yang didedikasikan untuk wahana air seperti: Go! Fast, Go! Speed, Go! Sprint dan Go! Flash. Keempat slide tampaknya saling tumpang tindih dan memberikan pengalaman geser yang berbeda dari ketinggian 12 meter. Tempat-tempat menarik lainnya termasuk Go! Fun, Go! Play, Go! Boomer, Go! Round, dan Go! Spray.\n\n" +
                "Harga Tiket : Senin – Jum’at/Hari kerja (Anak – anak Rp. 100.000,- & Dewasa Rp. 175.000,-) & Sabtu, Minggu/Hari libur Nasional (Anak – anak Rp. 150.000,- & Dewasa Rp. 225.000,-)\n\n" +
                "Jam Buka    : Senin – Jum’at/Hari kerja (10.30 – 18.30) & Sabtu, Minggu/Hari libur Nasional (09.00 – 20.00)\n\n" +
                "No.Telepon  : (021) 29560000\n\n" +
                "Alamat      : Grand Wisata Bekasi, Jl. Southern Boulevard Kav. 1, Lambang Jaya,Tambun Selatan, Bekasi, Jawa Barat 17510.\n\n"+
                "Lokasi      : "+"https://www.google.com/maps/place/Go!+Wet+Waterpark+Grand+Wisata+Bekasi/@-6.2982454,107.0488032,17z/data=!3m1!4b1!4m5!3m4!1s0x2e6991d47690db41:0xa1ad39ca13a4f51f!8m2!3d-6.2982507!4d107.0509919");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
