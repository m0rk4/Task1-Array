package by.bsuir.m0rk4.task.first.parsing.impl;

import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.parsing.ArrayParser;

import java.util.ArrayList;
import java.util.List;

public class ArrayParserImpl implements ArrayParser {
    private static final String SPACES_REX_EXP = "\\s+";

    @Override
    public Array create(String data) {
        List<Integer> elements = new ArrayList<>();
        String[] stringNumbers = data.split(SPACES_REX_EXP);
        for (String stringNumber : stringNumbers) {
            if (!stringNumber.isEmpty()) {
                int parsedNumber = Integer.parseInt(stringNumber);
                elements.add(parsedNumber);
            }
        }
        return new Array(elements);
    }
}
