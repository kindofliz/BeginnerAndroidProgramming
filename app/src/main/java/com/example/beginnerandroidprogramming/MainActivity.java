package com.example.beginnerandroidprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }
    
    public void launchSettings(View view) {
        //launch a new activity
        
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }


//    public void handleText(View v) {
//        //getting the input from the editView after clicking the button
//        EditText t = findViewById(R.id.source);
//        //and storing it in variable input
//        String input = t.getText().toString();
//
//        //Displaying that user input on the screen
//        ((TextView)findViewById(R.id.textOutput)).setText(input);
//
//        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
//    }
//
//    //Method that is called when a button is clicked
//    public void disable(View v) {
//
//        //Casting and stuff without declaring variables
//        findViewById(R.id.button).setEnabled(false);
//        ((Button)findViewById(R.id.button)).setText("New new disabled");


//        //The same as below but for a specific button
//        View myView = findViewById(R.id.button);
//        myView.setEnabled(false);
//
//        Button btn = (Button) myView;
//        btn.setText("New Disabled");


//        //Disable the button
//        v.setEnabled(false);
//
//        //logging example
//        Log.d("success", "Button disabled!");
//
//        //cast the view into button to be able to change text on it ect
//        Button btn = (Button) v;
//        btn.setText("Disabled");
//
//        //Change the message on the screen
//        TextView greeting = findViewById(R.id.hello);
//        greeting.setText("Liza clicked and disabled a button!");

}
