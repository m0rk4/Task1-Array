package by.bsuir.m0rk4.task.first.sorting;

import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.sorting.factory.ArraySorterFactory;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSorterTest {
    private final ArraySorterFactory arraySorterFactory = new ArraySorterFactory();
    private final ArraySorter arraySorter = arraySorterFactory.createArraySorter("BUBBLE_SORT");

    @Test
    public void testSortShouldReturnEmptyArrayWhenEmptyArrayProvided() {
        // given
        Array array = new Array();
        // when
        Array res = arraySorter.sort(array);
        // then
        Assert.assertEquals(new Array(), res);
    }

    @Test
    public void testSortShouldReturnSameArrayWhenOneElementArrayProvided() {
        // given
        Array array = new Array(1);
        // when
        Array res = arraySorter.sort(array);
        // then
        Assert.assertEquals(new Array(1), res);
    }

    @Test
    public void testSortShouldReturnSortedArrayWhenTwoElementArrayProvided() {
        // given
        Array array = new Array(3, 2);
        // when
        Array res = arraySorter.sort(array);
        // then
        Assert.assertEquals(new Array(2, 3), res);
    }

    @Test
    public void testSortShouldReturnSortedArrayWhenArrayProvided() {
        // given
        Array array = new Array(2, 432, 11, 4, 53, 6, 27, 72, 5325);
        // when
        Array res = arraySorter.sort(array);
        // then
        Assert.assertEquals(new Array(2, 4, 6, 11, 27, 53, 72, 432, 5325), res);
    }
}
