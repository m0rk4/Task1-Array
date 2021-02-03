package by.bsuir.m0rk4.task.first.logic;

import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.logic.impl.ArrayLogicImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class ArrayLogicTest {
    private final ArrayLogic arrayLogic = new ArrayLogicImpl();

    @Test
    public void testReplaceByIndexShouldReplaceByIndexWhenConditionApplied() {
        // given
        Predicate<Integer> cond = x -> x > 0;
        Integer replaceValue = 222;
        Array array = new Array(-1, 2, -3);

        // when
        Array newArray = arrayLogic.replace(array, cond, replaceValue);

        // then
        Assert.assertEquals(new Array(-1, 222, -3), newArray);
    }

    @Test
    public void testGetMaxShouldGetMaxWhenDifferentSignElementsApplied() {
        // given;
        Array array = new Array(-1, 2, -3);

        // when
        int res = arrayLogic.findMax(array);

        // then
        Assert.assertEquals(2, res);
    }

    @Test
    public void testGetMaxShouldGetMinWhenOneElementApplied() {
        // given;
        int singleElement = 2;
        Array array = new Array(singleElement);

        // when
        int res = arrayLogic.findMax(array);

        // then
        Assert.assertEquals(singleElement, res);
    }

    @Test
    public void testGetMinShouldGetMinWhenNegativesApplied() {
        // given;
        Array array = new Array(-1, -2, -3);

        // when
        int res = arrayLogic.findMin(array);

        // then
        Assert.assertEquals(-3, res);
    }

    @Test
    public void testGetMinShouldGetMinWhenPositivesApplied() {
        // given;
        Array array = new Array(1, 2, 3);

        // when
        int res = arrayLogic.findMin(array);

        // then
        Assert.assertEquals(1, res);
    }

    @Test
    public void testGetMinShouldGetMinWhenDifferentSignElementsApplied() {
        // given;
        Array array = new Array(-1, 2, -3);

        // when
        int res = arrayLogic.findMin(array);

        // then
        Assert.assertEquals(-3, res);
    }

    @Test
    public void testGetMinShouldGetMinWhenOneElementApplied() {
        // given;
        int singleElement = 25;
        Array array = new Array(singleElement);

        // when
        int res = arrayLogic.findMin(array);

        // then
        Assert.assertEquals(singleElement, res);
    }

    @Test
    public void testGetSumOfElementsShouldGetSumWhenNegativeElementsApplied() {
        // given
        Array array = new Array(-23, -1, -1);

        // when
        int res = arrayLogic.getSumOfElements(array);

        // then
        Assert.assertEquals(-25, res);
    }

    @Test
    public void testGetSumOfElementsShouldGetSumWhenPositiveElementsApplied() {
        // given
        Array array = new Array(23, 1, 1);

        // when
        int res = arrayLogic.getSumOfElements(array);

        // then
        Assert.assertEquals(25, res);
    }

    @Test
    public void testGetSumOfElementsShouldGetSumWhenDifferentSignElementsApplied() {
        // given
        Array array = new Array(-23, 2, 1);

        // when
        int res = arrayLogic.getSumOfElements(array);

        // then
        Assert.assertEquals(-20, res);
    }

    @Test
    public void testGetSumOfElementsShouldGetSumWhenOneElementApplied() {
        // given
        int singleElement = 23;
        Array array = new Array(singleElement);

        // when
        int res = arrayLogic.getSumOfElements(array);

        // then
        Assert.assertEquals(singleElement, res);
    }

    @Test
    public void testGetAverageValueShouldGetAvgWhenNegativesApplied() {
        // given
        Array array = new Array(-23, -1, -1);

        // when
        int res = arrayLogic.getAverageValue(array);

        // then
        Assert.assertEquals(-8, res);
    }

    @Test
    public void testGetAverageValueShouldGetAvgWhenPositivesApplied() {
        // given
        Array array = new Array(1, 2, 3);

        // when
        int res = arrayLogic.getAverageValue(array);

        // then
        Assert.assertEquals(2, res);
    }

    @Test
    public void testGetAverageValueShouldGetZeroWhenZerosApplied() {
        // given
        Array array = new Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        // when
        int res = arrayLogic.getAverageValue(array);

        // then
        Assert.assertEquals(0, res);
    }

    @Test
    public void testGetAverageValueShouldGetAvgWhenOneElementApplied() {
        // given
        Array array = new Array(2234);

        // when
        int res = arrayLogic.getAverageValue(array);

        // then
        Assert.assertEquals(2234, res);
    }

    @Test
    public void testGetAverageValueShouldGetAvgWhenDifferentElementsApplied() {
        // given
        Array array = new Array(1, -1, 2, -2, 3, -3, 0, 0);

        // when
        int res = arrayLogic.getAverageValue(array);

        // then
        Assert.assertEquals(0, res);
    }

    @Test
    public void getPositiveElementsCountShouldGetZeroWhenNoPositivesApplied() {
        // given
        Array array = new Array(-1, -2, -3, -3);

        // when
        int res = arrayLogic.getPositiveElementsCount(array);

        // then
        Assert.assertEquals(0, res);
    }

    @Test
    public void getPositiveElementsCountShouldGetZeroWhenZerosApplied() {
        // given
        Array array = new Array(0, 0, 0, 0, 0, 0, 0);

        // when
        int res = arrayLogic.getPositiveElementsCount(array);

        // then
        Assert.assertEquals(0, res);
    }

    @Test
    public void getPositiveElementsCountShouldGetPositivesCountWhenDifferentApplied() {
        // given
        Array array = new Array(-1, -2, 32, 42, 4, 32, 452, -35, -2);

        // when
        int res = arrayLogic.getPositiveElementsCount(array);

        // then
        Assert.assertEquals(5, res);
    }

    @Test
    public void getNegativeElementsCountShouldGetZeroWhenNoNegativesApplied() {
        // given
        Array array = new Array(3, 4, 324, 23, 52, 61, 51, 6, 16, 1, 61, 6);

        // when
        int res = arrayLogic.getNegativeElementsCount(array);

        // then
        Assert.assertEquals(0, res);
    }

    @Test
    public void getNegativeElementsCountShouldGetZeroWhenZerosApplied() {
        // given
        Array array = new Array(0, 0, 0, 0, 0, 0, 0);

        // when
        int res = arrayLogic.getNegativeElementsCount(array);

        // then
        Assert.assertEquals(0, res);
    }


    @Test
    public void getPositiveElementsCountShouldGetNegativesCountWhenDifferentSignElementsApplied() {
        // given
        Array array = new Array(32, 32, 31, 4, 412, 5, 1, -2, 32, -2, -32, -3);

        // when
        int res = arrayLogic.getNegativeElementsCount(array);

        // then
        Assert.assertEquals(4, res);
    }
}
