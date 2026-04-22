package com.example.listsederhana;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] daftarMakanan = {
            "Nasi Goreng",
            "Mie Goreng",
            "Sate Ayam",
            "Bakso",
            "Soto",
            "Rendang",
            "Ayam Geprek"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewMakanan);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                daftarMakanan
        );

        listView.setAdapter(adapter);
    }
}