package com.example.myspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView textTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        textTemp = findViewById(R.id.textTemp);
    }

    public void showTemp(View view) {
        int position = spinner.getSelectedItemPosition();
        textTemp.setText(getDescriptionByPosition(position));

    }
    private String getDescriptionByPosition (int position){
        String[] description = getResources().getStringArray(R.array.characteristic);
        return  description[position];
    }
}
