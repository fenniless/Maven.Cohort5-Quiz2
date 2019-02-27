package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    public List<Integer> list = new ArrayList<>();


    public Boolean add(int i) {

        list.add(i);

        return list.contains(i);
    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {

        return list;
    }

    public String join() {
        return list.toString().substring(1,4);
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}
