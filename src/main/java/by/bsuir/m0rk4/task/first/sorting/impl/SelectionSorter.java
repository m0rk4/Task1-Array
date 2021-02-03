package by.bsuir.m0rk4.task.first.sorting.impl;

import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.sorting.ArraySorter;

import java.util.ArrayList;
import java.util.List;

/**
 * Elements from Array.class are converted to ArrayList
 * that allows us to do sorting based on swapping
 * without loosing in performance, since set() and get() in ArrayList
 * works constantly, because ArrayList is based on general array.
 */

public class SelectionSorter implements ArraySorter {
    @Override
    public Array sort(Array array) {
        List<Integer> elements = array.getElements();
        List<Integer> newElements = new ArrayList<>(elements);
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (newElements.get(j) < newElements.get(minIndex)) {
                    minIndex = j;
                }
            }
            int first = newElements.get(i);
            int second = newElements.get(minIndex);
            newElements.set(i, second);
            newElements.set(minIndex, first);
        }
        return new Array(newElements);
    }
}
