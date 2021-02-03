package by.bsuir.m0rk4.task.first.sorting.factory;

import by.bsuir.m0rk4.task.first.sorting.ArraySorter;
import by.bsuir.m0rk4.task.first.sorting.impl.BubbleSorter;
import by.bsuir.m0rk4.task.first.sorting.impl.InsertionSorter;
import by.bsuir.m0rk4.task.first.sorting.impl.SelectionSorter;

public class ArraySorterFactory {
    public ArraySorter createArraySorter(String sortType) {
        SortType type = SortType.valueOf(sortType.toUpperCase());
        switch (type) {
            case BUBBLE_SORT:
                return new BubbleSorter();
            case INSERTION_SORT:
                return new InsertionSorter();
            case SELECTION_SORT:
                return new SelectionSorter();
            default:
                throw new EnumConstantNotPresentException(SortType.class, type.name());
        }
    }
}
