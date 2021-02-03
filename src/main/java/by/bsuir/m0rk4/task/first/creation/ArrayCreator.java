package by.bsuir.m0rk4.task.first.creation;

import by.bsuir.m0rk4.task.first.data.DataException;
import by.bsuir.m0rk4.task.first.data.DataReader;
import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.parsing.ArrayParser;
import by.bsuir.m0rk4.task.first.validation.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private final DataReader dataReader;
    private final ArrayValidator arrayValidator;
    private final ArrayParser arrayParser;

    public ArrayCreator(DataReader dataReader, ArrayValidator arrayValidator, ArrayParser arrayParser) {
        this.dataReader = dataReader;
        this.arrayValidator = arrayValidator;
        this.arrayParser = arrayParser;
    }

    public List<Array> process(String filename) throws ArrayCreatorException {
        List<Array> arrays = new ArrayList<>();
        try {
            List<String> linesRead = dataReader.readData(filename);
            for (String line : linesRead) {
                if (arrayValidator.isValid(line)) {
                    Array newArray = arrayParser.create(line);
                    arrays.add(newArray);
                }
            }
        } catch (DataException e) {
            throw new ArrayCreatorException(e.getMessage(), e);
        }
        return arrays;
    }
}
