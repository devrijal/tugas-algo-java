package com.rijaltanjung.sorting;


public class Selection {
    public static void ascending (int[] random) {
        int n = random.length;

        for (int i = 0; i < n; i++) {

            int min_i = i;

            for (int j = i+1; j < n; j++) {
                if (random[j] < random[min_i]) {
                    min_i = j;
                }
            }

            int temp = random[min_i];
            random[min_i] = random[i];
            random[i] = temp;
        }
    }

    public static void main (String[] args) {
        int[] list = {1, 5, 6, 2};

        for (int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();

        ascending(list);

        for (int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
