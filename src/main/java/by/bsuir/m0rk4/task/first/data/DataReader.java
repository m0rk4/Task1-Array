package by.bsuir.m0rk4.task.first.data;

import java.util.List;

public interface DataReader {
    List<String> readData(String filename) throws DataException;
}
