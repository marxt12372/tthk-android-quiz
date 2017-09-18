package eu.marxt12372.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity
{
    TextView score1;
    TextView score2;
    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();
        int score = 0;
        int maxscore = 0;
        score = intent.getIntExtra("score_current", score);
        maxscore = intent.getIntExtra("score_max", maxscore);

        score1 = (TextView) findViewById(R.id.score2);
        score2 = (TextView) findViewById(R.id.score3);
        backbtn = (Button) findViewById(R.id.button5);

        score1.setText(getString(R.string.score) + score + getString(R.string.score2));
        score2.setText(getString(R.string.score3) + maxscore);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Quiz.class);
                startActivity(intent);
            }
        });
    }
}
