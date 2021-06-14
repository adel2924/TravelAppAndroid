package uk.ac.napier.set08114.travelapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //sets the buttons and text for the main page for when the user runs the app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton rb0 = (RadioButton) findViewById(R.id.radioButton);
        rb0.setOnClickListener(radioGroupClick);

        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton2);
        rb1.setOnClickListener(radioGroupClick);

        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton3);
        rb2.setOnClickListener(radioGroupClick);

        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton4);
        rb3.setOnClickListener(radioGroupClick);

    }
    //sets the intents for the buttons, will open the appropriate activity
    public View.OnClickListener radioGroupClick = new View.OnClickListener() {
        public void onClick(View view) {
            RadioButton rb = (RadioButton) view;
            ImageView iv = (ImageView) findViewById(R.id.imageView);

            if (rb.getText().equals("Edinburgh Castle")) {
                //iv.setImageResource(R.drawable.castle);
                Intent activityA = new Intent(MainActivity.this, ActivityA.class);

                startActivityForResult(activityA, 1);

            } else if (rb.getText().equals("Loch Ness")) {
                //iv.setImageResource(R.drawable.lochness);
                Intent activityB = new Intent(MainActivity.this, ActivityB.class);

                startActivityForResult(activityB, 2);

            } else if (rb.getText().equals("Ben Nevis")) {
                //iv.setImageResource(R.drawable.bennevis);
                Intent activityC = new Intent(MainActivity.this, ActivityC.class);

                startActivityForResult(activityC, 3);

            } else if (rb.getText().equals("Quiz")) {
                Intent quiz = new Intent(MainActivity.this, Quiz.class);

                startActivity(quiz);
            }

        }
    };

    //sends back a message (toast) which will show up at the bottom of the screen
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //Check which request we're responding to - only 1!
        if (requestCode == 1) {
            //Make sure request was successful
            if (resultCode == 1) {
                String returnString = data.getStringExtra("String");
                Toast.makeText(getBaseContext(),
                        "In main and string returned = " +
                                returnString, Toast.LENGTH_LONG).show();
            }
        }
        //checking for request 2 activityB
        if (requestCode == 2) {
            //Make sure request was successful
            if (resultCode == 2) {
                String returnString = data.getStringExtra("String");
                Toast.makeText(getBaseContext(),
                        "In main and string returned = " +
                                returnString, Toast.LENGTH_LONG).show();
            }
        }
        //checking for request 3 activityC
        if (requestCode == 3) {
            //Make sure request was successful
            if (resultCode == 3) {
                String returnString = data.getStringExtra("String");
                Toast.makeText(getBaseContext(),
                        "In main and string returned = " +
                                returnString, Toast.LENGTH_LONG).show();
            }
        }
        //checking for request 4 activityD/Quiz
        if (requestCode == 4) {
            //Make sure request was successful
            if (resultCode == 4) {
                String returnString = data.getStringExtra("String");
                Toast.makeText(getBaseContext(),
                        "In main and string returned = " +
                                returnString, Toast.LENGTH_LONG).show();
            }
        }

    }

}
