package com.example.fitnesstacker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {
    TextView cal, protein, carb;
    ImageView cardio, lifts;
    Button btn;
    CardView challengesCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        cal = findViewById(R.id.cal);
        protein = findViewById(R.id.protein);
        carb = findViewById(R.id.carb);
        cardio = findViewById(R.id.cardio);
        lifts = findViewById(R.id.lifts);
        btn = findViewById(R.id.btn);
        challengesCard = findViewById(R.id.challengesCard);

        Bundle b = getIntent().getExtras();
        if (b != null) {
            int calories = b.getInt("calorie");
            int proteinValue = b.getInt("protein");
            int carbValue = b.getInt("carb");

            animateTextView(cal, calories);
            animateTextView(protein, proteinValue);
            animateTextView(carb, carbValue);
        }

        cardio.setOnClickListener(v -> {
            Intent intent = new Intent(activity2.this, Cardio.class);
            startActivity(intent);
        });

        challengesCard.setOnClickListener(v -> {
            Intent intent = new Intent(activity2.this, Challenges.class);
            startActivity(intent);
        });

        lifts.setOnClickListener(v -> {
            Intent intent = new Intent(activity2.this, lifts.class);
            startActivity(intent);
        });

        btn.setOnClickListener(v -> {
            Intent intent = new Intent(activity2.this, MainActivity.class);
            startActivity(intent);
        });
    }

    public void animateTextView(final TextView textView, final int targetValue) {
        ValueAnimator animator = ValueAnimator.ofInt(0, targetValue);
        animator.setDuration(1000);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int animatedValue = (int) animation.getAnimatedValue();
                textView.setText(String.valueOf(animatedValue));
            }
        });

        animator.start();
    }
}
