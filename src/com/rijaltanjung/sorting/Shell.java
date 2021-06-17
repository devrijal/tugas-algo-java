package com.rijaltanjung.sorting;

public class Shell {

    public static void sort(int[] list) {
        int n = list.length;

        // Mulai dengan jarak terjauh, lalu kurangi jarak
        for (int jarak = n / 2; jarak > 0; jarak /= 2) {

            // Lakukan Insertion Sort berjarak pada ukuran jarak ini.
            // Himpunan element berjarak yg pertama a[0...jarak-1] telah
            // berurutan, lanjutkan penambahan element selanjutnya hingga
            // semua himpunan element berurutan dengan jarak
            for (int i = jarak; i < n; i += 1) {
                // Tambahkan elemen a[i] ke himpunan elemen berjarak. Simpan
                // a[i] pada temporary variable dan buat ruang pada posisi i
                int temp = list[i];

                // shift setiap element himpunan ke atas sampai lokasi yang
                // tepat untuk a[i] ditemukan.
                int j;
                for (j = i; j >= jarak && list[j - jarak] > temp; j -= jarak) {
                    list[j] = list[j - jarak];
                }

                // tempatkan temporary variable (nilai awal a[i]) pada lokasi yang
                // tepat
                list[j] = temp;
            }
        }
    }

    private static void print(int[] list) {
        for (int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {30, 60, 45, 75, 15, 90, 5};

        print(list);

        System.out.println("Sorting...");
        sort(list);

        print(list);
    }
}
