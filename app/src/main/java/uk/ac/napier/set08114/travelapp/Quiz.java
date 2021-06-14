package uk.ac.napier.set08114.travelapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class Quiz extends AppCompatActivity  implements View.OnClickListener{
//This code will automatically generate a random question every time the answer is correct
    Button btn_one, btn_two, btn_three, btn_four;
    TextView tv_question;

    private Question question = new Question();

    private String answer;
    private int questionLength = question.questions.length;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        //selects a random question for the user when they open the activity and also 4 possible answers on the buttons
        random = new Random();
        Button btn_one = findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);

        Button btn_two = findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);

        Button btn_three = findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this);

        Button btn_four = findViewById(R.id.btn_four);
        btn_four.setOnClickListener(this);

        tv_question = (TextView) findViewById(R.id.tv_question);

        NextQuestion(random.nextInt(questionLength));

        //send back a message at the bottom of the screen when returning from Quiz to home page
        String stringToReturn = "Message back from Activity D";
        //sets the unique intent of this activity
        Intent returnIntent = new Intent();
        returnIntent.putExtra("String", stringToReturn);
        setResult(4, returnIntent);
    }

    @Override
    //checks for correct and incorrect answers and gives appropriate output
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one:
                if(btn_one.getText() == answer){
                    Toast.makeText(Quiz.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    GameOver();
                }

                break;

            case R.id.btn_two:
                if(btn_two.getText() == answer){
                    Toast.makeText(Quiz.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    GameOver();
                }

                break;

            case R.id.btn_three:
                if(btn_three.getText() == answer){
                    Toast.makeText(Quiz.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    GameOver();
                }

                break;

            case R.id.btn_four:
                if(btn_four.getText() == answer){
                    Toast.makeText(Quiz.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionLength));
                }else{
                    GameOver();
                }

                break;
        }
    }
    //stops the quiz when the user answers incorrectly and gives appropriate output
    private void GameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Quiz.this);
        alertDialogBuilder
                .setMessage("Game Over")
                .setCancelable(false)
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        alertDialogBuilder.show();
    }
    //supposed to get the next question for the quiz (NOT WORKING)
    private void NextQuestion(int num) {
        tv_question.setText(question.getQuestion(num));
        btn_one.setText(question.getchoice1(num));
        btn_two.setText(question.getchoice2(num));
        btn_three.setText(question.getchoice3(num));
        btn_four.setText(question.getchoice4(num));

        answer = question.getCorrectAnswer(num);
    }

}
