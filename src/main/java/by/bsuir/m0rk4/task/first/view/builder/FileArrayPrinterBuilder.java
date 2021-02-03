package by.bsuir.m0rk4.task.first.view.builder;

import by.bsuir.m0rk4.task.first.view.ArrayPrinterException;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileArrayPrinterBuilder extends ArrayPrinterBuilder {

    private final String filename;

    public FileArrayPrinterBuilder(String filename) {
        this.filename = filename;
    }

    @Override
    public void buildOutputStream() throws ArrayPrinterException {
        try {
            arrayPrinter.setOutputStream(new FileOutputStream(filename));
        } catch (IOException e) {
            throw new ArrayPrinterException(e.getMessage(), e);
        }
    }
}
