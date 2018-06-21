package indoriya.gagan.com.scorekeeperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //edittext refference variables
    EditText teamA,teamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing editetxts
        teamA=findViewById(R.id.editText);
        teamB=findViewById(R.id.editText2);
    }

    //this method will be called on click of next button , this will thake names of two teams to the next activity

    public void next(View view) {
       Intent intent=new Intent(this,FootBall.class);
        intent.putExtra("TEAMA",teamA.getText().toString());
        intent.putExtra("TEAMB",teamB.getText().toString());

        startActivity(intent);
    }

    //this will thale the user to the next screen without providing names
    //in this case team-A and team-B will be passed to the next activity
    public void skip(View view){
        Intent intent=new Intent(this,FootBall.class);
        intent.putExtra("TEAMA","Team A");
        intent.putExtra("TEAMB","Team B");

        startActivity(intent);
    }


}
