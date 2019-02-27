package com.zipcodewilmington.assessment2.part2;



public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int length = array1.length+array2.length;
        Integer[] array = new Integer[length];
        int j =0;
        for(int i =0 ; i < array1.length; i++){
            array[i] = array1[i];
            j++;
        }
        for(int i = 0 ; i<array2.length;i++){
            array[j] = array2[i];
            j++;
        }


        return array;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] newArray = new Integer[array.length];
        int j = 0;
        for(int i=0; i < array.length-index; i++){
            newArray[i] = array[i+index];
            j++;
        }
        for(int i = 0 ; j < array.length ; i++){
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        int counter = 0;
        for(int i = 0 ; i < array1.length ; i++){
            if(array1[i] == valueToEvaluate){
                counter++;
            }
        }
        for(int i = 0 ; i < array2.length ; i++){
            if(array2[i] == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {

        int count = 1, tempCount;
        int popular = array[0];
        int temp = 0;
        for (int i = 0; i < (array.length - 1); i++)
        {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++)
            {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
}
