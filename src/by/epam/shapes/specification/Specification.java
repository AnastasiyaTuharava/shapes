package by.epam.shapes.specification;

public interface Specification <T> {
    boolean isSatisfied(T t);
}
