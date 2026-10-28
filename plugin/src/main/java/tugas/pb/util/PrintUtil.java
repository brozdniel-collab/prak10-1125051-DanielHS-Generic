package tugas.pb.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import tugas.pb.model.Printable;

public final class PrintUtil {

    private PrintUtil() {

    }

    public static <T> void printList(List<T> list) {

        for (T item : list) {
            System.out.println(item);
        }
    }

    public static <T> void printList(T[] array) {

        for (T item : array) {
            System.out.println(item);
        }
    }

    public static <T extends Printable>
    void printPrintableList(List<T> list) {

        for (T item : list) {
            System.out.println(
                    item.getPrintDetail()
            );
        }
    }

    public static <T extends Comparable<? super T>>
    void printListSorted(List<T> list) {

        List<T> copy =
                new ArrayList<>(list);

        Collections.sort(copy);

        for (T item : copy) {
            System.out.println(item);
        }
    }

    public static <T extends Comparable<? super T>>
    void printListSorted(T[] array) {

        T[] copy =
                Arrays.copyOf(array,
                        array.length);

        Arrays.sort(copy);

        for (T item : copy) {
            System.out.println(item);
        }
    }
}
