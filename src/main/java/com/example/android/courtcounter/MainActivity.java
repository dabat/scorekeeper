package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamAScore = 0;
    int teamBScore = 0;

//    TextView teamAScoreText = findViewById(R.id.team_a_score_text);
//    int teamAScore = Integer.parseInt(teamAScoreText.getText().toString());
//    TextView teamAScoreText = findViewById(R.id.text_score_team_b);
//    int scoreTeamB = Integer.parseInt(teamAScoreText.getText().toString());

    public void teamAPointAddOne(View view) {
        teamAScore += 1;
        teamAPointAdd(teamAScore);
    }

    public void teamAPointAddTwo(View view) {
        teamAScore += 2;
        teamAPointAdd(teamAScore);
    }

    public void teamAPointAddThree(View view) {
        teamAScore += 3;
        teamAPointAdd(teamAScore);
    }

    public void teamAPointAdd(int score) {
        TextView TeamAScoreTextView = findViewById(R.id.team_a_score_text);
        scoreUpdate(TeamAScoreTextView, score);
    }

    public void teamBPointAdd(int score) {
        TextView TeamBScoreTextView = findViewById(R.id.team_b_score_text);
        scoreUpdate(TeamBScoreTextView, score);
    }

    private void scoreUpdate(TextView ScoreTextView, int score) {
        ScoreTextView.setText(String.valueOf(score));
    }

    public void resetAll(View view) {
        TextView TeamAScoreTextView = findViewById(R.id.team_a_score_text);
        teamAScore = 0;
        scoreUpdate(TeamAScoreTextView, teamAScore);

        TextView TeamBScoreTextView = findViewById(R.id.team_b_score_text);
        teamBScore = 0;
        scoreUpdate(TeamBScoreTextView, teamBScore);
    }

    public void teamBPointAddThree(View view) {
        teamBScore += 3;
        teamBPointAdd(teamBScore);
    }

    public void teamBPointAddTwo(View view) {
        teamBScore += 2;
        teamBPointAdd(teamBScore);
    }

    public void teamBPointAddOne(View view) {
        teamBScore += 1;
        teamBPointAdd(teamBScore);
    }
}
