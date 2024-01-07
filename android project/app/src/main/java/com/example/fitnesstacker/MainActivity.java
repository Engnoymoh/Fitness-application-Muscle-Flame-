package com.example.fitnesstacker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText weight;
    CheckBox malecb, femalecb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.weight);
        malecb = findViewById(R.id.malecb);
        femalecb = findViewById(R.id.femalecb);

        malecb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (malecb.isChecked()) {
                    femalecb.setChecked(false);
                }
            }
        });

        femalecb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (femalecb.isChecked()) {
                    malecb.setChecked(false);
                }
            }
        });
    }

    public void Buclick(View view) {
        String weightText = weight.getText().toString().trim();

        if (weightText.isEmpty()) {
            weight.setError("Please enter the weight");
            return;
        }

        int kg = Integer.parseInt(weightText);

        int totalcal = 0;
        int totalprotein = 0;
        int totalcarb = 0;


        if (!malecb.isChecked() && !femalecb.isChecked()) {

            malecb.setError("Select at least one gender");
            femalecb.setError("Select at least one gender");
            return;
        }

        weight.setError(null);
        malecb.setError(null);
        femalecb.setError(null);

        if (malecb.isChecked()) {
            totalcal = kg * 35;
            totalprotein = kg * 2;
            totalcarb = kg * 5;
        }

        if (femalecb.isChecked()) {
            totalcal = kg * 28;
            totalprotein = kg * 1;
            totalcarb = kg * 3;
        }

        Intent intent = new Intent(this, activity2.class);
        intent.putExtra("calorie", totalcal);
        intent.putExtra("protein", totalprotein);
        intent.putExtra("carb", totalcarb);
        startActivity(intent);
    }
}
