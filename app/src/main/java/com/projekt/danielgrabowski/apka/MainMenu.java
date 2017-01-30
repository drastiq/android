package com.projekt.danielgrabowski.apka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.projekt.danielgrabowski.apka.R.layout.activity_main_menu);
        Button wydajPol = (Button) findViewById(com.projekt.danielgrabowski.apka.R.id.button8);
        Button listaPol = (Button) findViewById(com.projekt.danielgrabowski.apka.R.id.button9);


        wydajPol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainMenu.this, WydajPolecenie.class);
                startActivity(in);
            }
        });
        listaPol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainMenu.this, ListaKomend.class);
            }
        });


    }
}
