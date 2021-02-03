package by.bsuir.m0rk4.task.first.sorting.impl;

import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.sorting.ArraySorter;

import java.util.ArrayList;
import java.util.List;

/**
 * Insertion sort is not based on swap
 * so to save performance it would be better
 * not to use ArrayList.class.
 * int[] is used instead.
 */

public class InsertionSorter implements ArraySorter {
    @Override
    public Array sort(Array array) {
        List<Integer> elements = array.getElements();
        ArrayList<Integer> newElements = new ArrayList<>(elements);
        int size = elements.size();
        for (int i = 1; i < size; i++) {
            int key = newElements.get(i);
            int j = i;
            while (j > 0 && newElements.get(j - 1) > key) {
                int element = newElements.get(j - 1);
                newElements.set(j, element);
                j--;
            }
            newElements.set(j, key);
        }
        return new Array(newElements);
    }

}
