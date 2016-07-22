package com.augmentis.ayp.mycalculator;

/**
 * Created by Waraporn on 7/22/2016.
 */
public class Calculator {

    String temp = "";
    String currentOperator = "";
    int mainNumber = 0;
    int result;

    public void pressNumber(String s) {
        temp += s;
    }

    public void pressOperator(String s) {
        currentOperator = s;
        mainNumber = Integer.parseInt(temp);
        temp = "";
    }

    public void pressEqual() {
        if (currentOperator.equals("+")){
            result = mainNumber + Integer.parseInt(temp);
        } else if (currentOperator.equals("-")){
            result = mainNumber - Integer.parseInt(temp);
        } else if (currentOperator.equals("*")){
            result = mainNumber * Integer.parseInt(temp);
        }else if (currentOperator.equals("/")){
            result = mainNumber / Integer.parseInt(temp);
        }
    }


    public int getResult() {
        return result;
    }
}
