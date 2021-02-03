package by.bsuir.m0rk4.task.first.parsing;

import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.parsing.impl.ArrayParserImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * We assume that each line is correct after validation.
 */
public class ArrayParserTest {
    private final ArrayParser arrayParser = new ArrayParserImpl();

    @Test
    public void testCreateShouldReturnEmptyArrayWhenEmptyLineApplied() {
        // given
        String line = "";

        // when
        Array array = arrayParser.create(line);

        // then
        Assert.assertEquals(new Array(), array);
    }

    @Test
    public void testCreateShouldReturnEmptyArrayWhenSpacesLineApplied() {
        // given
        String line = "                           ";

        // when
        Array array = arrayParser.create(line);

        // then
        Assert.assertEquals(new Array(), array);
    }

    @Test
    public void testCreateShouldReturnCorrectArrayWhenCorrectLineApplied() {
        // given
        String line = "   323 3  2 2 22 22 1";

        // when
        Array array = arrayParser.create(line);

        // then
        Assert.assertEquals(new Array(323, 3, 2, 2, 22, 22, 1), array);
    }
}
