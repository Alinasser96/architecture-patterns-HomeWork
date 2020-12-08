package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alyndroid.architecturepatternstutorialshomework.pojo.NumberModel;

public class ResultViewModel extends ViewModel {

    private final NumberModel model;
    public MutableLiveData<String>
            sumMLData = new MutableLiveData<>(),
            mulMLData = new MutableLiveData<>(),
            divMLData = new MutableLiveData<>();

    public ResultViewModel() {
        this.model = new DataBase().getNumbers();
    }

    public void sum() {
        sumMLData.setValue(toStr(model.getFirstNum() + model.getSecondNum()));
    }

    public void mul() {
        mulMLData.setValue(toStr(model.getFirstNum() * model.getSecondNum()));
    }

    public void div() {
        divMLData.setValue(toStr(model.getFirstNum() / model.getSecondNum()));
    }

    private String toStr(int n) {
        return String.valueOf(n);
    }
}