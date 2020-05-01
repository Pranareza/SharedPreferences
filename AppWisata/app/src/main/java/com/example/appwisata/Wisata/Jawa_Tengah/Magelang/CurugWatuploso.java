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

public class CurugWatuploso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_magelang_curug_watuploso);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Curug Watuploso merupakan daya tarik wisata air terjun di kawasan perbukitan yang berdekatan denag Candi Borobudur Magelang. Curug Watuploso terletak didusun Miriombo Kulon, desa Giripurno, Kecamatan Borobudur , Kabupaten Magelang, Jawa Tengah.\n\n" +
                "\tCurug Watuploso Magelang  memiliki tiga tingkatan air terjun pertama atau grojogan 1 sebagai daya tarik utama. Air terjun pertama ini memiliki ketinggian sekitar 10-12 meter. Air terjun ini merupakan gabungan dari aliran mata air dan sungai kecil yang mengalir dari perbukitan tersebut." +
                "Kondisi air masih sangat bersih dan belum tercemar sehingga aman dimanfaatkan hingga kebutuhan air minum masyarakat setempat. Debit air terjun ini mangalir sepanjang tahun meskipun pada musim kemarau debit airnya menyusut. " +
                "Bebatuan dan tebing batu membentuk aliran curug watuploso dari grojogan 1 hingga grojogan 3. Pengunjung diharapkan berhati-hati ketika melewati area bebatuan karena kondisinya cukup licin karena adanya lumut yang tumbuh dipermukaan batu.\n\n" +
                "Fasilitas pendukung wisata yang  telah dibangun disekitar air terjun pertama curug watuploso cukup alternatif seperti gasebo, bangnan berbentuk kapal, tempat duduk berbentuk tangan, bangunan keris tertancap ketanah, hingga tulisan raksasa bertulisan nama curug. " +
                        "Bangunan unik tersebut dapat menarik kunjungan wisatawan terutama anak muda dan menjadi lokasi berfoto favorit.\n\n"+
                "Tiket Masuk : Rp3.000/orang\n\n" +
                "Jam Buka    : 24 Jam (Senin-Minggu)\n\n"+
                "Alamat\t    : Olgung, Guripno, Borobudur, Magelang, Jawa Tengah, 56553\n\n"+
                "Lokasi      : "+"https://www.google.com/maps/place/Curug+Watu+Ploso/@-7.637987,110.1679819,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a8d3387b9a423:0x7321b6c5b024983!8m2!3d-7.6379923!4d110.1701706");
        Linkify.addLinks(txtView,Linkify.WEB_URLS);
    }
}
