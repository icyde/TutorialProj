package com.example.tutorialproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void disable( View v) {
        /*
        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("disabled");
        //Log.d("success", "Button disabled.");
         */

        /*
        View myView = findViewById(R.id.button);
        myView.setEnabled(false);
        Button button3 = (Button) myView;
        button3.setText("New Disabled");
         */
        findViewById(R.id.button).setEnabled(false);
        ((Button) findViewById(R.id.button2)).setText("new new disabled");
    }
    public void handleText(View v) {
        TextView t = findViewById(R.id.source);
        String input = t.getText().toString();
        Log.d("info", input);
    }
}