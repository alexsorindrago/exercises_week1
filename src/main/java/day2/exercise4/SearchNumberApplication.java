package day2.exercise4;

import java.util.Scanner;

public class SearchNumberApplication {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 7, 3, 2, 2, 2, 4, 1, 10, 50, 5, 7, 50};

        SearchNumberApplication searchNumberApplication = new SearchNumberApplication();

        searchNumberApplication.countIterations(arr);
    }

    public void countIterations(int[] arr) {

        int i, num, occr = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number to search iterations : ");

        num = sc.nextInt();

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                occr++;
            }
        }

        System.out.println(num + " Occurred " + occr + " Times.");

    }
}
