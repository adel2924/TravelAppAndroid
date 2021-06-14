package uk.ac.napier.set08114.travelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityC extends AppCompatActivity {

//all about Ben Nevis

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        ListView attractionDetails = (ListView) findViewById (R.id.attraction_listC);

        Toast.makeText(getBaseContext(), "In Activity C", Toast.LENGTH_LONG).show();
        //Navigation back is via phones back button
        String[] attractionDetailsArray = new String[] { "Fun facts:",
                "The summit of Ben Nevis is the dome of a volcano that collapsed some 350 million years ago",
                "The name 'Ben Nevis' comes from the Scottish Gaelic name 'Beinn Nibheis' meaning 'mountain of heaven'",
                "It is 1344m high",
                "It's recorded as first being climbed by James Robinson a botanist from Edinburgh on 17 August 1771",
                "Over 100000 visitors walk up Ben Nevis each year",
                "Since 2004 1215 people have walked up Ben Nevis for Breast Cancer Care raising hundreds of thousands of pounds"};

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                attractionDetailsArray);

        attractionDetails.setAdapter(adapter);
        //send back a message at the bottom of the screen when returning from ActivityC to home page
        String stringToReturn = "Message back from Activity C";
        //sets the unique intent of this activity
        Intent returnIntent = new Intent();
        returnIntent.putExtra("String", stringToReturn);
        setResult(3, returnIntent);



    }
}


