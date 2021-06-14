package uk.ac.napier.set08114.travelapp;

import android.support.v7.app.AppCompatActivity;

public class Question extends AppCompatActivity {
    //the three questions of the quiz
    public String questions[] = {
            "Which is Scotland's official national animal?",
            "Which is Scotland's largest city?",
            "Approximately what is the percentage of redheads in Scotland?"
    };
    //4 choices for each question
    public String choices[][] = {
            {"Lion", "Horse", "Unicorn", "Dolphin"},
            {"Edinburgh", "Glasgow", "Aberdeen", "Inverness"},
            {"1-2%", "20%", "5%", "6-13%"}
    };
    //the correct choice out of the 4 possibilities
    public String correctAnswer[] = {
            "Unicorn",
            "Glasgow",
            "6-13%"
    };
    //supposed to get a question out of the 3 (NOT WORKING)
    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }
    //gets the first choice
    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }
    //gets the second choice
    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }
    //gets the third choice
    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }
    //gets the fourth choice
    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }
    //gets the correct answer of the specific question
    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
