package by.bsuir.m0rk4.task.first.logic;

import by.bsuir.m0rk4.task.first.entity.Array;

import java.util.function.Predicate;

public interface ArrayLogic {
    int findMin(Array array);
    int findMax(Array array);
    int getSumOfElements(Array array);
    int getPositiveElementsCount(Array array);
    int getNegativeElementsCount(Array array);
    int getAverageValue(Array array);
    Array replace(Array array, Predicate<Integer> condition, Integer newElement);
}
