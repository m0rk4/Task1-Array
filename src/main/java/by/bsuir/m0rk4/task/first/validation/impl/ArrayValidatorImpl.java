package by.bsuir.m0rk4.task.first.validation.impl;

import by.bsuir.m0rk4.task.first.validation.ArrayValidator;

import java.util.regex.Pattern;

public class ArrayValidatorImpl implements ArrayValidator {
    private static final String LINE_REG_EXP = "(\\s*\\d+(\\s+\\d+)*\\s*)?|\\s+";

    @Override
    public boolean isValid(String line) {
        return Pattern.matches(LINE_REG_EXP, line);
    }
}
