package com.irpan.budiana.contohintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PindahDataActivity extends AppCompatActivity {

    public static final String DATA_NAMA = "data_nama";
    public static final String DATA_USIA = "data_usia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_data);

        TextView tvDataDiterima = findViewById(R.id.tv_data_diterima);

        String nama = getIntent().getStringExtra(DATA_NAMA);
        int    usia = getIntent().getIntExtra(DATA_USIA, 0);

        String text = "Nama : " + nama + ",\nUsia Anda: " + usia;
        tvDataDiterima.setText(text);
    }
}