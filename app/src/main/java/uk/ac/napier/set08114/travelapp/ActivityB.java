package uk.ac.napier.set08114.travelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

//all about Loch Ness

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ListView attractionDetails = (ListView) findViewById (R.id.attraction_listB);

        Toast.makeText(getBaseContext(), "In Activity B", Toast.LENGTH_LONG).show();
        //Navigation back is via phones back button
        String[] attractionDetailsArray = new String[] { "Fun facts:",
                "It contains 263 billion cubic feet of water",
                "Its pitch black!",
                "The loch never freezes",
                "Loch Ness sits on the Great Fault Line",
                "A famous rock star bought a house there",
                "The first recorded sighting of the Loch Ness Monster was by a saint"};

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                attractionDetailsArray);

        attractionDetails.setAdapter(adapter);
        //send back a message at the bottom of the screen when returning from ActivityB to home page
        String stringToReturn = "Message back from Activity B";
        //sets the unique intent of this activity
        Intent returnIntent = new Intent();
        returnIntent.putExtra("String", stringToReturn);
        setResult(2, returnIntent);



    }
}

