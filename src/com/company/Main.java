package com.company;

public class Main {

    public static void main(String[] args) {

        int arr[] = new int[20];
        int i = 0, a = 0;
        int x = -10, xi = 0;
        int y = 10, yi = 0;
        while (i < 20) {
            arr[i] = (int) (Math.random() * 20) - 10;
            if (arr[i] < 0 & arr[i] > x) {
                x = arr[i];
                xi = i;
            }
            if (arr[i] > 0 & arr[i] < y){
                y = arr[i];
                yi = i;
            }
            System.out.print(arr[i] + "   ");
            i += 1;
        }
        System.out.println();
        a = arr[xi];
        arr[xi] = arr[yi];
        arr[yi] = a;
        for (int c:arr) {
            System.out.print(c + "   ");
        }

    }
}