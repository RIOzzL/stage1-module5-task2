package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        final int divider1 = divider;
        Operation<Integer> operation = arg -> {
            List<Integer> list = new ArrayList<>();
            for (Integer integer : arg) {
                list.add(integer / divider1);
            }
            return list;
        };
        return operation;
        //throw new UnsupportedOperationException("You should implement this method.");
    }
}
