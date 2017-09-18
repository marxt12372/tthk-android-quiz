package eu.marxt12372.quiz;

import java.util.ArrayList;
import java.util.List;

public class Questions
{
    private String MyQuestions [] = {
            "Kys1",
            "Kys2",
            "Kys3",
            "Kys4",
            "Kys5"
    };

    private String MyChoices [] [] = {
            {"Vastus1", "Vastus2", "Vastus3", "Vastus4"},
            {"Vastus1", "Vastus2", "Vastus3", "Vastus4"},
            {"Vastus1", "Vastus2", "Vastus3", "Vastus4"},
            {"Vastus1", "Vastus2", "Vastus3", "Vastus4"},
            {"Vastus1", "Vastus2", "Vastus3", "Vastus4"}
    };

    private String MyCorrectAnswers [] = {
            "Vastus1", "Vastus1", "Vastus1", "Vastus1", "Vastus1"
    };

    public String getQuestion(int question)
    {
        return MyQuestions[question];
    }

    public List<String> getAnswers(int question)
    {
        List<String> answers = new ArrayList<String>();
        for(int i = 0; i <= 3; i++)
        {
            answers.add(MyChoices[question][i]);
        }
        return answers;
    }

    public String getCorrentAnswer(int question)
    {
        return MyCorrectAnswers[question];
    }
}
