package com.example.linearlayout;  // Perbaikan pada deklarasi package

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;  // Import tambahan untuk Toast

import com.example.linearlayout.R;

public class MainActivity extends AppCompatActivity {  // Ganti nama kelas dari LinearLayout ke MainActivity

    // Deklarasi variabel untuk komponen UI
    private EditText toEditText;
    private EditText subjectEditText;
    private EditText messageEditText;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Pastikan nama layout sesuai dengan file XML

        // Menghubungkan komponen UI dengan ID-nya
        toEditText = findViewById(R.id.to);
        subjectEditText = findViewById(R.id.subject);
        messageEditText = findViewById(R.id.message);
        sendButton = findViewById(R.id.send);

        // Menambahkan fungsi klik pada tombol 'send'
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengambil teks dari EditText
                String to = toEditText.getText().toString();
                String subject = subjectEditText.getText().toString();
                String message = messageEditText.getText().toString();

                // Menampilkan pesan menggunakan Toast
                Toast.makeText(MainActivity.this,
                        "To: " + to + "\nSubject: " + subject + "\nMessage: " + message,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
