package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    //    Properties
    TextView teamATitleTextView;
    TextView teamAScoreTextView;
    Button teamATouchDownButton;
    Button teamAFieldGoalButton;
    Button teamAExtraPointButton;
    Button teamASafetyButton;
    TextView teamBTitleTextView;
    TextView teamBScoreTextView;
    Button teamBTouchDownButton;
    Button teamBFieldGoalButton;
    Button teamBExtraPointButton;
    Button teamBSafetyButton;
    Button reset;
    int teamAScore;
    int teamBScore;
    int touchdownValue = 7;
    int fieldGoalValue = 3;
    int extraPointValue = 1;
    int safetyValue = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamATitleTextView = findViewById(R.id.teamATitle);
        teamAScoreTextView = findViewById(R.id.teamAScore);
        teamATouchDownButton = findViewById(R.id.teamATouchdown);
        teamAFieldGoalButton = findViewById(R.id.teamAFieldGoal);
        teamAExtraPointButton = findViewById(R.id.teamAExtraPoint);
        teamASafetyButton = findViewById(R.id.teamASafety);
        teamBTitleTextView = findViewById(R.id.teamBTitle);
        teamBScoreTextView = findViewById(R.id.teamBScore);
        teamBTouchDownButton = findViewById(R.id.teamBTouchdown);
        teamBFieldGoalButton = findViewById(R.id.teamBFieldGoal);
        teamBExtraPointButton = findViewById(R.id.teamBExtraPoint);
        teamBSafetyButton = findViewById(R.id.teamBSafety);
        reset = findViewById(R.id.reset);
        teamATitleTextView.setText("Team A");
        teamATouchDownButton.setText("Touchdown");
        teamAFieldGoalButton.setText("Field Goal");
        teamAExtraPointButton.setText("Extra Point");
        teamASafetyButton.setText("Safety");
        teamBTitleTextView.setText("Team B");
        teamBTouchDownButton.setText("Touchdown");
        teamBFieldGoalButton.setText("Field Goal");
        teamBExtraPointButton.setText("Extra Point");
        teamBSafetyButton.setText("Safety");
        reset.setText("Reset");
    }

    // Actions

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        teamAScore += score;
        teamAScoreTextView.setText(String.valueOf(teamAScore));
    }

    public void displayForTeamB(int score) {
        teamBScore += score;
        teamBScoreTextView.setText(String.valueOf(teamBScore));
    }

    public void onTeamATouchdown(View v) {
        displayForTeamA(touchdownValue);
    }

    public void onTeamAFieldGoal(View v) {
        displayForTeamA(fieldGoalValue);
    }

    public void onTeamAExtraPoint(View v) {
        displayForTeamA(extraPointValue);
    }

    public void onTeamASafety(View v) {
        displayForTeamA(safetyValue);
    }

    public void onTeamBTouchdown(View v) {
        displayForTeamB(touchdownValue);
    }

    public void onTeamBFieldGoal(View v) {
        displayForTeamB(fieldGoalValue);
    }

    public void onTeamBExtraPoint(View v) {
        displayForTeamB(extraPointValue);
    }

    public void onTeamBSafety(View v) {
        displayForTeamB(safetyValue);
    }

    public void onReset(View v) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
