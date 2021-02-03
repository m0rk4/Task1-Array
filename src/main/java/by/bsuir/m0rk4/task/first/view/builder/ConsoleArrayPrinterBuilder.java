package by.bsuir.m0rk4.task.first.view.builder;

public class ConsoleArrayPrinterBuilder extends ArrayPrinterBuilder {
    @Override
    public void buildOutputStream() {
        arrayPrinter.setOutputStream(System.out);
    }
}
