package by.bsuir.m0rk4.task.first.view.builder;

import by.bsuir.m0rk4.task.first.view.ArrayPrinter;
import by.bsuir.m0rk4.task.first.view.ArrayPrinterException;

public class ArrayPrinterDirector {

    public ArrayPrinter createArrayPrinter(ArrayPrinterBuilder arrayPrinterBuilder) throws ArrayPrinterException {
        arrayPrinterBuilder.buildOutputStream();
        return arrayPrinterBuilder.getArrayPrinter();
    }

}
