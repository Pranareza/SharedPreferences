package com.example.appwisata.Wisata.Jawa_Tengah.Kudus;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import com.example.appwisata.R;

public class AirTerjunBanteng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_kudus_air_terjun_banteng);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Air terjun kali banteng merupakan salah satu diantara beberapa pesona alam yang dimiliki oleh desa rahtawu kecamatan gebog kabupaten kudus jawa tengah. Meski memiliki ukuran air terjun yang tidak terlalu tinggi yakni sekitar 20 meter, air terjun kali banteng tetap memberikan nuansa alam pegunungan dengan segarnya aliran air dan indahnya pemandangan sekitar yang didominasi bukit dan pohon-pohon yang hijau dan sedap dipandang mata.\n\n" +
                "Untuk sampai menuju air terjun kali banteng, para pengunjung harus berjalan kaki dari  jalan utama desa rahtawu atau lebih tepat dari tempat parkir kendaraan air terjun kali banteng dengan melewati jalan setapak sekitar 50 meter dengan kondisi jalan yang sedikit menanjak. Air terjun kali banteng memiliki bentuk yang cukup unik yakni berundak atau bertingkat 2, di bawah bagian air terjun terbentuk kolam yang bisa digunakan untuk bermain air dan berenang.\t\n\n"+
                "Tiket Masuk\t: Rp5.000 /Orang\n\n" +
                "Buka Jam\t   : Senin – Minggu  08:00 – 17:00\n\n" +
                "Alamat\t\t   : Area Gn., Rahtawu, Kec. Gebog, Kabupaten Kudus, Jawa Tengah, 59333\n\n"+
                "Lokasi       : "+"https://www.google.com/maps/place/Air+Terjun+Kali+Banteng/@-6.7240279,110.7223406,11z/data=!4m8!1m2!2m1!1swisata+alam+rejenu+kudus!3m4!1s0x2e70d86f84916edb:0x435499998cfff7fa!8m2!3d-6.644151!4d110.8679462");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
