package com.example.android.inclassassignment06_mclark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    Animal tiger = new Animal("Tiger", 4, true, "Has stripes");
//    Animal dolphin = new Animal("Dolphin", 0, false, "Has fins");
//    Animal penguin = new Animal("Penguin", 2, false, "Just smiles and waves");
//    Animal dog = new Animal("Dog", 4, true, "Man's best friend");
//    Animal cat = new Animal("Cat", 4, true, "Related to tigers");
//    Animal snake = new Animal("Snake", 0, false, "Moves on its belly");
//    Animal[] aList = {tiger, dolphin, penguin, dog, cat, snake};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void launchActivity(View view){
        Log.v("act", "start activity");
        EditText nameInput = (EditText) findViewById(R.id.name);
        Editable tempName = nameInput.getText();
        String name = tempName.toString();
        EditText legsInput = (EditText) findViewById(R.id.legs);
        Editable tempLegs = legsInput.getText();
        String legs = tempLegs.toString();
        CheckBox fur = (CheckBox) findViewById(R.id.fur);
        Boolean hasFur = fur.isChecked();
        EditText factInput = (EditText) findViewById(R.id.fact);
        Editable tempFact = factInput.getText();
        String fact = tempFact.toString();

        Log.v("act", "creates animal");
        Animal animal = new Animal(name, legs, hasFur, fact);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Keys.ANIMAL, animal);
        startActivity(intent);
    }

    /**
     * Created by mclark on 3/3/18.
     */

    public static class Keys {
        String STRING = "string";
        String NUM = "num";
        static String ANIMAL = "Animal: ";
    }
}
