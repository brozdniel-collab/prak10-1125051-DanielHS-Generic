package tugas.pb.view;

import java.util.ArrayList;
import java.util.List;

import tugas.pb.util.PrintUtil;
import tugas.pb.controller.BelajarPboList;
import tugas.pb.model.Box;
import tugas.pb.model.Mahasiswa;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PRINT LIST ===");

        List<Integer> angka =
                new ArrayList<>();

        angka.add(8);
        angka.add(3);
        angka.add(10);

        PrintUtil.printList(angka);

        System.out.println("\n=== PRINT ARRAY ===");

        String[] nama = {
                "Andi",
                "Budi",
                "Caca"
        };

        PrintUtil.printList(nama);

        System.out.println(
                "\n=== PRINT PRINTABLE LIST ==="
        );

        List<Mahasiswa> mahasiswa =
                new ArrayList<>();

        mahasiswa.add(
                new Mahasiswa("001", "Andi")
        );

        mahasiswa.add(
                new Mahasiswa("002", "Budi")
        );

        PrintUtil.printPrintableList(
                mahasiswa
        );

        System.out.println(
                "\n=== SORTED LIST ==="
        );

        PrintUtil.printListSorted(
                angka
        );

        System.out.println(
                "\nLIST ASLI TETAP"
        );

        PrintUtil.printList(angka);

        System.out.println(
                "\n=== SORTED ARRAY ==="
        );

        Integer[] arr = {
                7, 2, 9, 1
        };

        PrintUtil.printListSorted(arr);

        System.out.println(
                "\n=== CHALLENGE ==="
        );

        BelajarPboList<Box<Integer>>
                myList =
                new BelajarPboList<>();

        myList.add(new Box<>(123));
        myList.add(new Box<>(10));
        myList.add(new Box<>(99));

        System.out.println(
                "\nData Asli"
        );
        myList.printList();

        System.out.println(
                "\nData Sorted"
        );
        myList.printListSorted();
    }
}