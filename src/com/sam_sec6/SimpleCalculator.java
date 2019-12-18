package com.sam_sec6;

public class SimpleCalculator {

    private double firstNumber = 0;
    private double secondNumber = 0;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult (){
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult (){
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult(){
        return (this.secondNumber != 0) ? this.firstNumber/this.secondNumber : 0;
    }
}
