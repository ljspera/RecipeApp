package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton italianRad;
    private RadioButton chineseRad;
    private RadioButton mexicanRad;
    private RadioButton indianRad;
    private RadioButton thaiRad;
    private RadioButton randomRad;
    private Button selectButton;
    private TextView outputSelect;

    private String foodChoice;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodChoice = "Italian";

        radioGroup = findViewById(R.id.radioGroup);
        italianRad = findViewById(R.id.italianRad);
        chineseRad = findViewById(R.id.chineseRad);
        mexicanRad = findViewById(R.id.mexicanRad);
        indianRad = findViewById(R.id.indianRad);
        thaiRad = findViewById(R.id.thaiRad);
        randomRad = findViewById(R.id.randomRad);
        selectButton = findViewById(R.id.selectButton);
        outputSelect = findViewById(R.id.outputSelect);

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Choices.class);
                i.putExtra("foodChoice", foodChoice);
                startActivity(i);
            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.italianRad) {
                    outputSelect.setText("You have selected: Italian");
                    foodChoice = "Italian";
                } else if (i == R.id.chineseRad) {
                    outputSelect.setText("You have selected: Chinese");
                    foodChoice = "Chinese";
                } else if (i == R.id.mexicanRad) {
                    outputSelect.setText("You have selected: Mexican");
                    foodChoice = "Mexican";
                } else if (i == R.id.indianRad) {
                    outputSelect.setText("You have selected: Indian");
                    foodChoice = "Indian";
                } else if (i == R.id.thaiRad) {
                    outputSelect.setText("You have selected: Thai");
                    foodChoice = "Thai";
                } else if (i == R.id.randomRad) {
                    if (Randomize() == 0) {
                        outputSelect.setText("We Chose Italian");
                        foodChoice = "Italian";
                    } else if (Randomize() == 1) {
                        outputSelect.setText("We Chose Chinese");
                        foodChoice = "Chinese";
                    } else if (Randomize() == 2) {
                        outputSelect.setText("We Chose Mexican");
                        foodChoice = "Mexican";
                    } else if (Randomize() == 3) {
                        outputSelect.setText("We Chose Indian");
                        foodChoice = "Indian";
                    } else if (Randomize() == 4) {
                        outputSelect.setText("We Chose Thai");
                        foodChoice = "Thai";
                    }
                }
            }
        });

    }

    public int Randomize() {
        Random rand = new Random();
        int rand1 = rand.nextInt(5);
        return rand1;
    }




    //Look up android developers Web View or Java2Blog Android WebView Example
}