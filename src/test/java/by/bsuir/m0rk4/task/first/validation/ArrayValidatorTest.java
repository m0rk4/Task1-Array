package by.bsuir.m0rk4.task.first.validation;

import by.bsuir.m0rk4.task.first.validation.impl.ArrayValidatorImpl;
import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    private final ArrayValidator arrayValidator = new ArrayValidatorImpl();

    @Test
    public void testValidateShouldReturnTrueWhenEmptyStringApplied() {
        // given
        String line = "";

        // when
        boolean res = arrayValidator.isValid(line);

        // then
        Assert.assertTrue(res);
    }

    @Test
    public void testValidateShouldReturnTrueIfSpacesBeforeOrAfterSequenceOfNums() {
        // given
        String line = "   123 3232 333       ";

        // when
        boolean res = arrayValidator.isValid(line);

        // then
        Assert.assertTrue(res);
    }

    @Test
    public void testValidateShouldReturnTrueIfSpacesBeforeOrAfterOrBetweenSequenceOfNums() {
        // given
        String line = "   123       3232       333       ";

        // when
        boolean res = arrayValidator.isValid(line);

        // then
        Assert.assertTrue(res);
    }

    @Test
    public void testValidateShouldReturnFalseIfIncorrectLineApplied() {
        // given
        String line = "   123zzz 3232 333       ";

        // when
        boolean res = arrayValidator.isValid(line);

        // then
        Assert.assertFalse(res);
    }

}
