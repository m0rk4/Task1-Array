package by.bsuir.m0rk4.task.first;

import by.bsuir.m0rk4.task.first.entity.Array;
import by.bsuir.m0rk4.task.first.view.ArrayPrinter;
import by.bsuir.m0rk4.task.first.view.ArrayPrinterException;
import by.bsuir.m0rk4.task.first.view.builder.ArrayPrinterDirector;
import by.bsuir.m0rk4.task.first.view.builder.ConsoleArrayPrinterBuilder;
import by.bsuir.m0rk4.task.first.view.builder.FileArrayPrinterBuilder;


public class Main {
    public static void main(String[] args) throws ArrayPrinterException {

        Array array = new Array(12, 23, 34, 6646);

        ArrayPrinterDirector arrayPrinterDirector = new ArrayPrinterDirector();

        ArrayPrinter consoleArrayPrinter = arrayPrinterDirector
                .createArrayPrinter(new FileArrayPrinterBuilder("test.txt"));
        consoleArrayPrinter.printArray(array);

        ArrayPrinter fileArrayPrinter = arrayPrinterDirector
                .createArrayPrinter(new ConsoleArrayPrinterBuilder());
        fileArrayPrinter.printArray(array);

        // Check if System.out works or not
        // Update: works
        System.out.println("Test");
        System.out.println("Mark");
    }
}
