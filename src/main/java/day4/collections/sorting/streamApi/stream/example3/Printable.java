package day4.collections.sorting.streamApi.stream.example3;

@FunctionalInterface
//means it can only hold ONE METHOD
//can hold DEFAULT behaviours
public interface Printable {
    int doPrint(String msg);

    default void doThings() {
        System.out.println(" this is default from Printable ");
    }

    default void doThings2() {
        System.out.println(" this is another default from Printable ");
    }
}
