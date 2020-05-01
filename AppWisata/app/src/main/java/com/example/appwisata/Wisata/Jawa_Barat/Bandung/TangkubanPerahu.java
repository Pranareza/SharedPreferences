package com.example.appwisata.Wisata.Jawa_Barat.Bandung;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class TangkubanPerahu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bandung_tangkuban_perahu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText("Gunung Tangkuban Perahu merupakan salah satu gunung yang terletak di Provinsi Jawa Barat, Indonesia. Sekitar 20 km ke arah utara Kota Bandung, dengan rimbun pohon pinus dan hamparan kebun teh di sekitarnya, Gunung Tangkuban Parahu mempunyai ketinggian setinggi 2.084 meter.\n\n" +
                        "Keunikan   : Asal usul Gunung Tangkuban Parahu dikaitkan dengan legenda Sangkuriang, yang dikisahkan jatuh cinta kepada ibunya, Dayang Sumbi/Rarasati. Untuk menggagalkan niat anaknya menikahinya, Dayang Sumbi mengajukan syarat supaya Sangkuriang membuat sebuah telaga dan sebuah perahu dalam semalam. Ketika usahanya gagal, Sangkuriang marah dan menendang perahu itu sehingga mendarat dalam keadaan terbalik. Perahu inilah yang kemudian membentuk Gunung Tangkuban Parahu.\n\n" +
                        "Harga Tiket: Domestik: Rp15.000/orang\n" +
                        "                       Asing       : Rp50.000/orang\n\n" +
                        "Jam Buka   : Tempat wisata ini buka setiap hari dari jam 8 pagi sampai dengan jam 5 sore.\n\n" +
                        "No. Telepon: 082120052011\n\n" +
                        "Alamat     : Jalan Raya Tangkuban Perahu No 282, Cikole, lembang, Kabupaten, Bandung Barat ,40391\n\n"+
                        "Link       : "+"https://www.google.com/maps/place/Gn.+Tangkuban+Parahu/@-6.7596372,107.5922711,14z/data=!3m1!4b1!4m5!3m4!1s0x2e68e1ddc59713db:0xa01c96b73428fedc!8m2!3d-6.7596377!4d107.6097807");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
