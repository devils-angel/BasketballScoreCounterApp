package com.example.basketballscorecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //initaialising the scores
    int score_A = 0;
    int score_B = 0;

    //creating the required functions to add points

    public void add_three_team_A(View view){
        score_A +=  3;
        display_A( );

    }

    public void add_two_team_A(View view){
        score_A +=  2;
        display_A( );

    }
    public void add_one_team_A(View view){
        score_A +=  1;
        display_A( );

    }
    public void add_three_team_B(View view){
        score_B +=  3;
        display_B( );

    }
    public void add_two_team_B(View view){
        score_B +=  2;
        display_B( );

    }
    public void add_one_team_B(View view){
        score_B +=  1;
        display_B( );

    }


    //functions to display the scores
    public void display_A(){
        TextView team_a_display = findViewById(R.id.textView2);
        team_a_display.setText(""+score_A);
    }

    public void display_B(){
        TextView team_a_display = findViewById(R.id.textView4);
        team_a_display.setText(""+score_B);

    }

    public void reset(View view){
        score_A = 0;
        score_B = 0;
        display_A();
        display_B();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
