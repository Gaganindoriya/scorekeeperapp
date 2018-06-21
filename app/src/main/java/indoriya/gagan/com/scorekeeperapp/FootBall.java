package indoriya.gagan.com.scorekeeperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FootBall extends AppCompatActivity {
    //score variables for both teams
    int scoreTeamA=0;
    int scoreTeanB=0;

    //for cards for team a
    int redCardTeamA=0;
    int yellowCardTeamA=0;

    //card for team b
    int redCardTeamB=0;
    int yellowCardTeamB=0;


    //teams names varibales
    String team_A_Name;
    String team_B_Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foot_ball);

        //getting values from previour activtiy passed though intent
        team_A_Name=getIntent().getStringExtra("TEAMA").toString();
        team_B_Name=getIntent().getStringExtra("TEAMB").toString();

        //getting refference to the team name textViews
        TextView t1=findViewById(R.id.team_a_name);
        TextView t2=findViewById(R.id.team_b_name);

        //setting team names to text views
        t1.setText(team_A_Name);
        t2.setText(team_B_Name);



    }


    public void addOneForTeamA(View view){
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }


    public void addOneForTeamB(View view){
        scoreTeanB=scoreTeanB+1;
        displayForTeamB(scoreTeanB);
    }

    public void displayForTeamA(int score){
        TextView tv=findViewById(R.id.team_a_score);
        tv.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //display red card for team a and team b
    public void displayRedCardForTeamA(int score){
        TextView tv=findViewById(R.id.red_card_a_text);
        tv.setText("Red Card:"+String.valueOf(score));
    }

    public void displayRedCardForTeamB(int score) {
        TextView scoreView = findViewById(R.id.red_card_b_text);
        scoreView.setText("Red Card:"+String.valueOf(score));
    }

    //display red card for team a and team b
    public void displayyellowCardForTeamA(int score){
        TextView tv=findViewById(R.id.yellow_card_a_text);
        tv.setText("Yellow Card:"+String.valueOf(score));
    }

    public void displayYellowCardForTeamB(int score) {
        TextView scoreView = findViewById(R.id.yellow_card_b_text);
        scoreView.setText("Yellow Card:"+String.valueOf(score));
    }
    public void resetScores(View view){
        scoreTeamA=0;
        scoreTeanB=0;
        redCardTeamA=0;
        redCardTeamB=0;
        yellowCardTeamA=0;
        yellowCardTeamB=0;


        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeanB);
        displayRedCardForTeamA(redCardTeamA);
        displayRedCardForTeamB(redCardTeamB);
        displayyellowCardForTeamA(yellowCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);
    }


    public void winner(View v){

        Intent i=new Intent(this,Winner.class);
        if(scoreTeamA > scoreTeanB){
            i.putExtra("TEAM",team_A_Name);
            i.putExtra("SCORE",""+scoreTeamA);
            startActivity(i);
        }else if(scoreTeanB > scoreTeamA){
            i.putExtra("TEAM",team_B_Name);
            i.putExtra("SCORE",""+scoreTeanB);
            startActivity(i);
        }else {
            Toast.makeText(this, "It's a draw match", Toast.LENGTH_SHORT).show();
        }

    }

    public void addOneForTeamAredCard(View view) {
        redCardTeamA=redCardTeamA+1;
        displayRedCardForTeamA(redCardTeamA);
    }
    public void addOneForTeamBredCard(View view) {
        redCardTeamB=redCardTeamB+1;
        displayRedCardForTeamB(redCardTeamB);
    }
    public void addOneForTeamAyellowCard(View view) {
        yellowCardTeamA=yellowCardTeamA+1;
        displayyellowCardForTeamA(yellowCardTeamA);
    }

    public void addOneForTeamByellowCard(View view) {
        yellowCardTeamB=yellowCardTeamB+1;
        displayYellowCardForTeamB(yellowCardTeamB);
    }


}
