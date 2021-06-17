package com.rijaltanjung.sorting;

public class Merge {

    private static void merge(int[] list, int left, int middle, int right) {
        // Tentukan size dari himpunan kiri dan kanan
        int l_length = middle - left + 1;
        int r_length = right - middle;

        // buat temporary variable
        int[] L = new int[l_length];
        int[] R = new int[r_length];

        // copy data ke temporary variable
        for (int i=0; i < l_length; i++) {
            L[i] = list[left+i];
        }
        for (int i=0; i < r_length; i++) {
            R[i] = list[middle + 1 + i];
        }

        /* Merge semua himpunan menjadi satu */

        // inisialisasi index dari humpunan kiri dan kanan
        int i = 0, j = 0;

        // inisialisasi index dari himpunan gabungan
        int k = left;
        while (i < l_length && j < r_length) {
            if (L[i] <= R[j]) {
                list[k] = L[i];
                i++;
            } else {
                list[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy sisa element dari L[] jika ada
        while (i < l_length) {
            list[k] = L[i];
            i++;
            k++;
        }

        // Copy sisa element dari R[] jika ada
        while (j < r_length) {
            list[k] = R[j];
            j++;
            k++;
        }
    }

    private static void print(int[] list) {
        for (int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void _sort(int[] list, int left, int right) {
        if (left < right) {

            // Temukan index tengah dari list
            int middle = left + (right - left) / 2;

            // merge sort himpunan pertama
            _sort(list, left, middle);

            // merge sort himpunan kedua
            _sort(list, middle+1, right);

            // merge kedua himpunan menjadi satu
            merge(list, left, middle, right);
        }
    }

    public static void sort(int[] list) {
        int left = 0;
        int right = list.length - 1;
        _sort(list, left, right);
    }

    public static void main(String[] args) {
        int[] list = {30, 60, 45, 75, 15, 90, 5};

        print(list);

        System.out.println("Sorting...");

        sort(list);

        print(list);

    }
}
