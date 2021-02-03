package by.bsuir.m0rk4.task.first.sorting;

import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.sorting.factory.ArraySorterFactory;
import org.junit.Assert;
import org.junit.Test;

public class SelectionSorterTest {
    private final ArraySorterFactory arraySorterFactory = new ArraySorterFactory();
    private final ArraySorter arraySorter = arraySorterFactory.createArraySorter("SELECTION_SORT");

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
        Array array = new Array(-2313);
        // when
        Array res = arraySorter.sort(array);
        // then
        Assert.assertEquals(new Array(-2313), res);
    }

    @Test
    public void testSortShouldReturnSortedArrayWhenTwoElementArrayProvided() {
        // given
        Array array = new Array(-113, -22222);
        // when
        Array res = arraySorter.sort(array);
        // then
        Assert.assertEquals(new Array(-22222, -113), res);
    }

    @Test
    public void testSortShouldReturnSortedArrayWhenArrayProvided() {
        // given
        Array array = new Array(-100, 2, -1, 432, 11, 4, 53, 5, 82828, 6, 27, 72, -3, 5325);
        // when
        Array res = arraySorter.sort(array);
        // then
        Assert.assertEquals(new Array(-100, -3, -1, 2, 4, 5, 6, 11, 27, 53, 72, 432, 5325, 82828), res);
    }


}
