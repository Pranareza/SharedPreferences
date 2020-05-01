package com.example.appwisata.Wisata.Jawa_Tengah.Magelang;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import com.example.appwisata.R;

public class CandiSelogriyo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_magelang_candi_selogriyo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Candi peninggalan jaman purbakala ini berlokasi di Dusun Selogriyo, desa candisari yang masuk dalam wilayah kecamatan windusari.  Dari gapura yang menjadi aksek pintu masuk , pengunjung akan terlebuh dahulu menapaki anak tangga yang jumlahnya cukup banyak. Bahwa candi selogriyo dibangun saat masa kerajaan Mataram Kuno , yakni sekitae abad ke-9 Masehi. Arsitektur candi seogriyo yang mengungsung gaya indonesia klasik ini terlihat sangat unik. Dengan desain berlatar agama hindu sebagai kiblatnya yang mengarah ke timur. Di keempat sudut dinding bangunannya juga dilengkapi dengan lima reling tempat arca sebagai perwujudan dari dewa.\n\n" +
                "Arca-arca tersebut antar lain arca ganesha yang berada disudut dinding barat, arca Durga Mahisasuramardini yang ada disudut utara, Agastya disudut dinding selatan, serta Nandiswara dan Mahakala yang berada di sudut timur. Sebagian arca tridak memiliki kepala. Keunikan lainnya adalah puncaknya yang berbentuk sepert sebuah kaben dan kemuncak yang dinamai Amalaka.\n\n" +
                "Pada tahun 1998, Candi Selogriyo pernah hancur karena terkena longsor. Akhirnya dilakukan rekonstruksi ulang yang abru selesai pada tahun 2005 . waktu yang cukup lama untuk merekonstruksi candi ini ternyata tetap tidak bisa mengembalikan keutuhan candi seperti sedia kala.\n\n" +
                "Oleh karena itu candi selogriyo banyak dikunjungi oleh mereka para pecinta alam  yang gemar berpetualang.\n\n"+
                "Tiket Masuk\t: Rp5.000 /Orang\n\n" +
                "Buka Jam\t   : Senin – Minggu  08:00 – 16:00\n\n" +
                "Alamat\t\t   : Hutan, Windusari, Magelang, Jawa Tengah, 56152\n\n"+
                "Lokasi       : "+"https://www.google.com/maps/place/Candi+Selogriyo/@-7.4246047,110.165417,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a848fffffffff:0x18d0ada8b19d74f9!8m2!3d-7.42461!4d110.1676057");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
