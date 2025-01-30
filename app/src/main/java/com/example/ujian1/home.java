package com.example.ujian1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    private TextView textViewOutput;
    private Button buttonSend;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textViewOutput = findViewById(R.id.textView5);
        buttonSend = findViewById(R.id.buttonSend);

        // Menampilkan pesan jika dikirim dari Activity sebelumnya
        String message = getIntent().getStringExtra("EXTRA_MESSAGE");
        if (message != null) {
            textViewOutput.setText(message);
        }

        // Menangani klik tombol untuk kembali ke MainActivity
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
