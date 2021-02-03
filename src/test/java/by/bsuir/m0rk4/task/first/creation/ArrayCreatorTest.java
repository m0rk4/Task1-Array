package by.bsuir.m0rk4.task.first.creation;

import by.bsuir.m0rk4.task.first.data.DataException;
import by.bsuir.m0rk4.task.first.data.DataReader;
import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.parsing.ArrayParser;
import by.bsuir.m0rk4.task.first.validation.ArrayValidator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private static final List<String> TEST_LINES = Arrays.asList("123 133 23", "12z 23", "0 223 3", "");
    private DataReader dataReader;
    private ArrayValidator arrayValidator;
    private ArrayParser arrayParser;

    @Before
    public void setUp() throws DataException {
        dataReader = Mockito.mock(DataReader.class);
        when(dataReader.readData(anyString())).thenReturn(TEST_LINES);

        arrayValidator = Mockito.mock(ArrayValidator.class);
        when(arrayValidator.isValid(anyString())).thenReturn(true);
        when(arrayValidator.isValid("12z 23")).thenReturn(false);

        arrayParser = Mockito.mock(ArrayParser.class);
        when(arrayParser.create("123 133 23")).thenReturn(new Array(123, 133, 23));
        when(arrayParser.create("0 223 3")).thenReturn(new Array(0, 233, 3));
        when(arrayParser.create("")).thenReturn(new Array());
    }

    @Test
    public void testProcessShouldReturnListOfArrays() throws ArrayCreatorException {
        // given
        ArrayCreator arrayCreator = new ArrayCreator(dataReader, arrayValidator, arrayParser);

        // when
        List<Array> res = arrayCreator.process("MOCK_FILENAME");

        // then
        Assert.assertEquals(Arrays.asList(
                new Array(123, 133, 23),
                new Array(0, 233, 3),
                new Array()
        ), res);
    }
}
