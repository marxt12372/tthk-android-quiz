package eu.marxt12372.quiz;

import java.util.ArrayList;
import java.util.List;

public class Questions
{
    private String MyQuestions [] = {
            "Which Android component is responsible for displaying the application user interface?",
            "How does Android know which components are in the application?",
            "What widget can replace any use of radio buttons?",
            "Where do you write the code that makes all the widgets work?",
            "Is what you're doing in any way, shape or form useful?"
    };

    private String MyChoices [] [] = {
        {"Layout", "Activity", "Window", "Manifest"},
        {"By type", "The Android Manifest", "They are registered when Main() is called", "By class"},
        {"Toggle Button", "Spinner", "Switch Button", "Image Button"},
        {"Wherever I want", "In XML files", "In the java class", "What is code? Better yet WTF is a widget???"},
        {"Yes", "No", "Maybe", "I Still Don't Know Where I am or What I'm Doing"}
    };

    private String MyCorrectAnswers [] = {
        "Layout", "The Android Manifest", "Spinner", "In the java class", "Maybe"
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
