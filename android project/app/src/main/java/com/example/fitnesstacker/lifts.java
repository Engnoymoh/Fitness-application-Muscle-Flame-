package com.example.fitnesstacker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class lifts extends AppCompatActivity {
    CardView cvincline,cvbench,cvfly,cvfront,cvlateral,cvpress,cvlat,cvrow,cvpullup,cvrope,cvskull,cvdiamond,cvcurl,cvinclinecurl,cvhammer;
    Button btnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifts);
        cvincline = findViewById(R.id.cvincline);
        cvbench = findViewById(R.id.cvbench);
        cvfly = findViewById(R.id.cvfly);
        cvfront = findViewById(R.id.cvfront);
        cvlateral = findViewById(R.id.cvlateral);
        cvpress = findViewById(R.id.cvpress);
        cvlat = findViewById(R.id.cvlat);
        cvrow = findViewById(R.id.cvrow);
        cvpullup = findViewById(R.id.cvpullup);
        cvrope = findViewById(R.id.cvrope);
        cvskull = findViewById(R.id.cvskull);
        cvdiamond = findViewById(R.id.cvdiamond);
        cvcurl = findViewById(R.id.cvcurl);
        cvinclinecurl= findViewById(R.id.cvinclinecurl);
        cvhammer = findViewById(R.id.cvhammer);
        btnn = findViewById(R.id.btnn);




        cvincline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.incline_bottom_sheet);
            }
        });

        cvbench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.bench_bottom_sheet);
            }
        });

        cvfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.fly_bottom_sheet);
            }
        });
        cvfront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.plate_bottom_sheet);
            }
        });
        cvlateral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.lateral_bottom_sheet);
            }
        });
        cvpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.press_bottom_sheet);
            }
        });
        cvlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.lat_bottom_sheet);
            }
        });
        cvrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.row_bottom_sheet);
            }
        });
        cvpullup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.pullups_bottom_sheet);
            }
        });
        cvrope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.pushdown_bottom_sheet);
            }
        });
        cvskull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.crusher_bottom_sheet);
            }
        });
        cvdiamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.diamond_bottom_sheet);
            }
        });
        cvcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.curl_bottom_sheet);
            }
        });
        cvinclinecurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.inclinecurl_bottom_sheet);
            }
        });
        cvhammer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog(R.layout.hammer_bottom_sheet);
            }
        });
         btnn.setOnClickListener(new View.OnClickListener() {
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