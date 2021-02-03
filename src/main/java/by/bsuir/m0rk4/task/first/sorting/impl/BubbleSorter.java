package by.bsuir.m0rk4.task.first.sorting.impl;

import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.logic.ArrayLogic;
import by.bsuir.m0rk4.task.first.sorting.ArraySorter;
import by.bsuir.m0rk4.task.first.view.ArrayPrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Elements from Array.class are converted to ArrayList
 * that allows us to do sorting based on swapping
 * without loosing in performance, since set() and get() in ArrayList
 * works constantly, because ArrayList is based on general array.
 */

public class BubbleSorter implements ArraySorter {
    @Override
    public Array sort(Array array) {
        List<Integer> elements = array.getElements();
        List<Integer> newElements = new ArrayList<>(elements);
        int size = elements.size();
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                int curr = newElements.get(j);
                int prev = newElements.get(j - 1);
                if (curr < prev) {
                    newElements.set(j, prev);
                    newElements.set(j - 1, curr);
                }
            }
        }
        return new Array(newElements);
    }
}
