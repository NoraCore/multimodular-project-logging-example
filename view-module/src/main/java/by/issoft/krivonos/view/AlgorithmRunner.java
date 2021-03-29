package by.issoft.krivonos.view;

import by.issoft.krivonos.algorithms.BinarySearch;

import java.util.Arrays;

public class AlgorithmRunner {
    public static void main(String[] args) {
        int[] sortedArray = {4, 9, 23, 45, 67, 68, 99, 111, 123};
        int keyThatContainsInArray = 45;
        int keyNotInArray = 3000;

        System.out.println("The specified sorted array:");
        Arrays.stream(sortedArray).forEach(el -> System.out.print(el + " "));

        System.out.println("\n");
        System.out.println("The index of found element: " + BinarySearch.search(sortedArray, keyThatContainsInArray));
        System.out.println("The result if element: " + BinarySearch.search(sortedArray, keyNotInArray));
    }
}
