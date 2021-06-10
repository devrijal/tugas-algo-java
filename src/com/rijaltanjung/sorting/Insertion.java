package com.rijaltanjung.sorting;

public class Insertion {

    public static void sort (int[] random) {
        int n = random.length;

        for (int i=0; i<n; i++) {
            int currentElement = random[i];
            int previousIndex = i - 1;

            // while previous index >= 0 and previous element is greater than current element, move greater element
            // one position up to make a space for swapped element.
            while (previousIndex >= 0 && random[previousIndex] > currentElement) {
                int nextIndex = previousIndex + 1;
                random[nextIndex] = random[previousIndex];
                previousIndex -= 1;
            }

            random[previousIndex+1] = currentElement;
        }

        for (int i: random) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {12, 11, 13, 5, 6};
        sort(list);
    }
}
