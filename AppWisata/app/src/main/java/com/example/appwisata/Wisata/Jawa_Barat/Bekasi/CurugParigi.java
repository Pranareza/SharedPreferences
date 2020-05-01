package com.example.appwisata.Wisata.Jawa_Barat.Bekasi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class CurugParigi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bekasi_curug_parigi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Curug Parigi terletak di perbatasan Kabupaten Bogor dan Kota Bekasi, tepatnya di Jalan Pangkalan 5, Kampung Parigi, Kecamatan Bantargebang, Kota Bekasi. Kawasan ini dijadikan objek wisata musiman oleh wisatawan lokal. Untuk bisa sampai di sana memang perlu mempersiapkan waktu lebih banyak mengingat kondisi jalan cukup macet.\n\n" +
                "Keunikan    : Curug Parigi dinilai berpotensi menjadi kawasan objek wisata yang bisa membangkitkan ekonomi kawasan setempat. Apalagi, berdekatan dengan TPST Bantargebang. Memang hampir setiap hari ada saja wisatawan lokal yang datang, rata-rata bisa mencapai 25 orang perhari. Saat Sabtu Minggu apalagi liburan jumlahnya meningkat 100 persen.\n\n" +
                "Harga Tiket : Rp2.000,-/Orang\n\n" +
                "Jam Buka    : 24 jam\n" +
                "No.Telepon  : (021) 29560000\n\n" +
                "Alamat      : RT.001/RW.006, Cikiwul, Bantargebang, Kota Bks, Jawa Barat 17152\n\n"+
                "Lokasi      : "+"https://www.google.com/maps/place/Curug+Parigi/@-6.3429019,106.9679348,17z/data=!3m1!4b1!4m5!3m4!1s0x2e6993ae3243e407:0x72b636b00c558101!8m2!3d-6.3429072!4d106.9701235");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
