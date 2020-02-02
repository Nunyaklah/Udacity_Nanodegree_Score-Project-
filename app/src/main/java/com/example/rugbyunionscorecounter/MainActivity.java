package com.example.rugbyunionscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int rugbyTeamA = 0;
    int rugbyTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(rugbyTeamA);
        displayForTeamB(rugbyTeamB);
    }


    public void tryScoreTeamA(View v){
        rugbyTeamA = rugbyTeamA + 5;
        displayForTeamA(rugbyTeamA);
    }

    public void conversionKickTeamA(View v){
        rugbyTeamA = rugbyTeamA +2;
        displayForTeamA(rugbyTeamA);
    }

    public void penaltyTeamA(View v){
        rugbyTeamA = rugbyTeamA +3;
        displayForTeamA(rugbyTeamA);
    }


    public void tryScoreTeamB(View v){
        rugbyTeamB = rugbyTeamB + 5;
        displayForTeamB(rugbyTeamB);
    }

    public void conversionKickTeamB(View v){
        rugbyTeamB = rugbyTeamB +2;
        displayForTeamB(rugbyTeamB);
    }

    public void penaltyTeamB(View v){
        rugbyTeamB = rugbyTeamB +3;
        displayForTeamB(rugbyTeamB);
    }


    public void  reset(View v){
        rugbyTeamA =0;
        rugbyTeamB =0;
        displayForTeamA(rugbyTeamA);
        displayForTeamB(rugbyTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
