package by.bsuir.m0rk4.task.first.data;

import by.bsuir.m0rk4.task.first.data.impl.FileDataReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataReaderTest {

    private static final String TEST_DATA_FILENAME_EMPTY = "./src/test/resources/empty.txt";
    private static final String TEST_DATA_FILENAME_CASE_1 = "./src/test/resources/lines1.txt";
    private static final String TEST_DATA_FILENAME_CASE_2 = "./src/test/resources/lines2.txt";
    private static final String INVALID_FILENAME = "INVALID123.INVALID456";

    private final DataReader dataReader = new FileDataReader();

    @Test(expected = DataException.class)
    public void testReadDataShouldThrowDataReaderExceptionWhenInvalidFilenameApplied() throws DataException {
        dataReader.readData(INVALID_FILENAME);
    }

    @Test
    public void testReadDataShouldReturnEmptyListWhenNoLinesApplied() throws DataException {
        // given

        // when
        List<String> res = dataReader.readData(TEST_DATA_FILENAME_EMPTY);

        // then
        Assert.assertEquals(Collections.EMPTY_LIST, res);
    }

    @Test
    public void testReadDataShouldReturnCorrectListWhenLinesApplied() throws DataException{
        // given

        // when
        List<String> res = dataReader.readData(TEST_DATA_FILENAME_CASE_1);

        // then
        Assert.assertEquals(Arrays.asList("1223", "z x c", "Mark"), res);
    }

    @Test
    public void testReadDataShouldReturnCorrectListWhenLinesWithSpacesFirstApplied() throws DataException{
        // given

        // when
        List<String> res = dataReader.readData(TEST_DATA_FILENAME_CASE_2);

        // then
        Assert.assertEquals(Arrays.asList("   123", "Mark"), res);
    }

}
