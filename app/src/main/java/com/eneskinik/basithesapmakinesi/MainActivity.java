package com.eneskinik.basithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sayı1Text;
    EditText sayı2Text;
    TextView sonucText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayı1Text = findViewById(R.id.Sayı1);
        sayı2Text = findViewById(R.id.Sayı2);
        sonucText = findViewById(R.id.Sonuc);

    }

    public void Toplama(View a) {
        

            if (sayı1Text.getText().toString().matches("") || sayı2Text.getText().toString().matches("")) {

                sonucText.setText("Sayı Girmeniz Gerekir!");

            } else {

                int sayı1 = Integer.parseInt(sayı1Text.getText().toString());
                int sayı2 = Integer.parseInt(sayı2Text.getText().toString());
                int sonuc = sayı1 + sayı2;
                sonucText.setText("Sonuç :" + sonuc);

            }
    }

    public void Cıkarma(View a){


            if (sayı1Text.getText().toString().matches("") || sayı2Text.getText().toString().matches("")) {

                sonucText.setText("Sayı Girmeniz Gerekir!");

            } else {

                int sayı1 = Integer.parseInt(sayı1Text.getText().toString());
                int sayı2 = Integer.parseInt(sayı2Text.getText().toString());
                int sonuc = sayı1 - sayı2;
                sonucText.setText("Sonuç :" + sonuc);

            }

    }

    public void Carpma(View a){


            if (sayı1Text.getText().toString().matches("") || sayı2Text.getText().toString().matches("")) {

                sonucText.setText("Sayı Girmeniz Gerekir!");

            } else {

                int sayı1 = Integer.parseInt(sayı1Text.getText().toString());
                int sayı2 = Integer.parseInt(sayı2Text.getText().toString());
                int sonuc = sayı1 * sayı2;
                sonucText.setText("Sonuç :" + sonuc);

            }

    }

    public void Bolme(View a){

        if (sayı2Text.getText().toString().matches("0")){
            sonucText.setText("Bölen Sayı 0 Olamaz! Lütfen 0 dan Büyük Bir sayı Giriniz");
        } else {

            if (sayı1Text.getText().toString().matches("") || sayı2Text.getText().toString().matches("")) {

                sonucText.setText("Sayı Girmeniz Gerekir");

            } else {

                int sayı1 = Integer.parseInt(sayı1Text.getText().toString());
                int sayı2 = Integer.parseInt(sayı2Text.getText().toString());
                int sonuc = sayı1 / sayı2;
                sonucText.setText("Sonuç :" + sonuc);

            }
        }

    }


}