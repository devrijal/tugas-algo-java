package com.rijaltanjung;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linky {

    public static void main(String[] args) {
        LinkedList<Integer> connection = new LinkedList<Integer>();

        // menambahkan element
        connection.add(2);

        // menambahkan element pertama dengan nilai integer 1
        connection.addFirst(1);

        // menambahkan element terakhir dengan nilai integer 5
        connection.addLast(5);

        // menambahkan element ke 3 dengan nilai integer 3
        connection.add(2, 3);

        // menambahkan element ke 4 dengan nilai integer 4
        connection.add(3, 4);

        // menambahkan element terakhir dengan nilai integer 6
        connection.addLast(6);

        // dapatkan banyaknya element
        int size = connection.size();

        // Tampilkan element connection menggunakan cara for-loop
        System.out.println("---------------- for-loop -----------------------");
        for (int i = 0; i < size; i++) {
            System.out.printf("Element ke %d : %d\n", i+1, connection.get(i));
        }


        // Tampilkan isi connection menggunakan perulangan while
        ListIterator<Integer> iterator = connection.listIterator();
        System.out.println("-------------------- while loop -----------------");
        while (iterator.hasNext()) {
            int next = iterator.next();
            System.out.printf("Element ke %d : %d\n", next, next);
        }

        // Tampilkan isi connection menggunakan perulangan while backward
        System.out.println("------------- while loop backward ---------------");
        while (iterator.hasPrevious()) {
            int previous = iterator.previous();
            System.out.printf("Element ke %d : %d\n", previous, previous);
        }

        // Tampilkan isi connection menggunakan perulangan while
        System.out.println("-------------- hapus element pertama -----------------");
        // hapus element pertama
        connection.removeFirst();
        // buat ulang iterator
        ListIterator<Integer> modifiedIterator = connection.listIterator();
        while (modifiedIterator.hasNext()) {
            int next = modifiedIterator.next();
            System.out.printf("Element ke %d : %d\n", next, next);
        }

        // Tampilkan isi connection menggunakan perulangan while
        System.out.println("-------------- hapus element terakhir -----------------");
        // hapus element pertama
        connection.removeLast();

        // buat ulang iterator, karena pointer pada iterator sebelumnya sudah mencapai akhir element
        ListIterator<Integer> modifiedIterator1 = connection.listIterator();
        while (modifiedIterator1.hasNext()) {
            int next = modifiedIterator1.next();
            System.out.printf("Element ke %d : %d\n", next, next);
        }

        // Tampilkan isi connection menggunakan perulangan while
        System.out.println("-------------- hapus element terakhir -----------------");
        // hapus element ketiga
        connection.remove(1);

        // buat ulang iterator, karena pointer pada iterator sebelumnya sudah mencapai akhir element
        ListIterator<Integer> modifiedIterator2 = connection.listIterator();
        while (modifiedIterator2.hasNext()) {
            int next = modifiedIterator2.next();
            System.out.printf("Element ke %d : %d\n", next, next);
        }

        System.out.println("-------------- Get element pertama -----------------");
        int first = connection.getFirst();
        System.out.printf("Element pertama menjadi : %d\n", first);

        System.out.println("-------------- Get element terakhir -----------------");
        int last = connection.getLast();
        System.out.printf("Element terakhir menjadi : %d\n", last);

        System.out.println("-------------- Print sisa element -----------------");
        int remain = connection.size();
        System.out.printf("Banyak nya element tersisa : %d\n", remain);


        System.out.println("-------------- Tambahkan element pertama -----------------");
        // menambahkan 6 sebagai element terakhir dengan method .offer(int i);
        connection.offerFirst(0);
        // peek mengambil tetapi tidak menghapus element pertama dari list
        int head = connection.peek();
        System.out.printf("Element pertama menjadi : %d\n", head);

        System.out.println("-------------- Tambahkan element terakhir -----------------");
        // menambahkan 6 sebagai element terakhir dengan method .offer(int i);
        connection.offer(6);
        System.out.printf("Element terakhir menjadi : %d\n", connection.getLast());

        System.out.println("-------------------- Connection ---------------------------");

        System.out.println(connection);
    }
}
