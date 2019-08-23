package com.example.lenovo.input_r;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText eMotif;
    private EditText eUkuran;
    private EditText eWarna;
    private Button bCetak;
    private TextView tOutputmotif;
    private TextView tOutputukuran;
    private TextView tOutputwarna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eMotif = findViewById(R.id.motif);
        eUkuran = findViewById(R.id.ukuran);
        eWarna = findViewById(R.id.warna);
        bCetak = findViewById(R.id.idcetak);
        tOutputmotif = findViewById(R.id.outputmotif);
        tOutputukuran = findViewById(R.id.outputukuran);
        tOutputwarna = findViewById(R.id.outputwarna);

        bCetak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String inputMotif = eMotif.getText().toString();
        String inputUkuran = eUkuran.getText().toString();
        String inputWarna = eWarna.getText().toString();

        if (inputMotif.length() == 0) {
            eMotif.setError("Data tidak boleh kosong");
        } else {
            tOutputmotif.setText(inputMotif);
        }
        if (inputUkuran.length() == 0) {
            eUkuran.setError("Data tidak boleh kosong");
        } else {
            tOutputukuran.setText(inputUkuran);
        }
        if (inputWarna.length() == 0) {
            eWarna.setError("Data tidak boleh kosong");
        } else {
            tOutputwarna.setText(inputWarna);
        }
    }
}