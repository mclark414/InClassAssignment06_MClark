package com.example.android.inclassassignment06_mclark;

import java.io.Serializable;

public class Animal implements Serializable {
    String name;
    String numLegs;
    boolean hasFur;
    String funFact;
    //Constructor
    public Animal(String tempName, String tempLegs, boolean tempFur, String tempFact){
        name = tempName;
        numLegs = tempLegs;
        hasFur = tempFur;
        funFact = tempFact;
    }
    //Setters
    public void setName(String newName){
        name = newName;
    }
    public void setLegs(String newLegs){
        numLegs = newLegs;
    }
    public void setFur(boolean newFur){
        hasFur = newFur;
    }
    public void setFunFact(String newFact){
        funFact = newFact;
    }
    //Getters
    public String getName() {
        return name;
    }
    public String getNumLegs() {
        return numLegs;
    }
    public boolean getHasFur() {
        return hasFur;
    }
    public String getFunFact() {
        return funFact;
    }
    @Override
    public String toString(){
        return "\nName: " + name + "\nNumber of Legs: " + numLegs + "\nHas Fur: " + hasFur + "\nFun Fact: " + funFact;
    }
}
