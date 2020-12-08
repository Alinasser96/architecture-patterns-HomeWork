package com.alyndroid.architecturepatternstutorialshomework.pojo;

public class NumberModel {
    private final int firstNum, secondNum;

    public NumberModel(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }
}
