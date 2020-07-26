package com.irpan.budiana.contohintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPindahActivity = findViewById(R.id.btn_pindah_activity);
        btnPindahActivity.setOnClickListener(this);

        Button btnPindahActivityData = findViewById(R.id.btn_pindah_activity_data);
        btnPindahActivityData.setOnClickListener(this);

        Button btnPanggilTelepon = findViewById(R.id.btn_panggil_telepon);
        btnPanggilTelepon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pindah_activity:
                Intent intentPindah = new Intent(MainActivity.this, PindahActivity.class);
                startActivity(intentPindah);
                break;
            case R.id.btn_pindah_activity_data:
                Intent intentPindahData = new Intent(MainActivity.this, PindahDataActivity.class);
                intentPindahData.putExtra(PindahDataActivity.DATA_NAMA, "Ahmad Sanusi");
                intentPindahData.putExtra(PindahDataActivity.DATA_USIA, 50);
                startActivity(intentPindahData);
                break;
            case R.id.btn_panggil_telepon:
                String nomorTelepon = "08123456789";
                Intent intentPanggilTelepon = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + nomorTelepon));
                startActivity(intentPanggilTelepon);
                break;
        }
    }
}