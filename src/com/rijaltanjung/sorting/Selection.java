package com.rijaltanjung.sorting;


import java.util.Arrays;

public class Selection {
    public static void ascending (int[] random) {
        System.out.print("Selection sort asc of array : ");
        for (int i: random) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        int n = random.length;

        for (int i = 0; i < n; i++) {

            int min_i = i;

            // Print remaining int array
            int[] slice = Arrays.stream(random, i, n).toArray();
            System.out.print("Finding minimum in array : ");
            for (int x: slice) {
                System.out.print(x + " ");
            }

            System.out.println();

            // find the minimum element index
            for (int j = i+1; j < n; j++) {
                if (random[j] < random[min_i]) {
                    min_i = j;
                }
            }

            // Swap minimum element with current element
            int temp = random[min_i];
            random[min_i] = random[i];
            random[i] = temp;

            System.out.print("sorted --> ");
            for (int k = 0; k <= i; k++) {
                System.out.print(random[k] + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void descending (int[] random) {
        System.out.print("Selection sort desc of array : ");
        for (int i: random) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        int n = random.length;

        for (int i = 0; i < n; i++) {

            int max_i = i;

            // Print remaining int array
            int[] slice = Arrays.stream(random, i, n).toArray();
            System.out.print("Finding minimum in array : ");
            for (int x: slice) {
                System.out.print(x + " ");
            }

            System.out.println();

            // find the minimum element index
            for (int j = i+1; j < n; j++) {
                if (random[j] > random[max_i]) {
                    max_i = j;
                }
            }

            // Swap minimum element with current element
            int temp = random[max_i];
            random[max_i] = random[i];
            random[i] = temp;

            System.out.print("sorted --> ");
            for (int k = 0; k <= i; k++) {
                System.out.print(random[k] + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main (String[] args) {
        int[] list = {1, 5, 6, 2};
        int[] listCloned = list.clone();
        System.out.println("---------- ASCENDING ----------");
        ascending(list);
        System.out.println("---------- DESCENDING ----------");
        descending(listCloned);
    }
}
