package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        int range = stop - start;
        Integer[] array = new Integer[range+1];
        int k = 0;

        for (int j = start; j <= stop; j++){

            array[k] = j;
            k++;
        }
        return array;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0]+array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0]*array[1];
    }
}
