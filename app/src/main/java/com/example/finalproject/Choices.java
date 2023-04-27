package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Choices extends AppCompatActivity {



    private RadioGroup radioGroup2;
    private RadioButton appetizerRad;
    private RadioButton entreeRad;
    private RadioButton dessertRad;
    private RadioButton random2Rad;
    private Button selectButton2;
    private TextView outputSelect2;

    private String foodChoice;
    private String dishChoice;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);

        dishChoice = "appetizer";

        radioGroup2 = findViewById(R.id.radioGroup2);
        appetizerRad = findViewById(R.id.appetizerRad);
        entreeRad = findViewById(R.id.entreeRad);
        dessertRad = findViewById(R.id.dessertRad);
        random2Rad = findViewById(R.id.random2Rad);
        selectButton2 = findViewById(R.id.selectButton2);
        outputSelect2 = findViewById(R.id.outputSelect2);

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.appetizerRad) {
                    outputSelect2.setText("You have selected: Appetizer");
                    dishChoice = "Appetizer";
                } else if (i == R.id.entreeRad) {
                    outputSelect2.setText("You have selected: Entree");
                    dishChoice = "Entree";
                } else if (i == R.id.dessertRad) {
                    outputSelect2.setText("You have selected: Dessert");
                    dishChoice = "Dessert";
                } else if (i == R.id.random2Rad) {
                    if (Randomize() == 0) {
                        outputSelect2.setText("We Chose: Appetizer");
                        dishChoice = "Appetizer";
                    } else if (Randomize() == 1) {
                        outputSelect2.setText("We Chose: Entree");
                        dishChoice = "Entree";
                    } else if (Randomize() == 2) {
                        outputSelect2.setText("We Chose: Dessert");
                        dishChoice = "Dessert";
                    }
                }
            }
        });

        selectButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (foodChoice.equals("Italian") && dishChoice.equals("Appetizer")) {
                    // Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), ItalianSweet.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                } else if (foodChoice.equals("Italian") && dishChoice.equals("Entree")) {
                    // Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), ItalianSour.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                } else if (foodChoice.equals("Italian") && dishChoice.equals("Dessert")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), ItalianDessert.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                } else if (foodChoice.equals("Chinese") && dishChoice.equals("Appetizer")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), ChineseAppetizer.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }else if (foodChoice.equals("Chinese") && dishChoice.equals("Entree")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), ChineseEntree.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }else if (foodChoice.equals("Chinese") && dishChoice.equals("Dessert")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), ChineseDessert.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                } else if (foodChoice.equals("Mexican") && dishChoice.equals("Appetizer")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), MexicanAppetizer.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }else if (foodChoice.equals("Mexican") && dishChoice.equals("Entree")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), MexicanEntree.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }else if (foodChoice.equals("Mexican") && dishChoice.equals("Dessert")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), MexicanDessert.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }else if (foodChoice.equals("Indian") && dishChoice.equals("Appetizer")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), IndianAppetizer.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }else if (foodChoice.equals("Indian") && dishChoice.equals("Entree")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), IndianEntree.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }else if (foodChoice.equals("Indian") && dishChoice.equals("Dessert")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), IndianDesserts.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }else if (foodChoice.equals("Thai") && dishChoice.equals("Appetizer")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), ThaiAppetizer.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }else if (foodChoice.equals("Thai") && dishChoice.equals("Entree")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), ThaiEntree.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }else if (foodChoice.equals("Thai") && dishChoice.equals("Dessert")) {
                    //Toast.makeText(getApplicationContext(), "Works", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), ThaiDessert.class);
                    i.putExtra("foodChoice", foodChoice);
                    i.putExtra("dishChoice", dishChoice);
                    startActivity(i);
                }
            }
        });

        Intent i = getIntent();
        foodChoice = i.getStringExtra("foodChoice");

    }

    public int Randomize() {
        Random rand = new Random();
        int rand1 = rand.nextInt(3);
        return rand1;
    }

    @Override
    public void onPause(){
        super.onPause();
        updateSharedPreferences();
    }

    private void updateSharedPreferences(){
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("foodChoice", foodChoice);
        editor.commit();
    }
}