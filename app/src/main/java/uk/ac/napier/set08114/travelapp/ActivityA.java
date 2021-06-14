package uk.ac.napier.set08114.travelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

//all about Edinburgh Castle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ListView attractionDetails = (ListView) findViewById (R.id.attraction_listA);

        Toast.makeText(getBaseContext(), "In Activity A", Toast.LENGTH_LONG).show();
        //Navigation back is via phones back button
        String[] attractionDetailsArray = new String[] { "Fun facts:",
                "The castle sits atop a volcano",
                "The castle was once home to an elephant",
                "The KGB had the castle altered",
                "There’s a dog cemetery on the grounds of the castle",
                "It’s the most besieged place in Great Britain",
                "St. Margaret’s Chapel is the oldest building in Scotland"};

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                attractionDetailsArray);

        attractionDetails.setAdapter(adapter);
        //send back a message at the bottom of the screen when returning from ActivityA to home page
        String stringToReturn = "Message back from Activity A";
        //sets the unique intent of this activity
        Intent returnIntent = new Intent();
        returnIntent.putExtra("String", stringToReturn);
        setResult(1, returnIntent);

    }
}
