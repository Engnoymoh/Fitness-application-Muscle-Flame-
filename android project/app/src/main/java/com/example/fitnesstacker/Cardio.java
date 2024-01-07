package com.example.fitnesstacker;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Cardio extends AppCompatActivity {
    CardView cvjacks;
    CardView cvsquats;
    CardView cvplank;
    CardView cvhighknees;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);

        cvjacks = findViewById(R.id.cvjacks);
        cvsquats = findViewById(R.id.cvsquats);
        cvplank = findViewById(R.id.cvplank);
        cvhighknees = findViewById(R.id.cvhighknees);
        btnback = findViewById(R.id.btnback);


        cvjacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.bottom_dialog);
            }
        });

        cvsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.squat_bottom_dialog);
            }
        });

        cvplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.plank_bottom_dialog);
            }
        });
        cvhighknees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.highknees_bottom_dialog);
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

    }

    public void showBottomDialog(int layoutResId) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(layoutResId);
        bottomSheetDialog.show();
    }

}
