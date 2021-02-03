package by.bsuir.m0rk4.task.first.view.builder;

import by.bsuir.m0rk4.task.first.view.ArrayPrinter;
import by.bsuir.m0rk4.task.first.view.ArrayPrinterException;

public abstract class ArrayPrinterBuilder {
    protected final ArrayPrinter arrayPrinter = new ArrayPrinter();

    public ArrayPrinter getArrayPrinter() {
        return arrayPrinter;
    }

    public abstract void buildOutputStream() throws ArrayPrinterException;
}
