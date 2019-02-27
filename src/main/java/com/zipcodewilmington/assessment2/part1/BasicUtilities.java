package com.zipcodewilmington.assessment2.part1;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        Boolean yupNope = false;
        if(value >=5){
            yupNope = true;
        }
        return yupNope;
    }

    public Boolean isLessThan7(Integer value) {
        Boolean yupNope = false;
        if(value <=7){
            yupNope = true;
        }
        return yupNope;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        Boolean yupNope = false;
        if(valueToEvaluate >=5 && valueToEvaluate <=7){
            yupNope = true;
        }
        return yupNope;
    }

    public Boolean startsWith(String string, Character character) {
        Boolean yupNope = false;
        if (string.toLowerCase().startsWith(character.toString().toLowerCase())){
            yupNope = true;
        }
        return yupNope;
    }
}
