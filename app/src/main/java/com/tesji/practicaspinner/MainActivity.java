package com.tesji.practicaspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.tesji.practicaspinner.model.CarrerasModel;

public class MainActivity extends AppCompatActivity {
    private Spinner spCarreras;
    private Button btnVerCarrera;
    private TextView tvImprimir;
    String [] opCarreras = {
            "--Seleccione Carrera--",
            "Ing. Industrial",
            "Ing. Sistemas Computacionales",
            "Ing. Civil",
            "Ing. Logistica",
            "Ing. Mecatrónica",
            "Ing. TIC´s",
            "Ing. Administración",
            "Ing. Química",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spCarreras = findViewById(R.id.spinnerCarreras);
        btnVerCarrera = findViewById(R.id.buttonVerCarrera);
        tvImprimir = findViewById(R.id.textViewImprimir);
        ArrayAdapter<String> adapCarreras = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opCarreras);
        spCarreras.setAdapter(adapCarreras);

        btnVerCarrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarrerasModel carrera = new CarrerasModel();
                carrera.setCarrera(spCarreras.getSelectedItemPosition());
                tvImprimir.setText(carrera.mostrarInfo());
            }
        });
        spCarreras.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CarrerasModel carrera = new CarrerasModel();
                carrera.setCarrera(spCarreras.getSelectedItemPosition());
                tvImprimir.setText(carrera.mostrarInfo());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}