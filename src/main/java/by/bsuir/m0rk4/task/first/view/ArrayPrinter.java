package by.bsuir.m0rk4.task.first.view;

import by.bsuir.m0rk4.task.first.entity.Array;

import java.io.*;
import java.util.List;

public class ArrayPrinter {

    private OutputStream outputStream;

    public void printArray(Array array) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(outputStream);
            List<Integer> elements = array.getElements();
            for (Integer element : elements) {
                printWriter.println(element);
            }
        } finally {
            if (printWriter != null) {
                if (outputStream == System.out) {
                    printWriter.flush();
                } else {
                    printWriter.close();
                }
            }
        }
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }
}
