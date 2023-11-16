package com.example.s;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pierwszyTekst = findViewById(R.id.pierwszyTekst);
        TextView drugiTekst = findViewById(R.id.drugiTekst);
        EditText imie = findViewById(R.id.imie);
        Button zmien = findViewById(R.id.zmien);
        Button kopiuj = findViewById(R.id.kopiuj);
        Button zatwierdz = findViewById(R.id.zatwierdz);
        Button sprawdz = findViewById(R.id.sprawdz);

        zmien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pierwszyTekst.setText("Inny Tekst");
            }
        });
        kopiuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = pierwszyTekst.getText().toString();
                drugiTekst.setText(text);
            }
        });
        zatwierdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = imie.getText().toString();
                if (text.isEmpty())
                    Toast.makeText(getBaseContext(),"Nie wpisałeś imienia",Toast.LENGTH_LONG).show();
                else
                Toast.makeText(getBaseContext(),"Twoje imie to " + text,Toast.LENGTH_LONG).show();
            }
        });
        sprawdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pierwszyTekst.getText() == drugiTekst.getText())
                    Toast.makeText(getBaseContext(),"Teksty są takie same",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getBaseContext(),"Teksty są inne ",Toast.LENGTH_LONG).show();
            }
        });
    }
}