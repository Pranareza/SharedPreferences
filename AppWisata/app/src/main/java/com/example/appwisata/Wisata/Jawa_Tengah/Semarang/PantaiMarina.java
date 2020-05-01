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

public class PantaiMarina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_semarang_pantai_marina);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText(
                "Diindonesia memang sangat terkenal dengan tempat wisata alam yang jumlahnya sudah tak terhitung , salah satunya adalah iklim indonesia yang cuaca tropis sehingga membuat banyak wisatawan berlibur di indonesia. " +
                        "Salah satu wisata alam indonesia yang bisa dijadikan salah satu destinasi wisata adalah pantai Marina. Loasinya berada di kota semarang yang salah satunya primadona para traveler.\n\n"+
                "Pantai Marina ini dulunya merupakan kawasan hutan bakau serta tambak dari penduduk sekitar. " +
                        "Namun, seiring perkembangan maka tempat ini telah direnovasi oleh pemerintah kota semarang dan dijadikan sebagai tempat wisata alam yakni pantai marina.\n\n"+
                "Harga Tiket Masuk\t :\n" +
                        "Senin – Sabtu\t: Rp3.000\n" +
                        "Minggu \t      : Rp7.000\n\n" +
                "Jam Buka \t\t  : 06:00 – 19:00\n\n" +
                "Alamat \t\t    : Kota Semarang , Jawa Tengah\n\n"+
                "Lokasi         : "+"https://www.google.com/maps/place/Pantai+Marina/@-6.9488717,110.3871398,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70f4e56e4f8ea1:0xcf2bee72d0606dd0!8m2!3d-6.948877!4d110.3893285");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
