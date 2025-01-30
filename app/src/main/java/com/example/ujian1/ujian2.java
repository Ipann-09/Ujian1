package com.example.ujian1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ujian2 extends AppCompatActivity {

    private TextView textViewOutput;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewOutput = findViewById(R.id.textView2);
        buttonSend = findViewById(R.id.buttonSend);

        // Menampilkan pesan jika dikirim dari Activity sebelumnya
        String message = getIntent().getStringExtra("EXTRA_MESSAGE");
        if (message != null) {
            textViewOutput.setText(message);
        }

        // Menangani klik tombol untuk pindah ke Home Activity
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ujian2.this, home.class);
                startActivity(intent);
            }
        });
    }
}
