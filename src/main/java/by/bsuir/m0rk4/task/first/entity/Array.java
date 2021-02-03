package by.bsuir.m0rk4.task.first.entity;

import java.util.*;

public class Array {

    private final List<Integer> elements;

    public Array(Integer... elements) {
        List<Integer> modifiableElements = new ArrayList<>(Arrays.asList(elements));
        this.elements = Collections.unmodifiableList(modifiableElements);
    }

    public Array(List<Integer> elements) {
        this.elements = Collections.unmodifiableList(elements);
    }

    public List<Integer> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Array array = (Array) o;
        return Objects.equals(elements, array.elements);
    }

    @Override
    public int hashCode() {
        int res = 1;
        res = 31 * res + (elements == null ? 0 : elements.hashCode());
        return res;
    }

    @Override
    public String toString() {
        return "Array{" +
                "elements=" + elements +
                '}';
    }
}
