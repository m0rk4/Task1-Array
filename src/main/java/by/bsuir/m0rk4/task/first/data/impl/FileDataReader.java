package by.bsuir.m0rk4.task.first.data.impl;

import by.bsuir.m0rk4.task.first.data.DataException;
import by.bsuir.m0rk4.task.first.data.DataReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDataReader implements DataReader {
    @Override
    public List<String> readData(String filename) throws DataException {
        List<String> linesRead = new ArrayList<>();
        try (
                Reader reader = new FileReader(filename);
                BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            String lineRead = bufferedReader.readLine();
            while (lineRead != null) {
                linesRead.add(lineRead);
                lineRead = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }
        return linesRead;
    }
}
