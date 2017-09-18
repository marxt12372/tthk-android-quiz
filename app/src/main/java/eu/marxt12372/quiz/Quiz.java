package eu.marxt12372.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Quiz extends AppCompatActivity
{
    private int maxScore;
    private int question;
    private int currentscore;
    private Questions questions;

    private TextView quiz;
    private TextView score;
    private Button[] btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questions = new Questions();

        quiz = (TextView) findViewById(R.id.quiz);
        score = (TextView) findViewById(R.id.score);
        btn = new Button[4];
        btn[0] = (Button) findViewById(R.id.button);
        btn[1] = (Button) findViewById(R.id.button2);
        btn[2] = (Button) findViewById(R.id.button3);
        btn[3] = (Button) findViewById(R.id.button4);

        question = 0;
        currentscore = 0;
        maxScore = 0; //TODO: Salvestada file ja laadida filest???

        changeQuestion(question);

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn[0].getText().toString().equals(questions.getCorrentAnswer(question))) //Õige vastus
                {
                    Toast.makeText(getBaseContext(), getString(R.string.answerright), Toast.LENGTH_SHORT).show();
                    currentscore++;
                }
                else //Vale vastus
                {
                    Toast.makeText(getBaseContext(), getString(R.string.answerwrong), Toast.LENGTH_SHORT).show();
                }
                nextPage();
            }
        });

        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn[1].getText().toString().equals(questions.getCorrentAnswer(question))) //Õige vastus
                {
                    Toast.makeText(getBaseContext(), getString(R.string.answerright), Toast.LENGTH_SHORT).show();
                    currentscore++;
                }
                else //Vale vastus
                {
                    Toast.makeText(getBaseContext(), getString(R.string.answerwrong), Toast.LENGTH_SHORT).show();
                }
                nextPage();
            }
        });

        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn[2].getText().toString().equals(questions.getCorrentAnswer(question))) //Õige vastus
                {
                    Toast.makeText(getBaseContext(), getString(R.string.answerright), Toast.LENGTH_SHORT).show();
                    currentscore++;
                }
                else //Vale vastus
                {
                    Toast.makeText(getBaseContext(), getString(R.string.answerwrong), Toast.LENGTH_SHORT).show();
                }
                nextPage();
            }
        });

        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn[3].getText().toString().equals(questions.getCorrentAnswer(question))) //Õige vastus
                {
                    Toast.makeText(getBaseContext(), getString(R.string.answerright), Toast.LENGTH_SHORT).show();
                    currentscore++;
                }
                else //Vale vastus
                {
                    Toast.makeText(getBaseContext(), getString(R.string.answerwrong), Toast.LENGTH_SHORT).show();
                }
                nextPage();
            }
        });
    }

    public void nextPage()
    {
        if(question < 4)
        {
            question++;
            changeQuestion(question);
        }
        else if(question == 4)
        {
            question = 0;
            Intent intent = new Intent(this, ScoreActivity.class);
            intent.putExtra("score_current", currentscore);
            intent.putExtra("score_max", maxScore);
            startActivity(intent);
        }
    }

    public void changeQuestion(int newQuestion)
    {
        quiz.setText(questions.getQuestion(newQuestion));
        score.setText(currentscore + "/" + maxScore);
        List<String> answers = questions.getAnswers(newQuestion);
        for(int i = 0; i <= 3; i++)
        {
            btn[i].setText(answers.get(i));
        }
    }
}
