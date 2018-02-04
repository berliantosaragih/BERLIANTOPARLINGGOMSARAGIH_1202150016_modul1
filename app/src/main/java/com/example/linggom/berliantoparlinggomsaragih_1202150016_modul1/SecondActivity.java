package com.example.linggom.berliantoparlinggomsaragih_1202150016_modul1;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.linggom.berliantoparlinggomsaragih_1202150016_modul1.R;

public class SecondActivity extends AppCompatActivity {
    private TextView tempatmakan;
    private TextView menumakananan;
    private TextView porsi;
    private TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tempatmakan = (TextView) findViewById(R.id.tempat);
        menumakananan = (TextView) findViewById(R.id.menumakanan);
        porsi = (TextView) findViewById(R.id.jumlahporsi);
        harga = (TextView) findViewById(R.id.jumlahharga);
        Intent intent = getIntent();
        String valtempat= intent.getStringExtra("tempatmakan");
        String valmenumakanan= intent.getStringExtra("menumakanan");
        String valjumlahporsi= intent.getStringExtra("jumlahporsi");
        String valjumlahharga= intent.getStringExtra("jumlahharga");
        int jumlah_harga = Integer.valueOf(valjumlahharga)*Integer.valueOf(valjumlahporsi);

        tempatmakan.setText(valtempat);
        menumakananan.setText(valmenumakanan);
        porsi.setText(valjumlahporsi);
        harga.setText(String.valueOf(jumlah_harga));



        if(jumlah_harga > 65000){
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Jangan makan disini,kamu ga akan kuat,uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        }else{
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "gapapa makan disini aja mah!!",Toast.LENGTH_LONG);
            toast.show();

        }

    }
}