package com.example.android.elvieramahayatiharis_1202152335_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private TextView xnamatempatmakan;
    private TextView xnamamenumakanan;
    private TextView xbanyakporsi;
    private TextView xtotalharga;
    private  final int uang = 65500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        xnamatempatmakan = findViewById(R.id.tempat);
        xnamamenumakanan = findViewById(R.id.namamenu);
        xbanyakporsi = findViewById(R.id.jumlahPorsi);
        xtotalharga = findViewById(R.id.totalHarga);

        Intent c = getIntent();

        String namatempat = c.getStringExtra("namatempat");
        String namamenumakanan = c.getStringExtra("namamenumakanan");
        String jumlahporsi = c.getStringExtra("jumlahporsi");
        String totalharga = c.getStringExtra("totalharga");

        int totalHarga = Integer.valueOf(totalharga) * Integer.valueOf(jumlahporsi);

        xnamatempatmakan.setText(namatempat);
        xnamamenumakanan.setText(namamenumakanan);
        xbanyakporsi.setText(jumlahporsi);
        xtotalharga.setText(String.valueOf(totalHarga));

        if (totalHarga <= uang){
            Toast.makeText(this, "Disini saja makan malamnya", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this,"Jangan disini makan malamnua, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }
    }
}
