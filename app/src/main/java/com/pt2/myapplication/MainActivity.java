package com.pt2.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private ListView lista;
    private ListView lista2;
    private EditText cenaPole;
    private SeekBar rok;
    private CheckBox wlasciciel;
    private TextView all;
    private RadioGroup radioGroup;
    private RadioButton radio;
    private Button dodaj;
    private TextView rokTekst;
    private ArrayList<String> modelLista;
    private ArrayList<Samochody> ofertaLista;
    private ArrayAdapter<String> arrayAdapter;
    private ArrayAdapter<Samochody> arrayAdapter2;

    private String marka;
    private String model;
    private int rocznik;
    private double cena;
    private boolean czyWlasciciel;
    private String historia;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        marka = "";
        model = "";
        rocznik = 0;
        cena = 0;
        czyWlasciciel = false;
        historia = "";

        all = findViewById(R.id.all);
        lista = findViewById(R.id.lista);
        lista2 = findViewById(R.id.lista2);
        spinner = findViewById(R.id.marki);
        rok = findViewById(R.id.rok);
        rokTekst = findViewById(R.id.rokTekst);
        wlasciciel = findViewById(R.id.wlascicel);
        dodaj = findViewById(R.id.dodaj);
        radioGroup = findViewById(R.id.radioGroup);
        cenaPole = findViewById(R.id.cena);

        String[][] tablica = {
                {"Yaris", "Corolla", "RAV4"},
                {"Focus", "Mustang", "Fiesta", "Explorer"},
                {"Civic", "Accord"},
                {"Astra", "Corsa", "Insignia", "Mokka", "Adam"},
                {"Clio"}
        };

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.marki_lista,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        modelLista = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, modelLista);
        lista.setAdapter(arrayAdapter);

        ofertaLista = new ArrayList<>();
        arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ofertaLista);
        lista2.setAdapter(arrayAdapter2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                modelLista.clear();
                for (String s : tablica[i]) {
                    modelLista.add(s);
                }
                arrayAdapter.notifyDataSetChanged();
                marka = spinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        lista.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        model = lista.getItemAtPosition(i).toString();
                    }
                }
        );

        int minRok = 2000;
        int maxRok = 2026;

        rok.setMax(maxRok - minRok);
        rok.setProgress(0);
        rokTekst.setText(String.valueOf(minRok));
        rocznik = minRok;

        rok.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                rocznik = minRok + i;
                rokTekst.setText(String.valueOf(rocznik));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        if (i == -1) {
                            historia = "";
                            return;
                        }
                        radio = findViewById(i);
                        historia = radio.getText().toString();
                    }
                }
        );
        dodaj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (marka.isEmpty() || model.isEmpty() || historia.isEmpty()) {
                            Toast.makeText(MainActivity.this, "Uzupełnij wszystkie pola", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        try {
                            cena = Double.parseDouble(cenaPole.getText().toString());
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "Nieprawidłowa cena", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        czyWlasciciel = wlasciciel.isChecked();

                        Samochody samochod = new Samochody(cena, marka, model, rocznik, czyWlasciciel, historia);
                        ofertaLista.add(samochod);
                        arrayAdapter2.notifyDataSetChanged();

                        cenaPole.setText("");
                        wlasciciel.setChecked(false);
                        radioGroup.clearCheck();
                        rok.setProgress(0);
                        rokTekst.setText(String.valueOf(minRok));
                        rocznik = minRok;
                        model = "";
                        historia = "";
                    }
                }
        );
    }
}