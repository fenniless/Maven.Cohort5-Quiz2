package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    private Integer inputTest;

    public WuTangConcatenator(Integer input) {
        inputTest = input;
    }

    public Boolean isWu() {
        Boolean isWu = false;
        if(inputTest %3 == 0){
            isWu = true;
        }
        return isWu;
    }

    public Boolean isTang() {
        Boolean isTang = false;
        if(inputTest %5 == 0){
            isTang = true;
        }
        return isTang;
    }

    public Boolean isWuTang() {
        Boolean isWuTang = false;
        if(inputTest %15 == 0){
            isWuTang = true;
        }
        return isWuTang;
    }
}
