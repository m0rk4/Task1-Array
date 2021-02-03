package by.bsuir.m0rk4.task.first.logic.impl;

import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.logic.ArrayLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayLogicImpl implements ArrayLogic {

    @Override
    public int findMin(Array array) {
        List<Integer> elements = array.getElements();
        return findMin(elements);
    }

    private int findMin(List<Integer> elements) {
        int minElement = Integer.MAX_VALUE;
        for (Integer element: elements) {
            if (element < minElement) {
                minElement = element;
            }
        }
        return minElement;
    }

    @Override
    public int findMax(Array array) {
        List<Integer> elements = array.getElements();
        return findMax(elements);
    }

    private int findMax(List<Integer> elements) {
        int maxElement = Integer.MIN_VALUE;
        for (Integer element: elements) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    @Override
    public int getSumOfElements(Array array) {
        List<Integer> elements = array.getElements();
        return getSumOfElements(elements);
    }

    private int getSumOfElements(List<Integer> elements) {
        int sum = 0;
        for (Integer element: elements) {
            sum += element;
        }
        return sum;
    }

    @Override
    public int getPositiveElementsCount(Array array) {
        List<Integer> elements = array.getElements();
        return getPositiveElementsCount(elements);
    }

    private int getPositiveElementsCount(List<Integer> elements) {
        int positiveElementsCount = 0;
        for (Integer element: elements) {
            if (element > 0) {
                positiveElementsCount++;
            }
        }
        return positiveElementsCount;
    }

    @Override
    public int getNegativeElementsCount(Array array) {
        List<Integer> elements = array.getElements();
        return getNegativeElementsCount(elements);
    }

    private int getNegativeElementsCount(List<Integer> elements) {
        int negativeElementsCount = 0;
        for (Integer element: elements) {
            if (element < 0) {
                negativeElementsCount++;
            }
        }
        return negativeElementsCount;
    }

    @Override
    public int getAverageValue(Array array) {
        List<Integer> elements = array.getElements();
        return getAverageValue(elements);
    }

    private int getAverageValue(List<Integer> elements) {
        int elementsSum = getSumOfElements(elements);
        return elementsSum / elements.size();
    }

    @Override
    public Array replace(Array array, Predicate<Integer> condition, Integer newElement) {
        List<Integer> elements = array.getElements();
        return replace(elements, condition, newElement);
    }

    private Array replace(List<Integer> elements, Predicate<Integer> condition, Integer newElement) {
        List<Integer> newElements = new ArrayList<>();
        for (Integer element: elements) {
            if (condition.test(element)) {
                newElements.add(newElement);
            } else {
                newElements.add(element);
            }
        }
        return new Array(newElements);
    }
}
