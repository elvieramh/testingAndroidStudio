package com.example.android.elvieramahayatiharis_1202152335_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText xmenu;
    private EditText xjumlah;
    private Button xeatbus;
    private Button xabnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xmenu = findViewById(R.id.namamenu);
        xjumlah = findViewById(R.id.jumlah);
        xeatbus = findViewById(R.id.eatbus);
        xabnormal = findViewById(R.id.abnormal);

        xeatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent eatbos = new Intent(MainActivity.this, Main2Activity.class);
                eatbos.putExtra("namatempat", "EATBUS");
                eatbos.putExtra("namamenumakanan", xmenu.getText().toString());
                eatbos.putExtra("jumlahporsi", xjumlah.getText().toString());
                eatbos.putExtra("totalharga", "50000");
                startActivity(eatbos);
            }
        });

        xabnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abnormal = new Intent(MainActivity.this, Main2Activity.class);
                abnormal.putExtra("namatempat", "ABNORMAL");
                abnormal.putExtra("namamenumakanan", xmenu.getText().toString());
                abnormal.putExtra("jumlahporsi", xjumlah.getText().toString());
                abnormal.putExtra("totalharga", "30000");
                startActivity(abnormal);
            }
        });
    }
}