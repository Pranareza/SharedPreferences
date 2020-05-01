package com.example.appwisata.Wisata.Jawa_Barat.Bekasi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.widget.TextView;

import com.example.appwisata.R;

public class HutanKota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_activity_bekasi_hutan_kota);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtView = findViewById(R.id.txtview);
        txtView.setText("");
        Linkify.addLinks(txtView, Linkify.WEB_URLS);
    }
}
