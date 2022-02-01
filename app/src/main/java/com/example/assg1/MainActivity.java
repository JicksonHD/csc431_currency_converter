package com.example.assg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaring variables
    EditText usd;
    EditText lbp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing the declared variables
        usd = (EditText) findViewById(R.id.USD);
        lbp = (EditText) findViewById(R.id.LBP);
    }

    public void converter(View view){

        //Declaring and initializing variables that takes input from user
        String input_inDollars = usd.getText().toString();
        String input_inLBP = lbp.getText().toString();


        //Conditions for converting from LBP to $ and vise versa and error message prompt if user didn't enter either
        if (!input_inLBP.equalsIgnoreCase("Enter in LBP to convert to $")){
            double output_inDollars = Double.parseDouble(input_inLBP)/22000;
            Toast.makeText(getApplicationContext(),output_inDollars + " $",Toast.LENGTH_LONG).show();
        }

        else if (!input_inDollars.equalsIgnoreCase("Enter in $ to convert to LBP")){
            double output_inLBP = Double.parseDouble(input_inDollars)*22000;
            Toast.makeText(getApplicationContext(),output_inLBP + " LBP",Toast.LENGTH_LONG).show();
        }

        else {
            Toast.makeText(getApplicationContext(),"Error, you must enter a value of 1 of the currencies",Toast.LENGTH_LONG).show();
        }

    }
}