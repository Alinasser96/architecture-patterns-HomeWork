package com.alyndroid.architecturepatternstutorialshomework.ui;

import com.alyndroid.architecturepatternstutorialshomework.pojo.NumberModel;

public class DataBase {
    public NumberModel getNumbers() {
        return new NumberModel(4, 2);
    }
}
