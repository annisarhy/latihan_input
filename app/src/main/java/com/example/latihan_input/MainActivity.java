package com.example.latihan_input;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText bilangan1;
    private EditText bilangan2;
    private EditText jumlah;
    private Button btnhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI(){
        bilangan1 = (EditText) findViewById(R.id.txtBiL1);
        bilangan2 = (EditText) findViewById(R.id.txtBiL2);
        jumlah = (EditText) findViewById(R.id.hasil);
        btnhasil = (Button) findViewById(R.id.btnCekBil);
    }
    private void initEvent (){
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }
    private void hitungJumlah(){
        int angka1 = Integer.parseInt(bilangan1.getText().toString());
        int angka2 = Integer.parseInt(bilangan2.getText().toString());
        int total = angka1 + angka2;
        jumlah.setText(total+"");
    }
}
