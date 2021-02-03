package com.example.eloja_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display = findViewById(R.id.txtDisplay);
        TextView status = findViewById(R.id.txtStatus);

        String firstName = "Marvin Paul";
        char middleInitial = 'D';
        String lastName = "Eloja";
        int age = 17;
        float dreamTVLGrade = 95.0f;
        double myMoney = 9999999.99;
        boolean amIMarried = false;


        display.setText("My name is "+ firstName+ " "+ String.valueOf(middleInitial)+ " "+ lastName+ " and I am "+ age + " years old." +
                "\nI have ₱"+ String.valueOf(myMoney)+ " in my wallet right now." +
                "\nMy dream grade in TVL is "+ String.valueOf(dreamTVLGrade));

        if(amIMarried == false){
            status.setText("I am not married.");
        } else {
        status.setText("I am married.");
        }
    }
}