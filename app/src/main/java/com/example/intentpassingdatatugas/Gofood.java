package com.example.intentpassingdatatugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Gofood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);

        final EditText nama =  findViewById(R.id.editNama);
        final EditText alamat =  findViewById(R.id.editAlamat);
        final EditText pesan =  findViewById(R.id.editPesan);

        Button btn = findViewById(R.id.Order);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gofood.this, Pesanan.class);
                intent.putExtra("nama", nama.getText().toString());
                intent.putExtra("alamat", alamat.getText().toString());
                intent.putExtra("pesan", pesan.getText().toString());
                startActivity(intent);
            }
        });
    }
}
