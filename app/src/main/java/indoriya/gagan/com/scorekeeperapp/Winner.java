package indoriya.gagan.com.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Winner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        TextView tvwinner=findViewById(R.id.winnertxt);
        String team=getIntent().getStringExtra("TEAM").toString();
        String score=getIntent().getStringExtra("SCORE").toString();
        tvwinner.setText("Congratulations : \n"+team+"\nScore :"+score);
    }
}
