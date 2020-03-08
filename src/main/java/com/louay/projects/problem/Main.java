package com.louay.projects.problem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please input number of element: ");
        int length = input.nextInt();

        System.out.print("please input integer key value: ");
        int key = input.nextInt();

        int [] arr = new int[length];

        for (int i = 0; i < arr.length ; i++) {
            System.out.printf("please input %d element in array: ",(i+1));
            arr[i] = input.nextInt();
        }

        int numberOfPairsEqualKey = 0;
        int sum;
        double divisionResult;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum = arr[i]+arr[j];
                divisionResult = ((double)sum%key);
                if (divisionResult == 0){
                    numberOfPairsEqualKey++;
                }
            }
        }

        System.out.println(numberOfPairsEqualKey);
    }
}
