package com.example.scrolview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo de seleccion
    public void Seleccion (View view){
        switch (view.getId()){
            case R.id.Platanos:
                Toast.makeText(this, "Estas son Platanos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Cerezas:
                Toast.makeText(this, "Estas son Cerezas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Frambuesas:
                Toast.makeText(this, "Estas son Franbuesas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Fresas:
                Toast.makeText(this, "Estas son fresas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Kiwis:
                Toast.makeText(this, "Estas son Kiwis", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Mangos:
                Toast.makeText(this, "Estas son Mangos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Manzanas:
                Toast.makeText(this, "Estas son Manzanas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Melon:
                Toast.makeText(this, "Esto es Melon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Naranjas:
                Toast.makeText(this, "Estas son Naranjas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Peras:
                Toast.makeText(this, "Estas son Peras", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Pina:
                Toast.makeText(this, "Esta es una Piña", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Uvas:
                Toast.makeText(this, "Estas son Uvas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Zarzamora:
                Toast.makeText(this, "Estas son Zarzamoras", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Sandia:
                Toast.makeText(this, "Esta es una Sandia", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}