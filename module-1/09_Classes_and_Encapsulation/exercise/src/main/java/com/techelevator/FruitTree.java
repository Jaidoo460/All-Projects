package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public String getTypeOfFruits(){
        return this.typeOfFruit;
    }

    public int getPartOfFruitLeft(){
        return piecesOfFruitLeft;
    }

    public FruitTree(String typeOfFruit, int piecesOfFruitLeft) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;
    }

    public boolean pickFruit(int numberOfPiecesToRemove) {
        if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
            return true;

        }else {
            return false;
        }
    }
}
