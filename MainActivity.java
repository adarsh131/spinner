package com.example.spinner3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
        String[] country = { "India", "USA", "China", "Japan", "Other"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp = (Spinner) findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(this);


        ArrayAdapter<String> data = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, country);
        data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(data);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),country[position] , Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}