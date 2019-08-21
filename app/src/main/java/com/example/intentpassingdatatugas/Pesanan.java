package com.example.intentpassingdatatugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        TextView nama   = findViewById(R.id.nama);
        TextView alamat = findViewById(R.id.alamat);
        TextView pesanan= findViewById(R.id.pesanan);
        Bundle bundle = getIntent().getExtras();

        String n = bundle.getString("nama");
        String a = bundle.getString("alamat");
        String p = bundle.getString("pesan");

        nama.setText(n);
        alamat.setText(a);
        pesanan.setText(p);

        Button btn = findViewById(R.id.cancel);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pesanan.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
