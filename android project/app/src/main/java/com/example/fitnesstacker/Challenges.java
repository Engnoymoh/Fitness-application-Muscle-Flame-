package com.example.fitnesstacker;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Challenges extends AppCompatActivity {

    TextView timerTextView;
    Button startButton, backbtn;
    CountDownTimer countDownTimer;
    ImageView exerciseImageView;
    TextView challengeTextView;

    public static final long START_TIME_IN_MILLIS = 30000;

    String[] challenges = {
            "15 Pushups",
            "30 Second Plank",
            "20 Jumping Jacks",
            "15 Squats",
    };

    Map<String, Integer> challengeImageMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenges);

        timerTextView = findViewById(R.id.timer);
        startButton = findViewById(R.id.startButton);
        exerciseImageView = findViewById(R.id.imageView2);
        challengeTextView = findViewById(R.id.challengeTextView);
        backbtn = findViewById(R.id.backbtn);

        initializeChallengeImageMap();

        startButton.setOnClickListener(v -> {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            startTimer();
            displayRandomChallenge();
        });

        backbtn.setOnClickListener(v -> {
            finish();
        });

    }

    public void initializeChallengeImageMap() {
        challengeImageMap = new HashMap<>();
        challengeImageMap.put("15 Pushups", R.drawable.pushups);
        challengeImageMap.put("30 Second Plank", R.drawable.plank);
        challengeImageMap.put("20 Jumping Jacks", R.drawable.jumping);
        challengeImageMap.put("15 Squats", R.drawable.squats);
    }

    public void startTimer() {
        countDownTimer = new CountDownTimer(START_TIME_IN_MILLIS, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                updateTimerUI(millisUntilFinished);
            }

            @Override
            public void onFinish() {
                timerTextView.setText("00:00");
            }
        }.start();
    }

    public void updateTimerUI(long millisUntilFinished) {
        long seconds = millisUntilFinished / 1000;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", seconds / 60, seconds % 60);
        timerTextView.setText(timeLeftFormatted);
    }

    public void displayRandomChallenge() {
        List<String> challengesList = Arrays.asList(challenges);
        Collections.shuffle(challengesList);

        String randomChallenge = challengesList.get(0);
        Integer imageResource = challengeImageMap.get(randomChallenge);

        if (imageResource != null) {
            exerciseImageView.setImageResource(imageResource);
            challengeTextView.setText(randomChallenge);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
