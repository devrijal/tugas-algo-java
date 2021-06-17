package com.rijaltanjung.sorting;

public class Quick {

    private static void swap(int[] list, int i, int j) {
        int temp;
        temp = list[j];
        list[j] = list[i];
        list[i] = temp;
    }

    /**
     * Fungsi ini mengambil elemen terakhir sebagai pivot, menempatkan
     * elemen pivot pada posisi yang tepat pada urutan array, dan menempatkan
     * semua elemen bernilai lebih kecil (dari pivot) ke sisi kiri dari elemen pivot dan
     * semua elemen bernilai lebih besar (dari pivot) ke sisi kanan dari elemen pivot
     *
     * @param list int[]
     * @param low int
     * @param high int
     * @return int
     */
    public static int partition(int[] list, int low, int high) {
        // tentukan elemen pivot (bisa dari elemen pertama, terakhir, tengah, atau random)
        int pivot = list[high];

        // Index dari elemen terkecil dan yang mengindikasikan posisi yang tepat dari pivot
        int i = (low - 1);

        for (int j = low; j <= (high - 1); j++) {
            // Jika current element lebih kecil dari pivot
            if (list[j] < pivot) {
                // increment index dari elemen terkecil
                i++;
                swap(list, i, j);
            }
        }
        int i_ = i + 1;

        swap(list, i_, high);

        return i_;
    }

    public static void _sort(int[] list, int low, int high) {
        if (low < high) {
            int partition_index = partition(list, low, high);

            // sisi kiri
            _sort(list, low, partition_index - 1);

            // sisi kanan
            _sort(list, partition_index + 1, high);
        }
    }

    public static void sort(int[] list) {
        int low = 0;
        int high = list.length-1;

        _sort(list, low, high);
    }

    public static void main(String[] args) {
        int[] list = {30, 60, 45, 75, 15, 90, 5};

        // Print list sebelum sorted
        for (int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();

        // sorting
        System.out.println("Sorting...");
        sort(list);

        // Print list sorted
        for (int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
