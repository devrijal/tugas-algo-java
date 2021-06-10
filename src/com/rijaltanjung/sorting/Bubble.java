package com.rijaltanjung.sorting;

/**
 * @author Rijal Tanjung
 * @license MIT
 *
 * Bubble sort algorithm
 * * Sort Ascending
 * * Sort Descending
 */
public class Bubble {

    public static void ascending(int[] unsortedList) {
        System.out.println("------- Bubble Sort Ascending -------");
        System.out.print("Unsorted list : ");
        for (int i : unsortedList) {
            System.out.print(i + " ");
        }
        System.out.println();

        int n = unsortedList.length;
        int currentElement;
        int swap = 0;

        for (int i=0; i<n; i++) {
            for (int j=1; j<(n-i); j++) {
                if (unsortedList[j-1] > unsortedList[j]) {
                    // Swap Element if current element is bigger than next element
                    currentElement = unsortedList[j-1];
                    unsortedList[j-1] = unsortedList[j];
                    unsortedList[j] = currentElement;
                    swap++;

                    // printing steps
                    System.out.print("Step " + swap + " : [ ");
                    for (int x : unsortedList) {
                        System.out.print(x + " ");
                    }
                    System.out.print("]");
                    System.out.println();
                }
            }
        }

        System.out.println("Total step : " + swap);
        System.out.print("Swapped list : ");
        for (int i : unsortedList) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void descending(int[] unsortedList) {
        System.out.println("------- Bubble Sort Descending ------");
        System.out.print("Unsorted list : ");
        for (int i : unsortedList) {
            System.out.print(i + " ");
        }
        System.out.println();

        int n = unsortedList.length;
        int currentElement;
        int swap = 0;

        for (int i=0; i<n; i++) {
            for (int j=1; j<(n-i); j++) {
                if (unsortedList[j-1] < unsortedList[j]) {
                    // Swap Element if current element is smaller than next element
                    currentElement = unsortedList[j-1];
                    unsortedList[j-1] = unsortedList[j];
                    unsortedList[j] = currentElement;
                    swap++;

                    // printing steps
                    System.out.print("Step " + swap + " : [ ");
                    for (int x : unsortedList) {
                        System.out.print(x + " ");
                    }
                    System.out.print("]");
                    System.out.println();
                }
            }
        }

        System.out.println("Total step : " + swap);
        System.out.print("Swapped list : ");
        for (int i : unsortedList) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {1, 5, 6, 2};
        int[] listCloned = list.clone();

        System.out.println("-------- UNSORTED -------------------");
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        ascending(list);
        descending(listCloned);
    }
}