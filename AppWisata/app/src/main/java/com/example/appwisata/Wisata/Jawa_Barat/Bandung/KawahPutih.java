package com.example.appwisata.Wisata.Jawa_Barat.Bandung;

import android.os.Bundle;

import com.example.appwisata.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

public class KawahPutih extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bandung_kawah_putih);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText("Kawah Putih adalah tempat wisata di Bandung yang paling terkenal. Berlokasi di Ciwidey, Jawa Barat, kurang lebih sekitar 50 KM arah selatan kota Bandung, Kawah Putih adalah sebuah danau yang terbentuk akibat dari letusan Gunung Patuha.\n\n" +
                        "Keunikan   : Tanah yang ada di kawasan ini berwarna putih akibat dari pencampuran unsur belerang. Selain tanahnya yang berwarna putih, air danau kawasan Kawah Putih juga mempunyai warna yang putih kehijauan dan dapat berubah warna sesuai dengan kadar belerang yang terkandung, suhu, dan cuaca.\n\n" +
                        "Harga Tiket: Domestik : Rp18.000/orang\n" +
                        "                       Asing       : Rp50.000/orang\n\n" +
                        "Jam Buka   : Tempat wisata ini buka setiap hari, dari jam 7 pagi sampai dengan jam 5 sore\n\n" +
                        "Alamat     : Sugihmukti, Pasirjambu, Bandung, Jawa Barat\n\n"+
                        "Lokasi     : "+"https://www.google.co.id/maps/place/Kawah+Putih/@-7.166154,107.399951,17z/data=!3m1!4b1!4m5!3m4!1s0x2e688c1383dc510f:0xfab41bb8e4a3a83e!8m2!3d-7.1662039!4d107.4021256?hl=id");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
