package com.example.tutorialproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home"); //set label for main activity

    }
   /* public void disable( View v) {

        //set button to disable

        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("disabled");
        //Log.d("success", "Button disabled."); // show up on logcat
         */

        /*
        //point to a view

        View myView = findViewById(R.id.button);
        myView.setEnabled(false);
        //downcast to button to change button text
        Button button3 = (Button) myView;
        button3.setText("New Disabled");

         //alternative methods
        findViewById(R.id.button).setEnabled(false);
        ((Button) findViewById(R.id.button2)).setText("new new disabled"); //cast view to button
    }


    public void handleText(View v) {
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        //get text and set as output
        ((TextView)findViewById(R.id.output)).setText(input);
        Toast.makeText(this, input, Toast.LENGTH_LONG).show(); //alert that will fade away
    }

         */
    public void launchSettings(View v) {
        // launch a new activity
        Intent i = new Intent(this, SettingsActivity.class ); //(from this instance, to target instance)
        i.putExtra("COOL", "Hello"); //(key-value pair) -> access value using key
        startActivity(i);
    }
}