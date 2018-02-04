package com.example.linggom.berliantoparlinggomsaragih_1202150016_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.linggom.berliantoparlinggomsaragih_1202150016_modul1.R;
import com.example.linggom.berliantoparlinggomsaragih_1202150016_modul1.SecondActivity;

public class MainActivity extends AppCompatActivity {
    private EditText MEditText;
    private EditText PorsiMenuEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatbus(View view) {
        MEditText = (EditText) findViewById(R.id.pmakan);
        PorsiMenuEditText = (EditText) findViewById(R.id.porsi);
        String makanan = MEditText.getText().toString();
        String JumlahPorsi = PorsiMenuEditText.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("tempatmakan","eatbus");
        intent.putExtra("menumakanan",makanan);
        intent.putExtra("jumlahporsi",JumlahPorsi);
        intent.putExtra("jumlahharga","50000");
        startActivity(intent);

    }

    public void abnormal(View view) {
        MEditText = (EditText) findViewById(R.id.pmakan);
        PorsiMenuEditText = (EditText) findViewById(R.id.porsi);
        String makanan = MEditText.getText().toString();
        String JumlahPorsi = PorsiMenuEditText.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("tempat","abnormal");
        intent.putExtra("menumakanan",makanan);
        intent.putExtra("jumlahporsi",JumlahPorsi);
        intent.putExtra("jumlahharga","30000");
        startActivity(intent);

    }
}