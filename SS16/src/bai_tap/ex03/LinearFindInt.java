package bai_tap.ex03;

import java.util.Scanner;

import static bai_tap.ex02.FindNum2DirectArr.inputNum;

public class LinearFindInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Enter number you want to find: ");
        int n = inputNum(sc);
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Index of "+n+" is "+arr[i]);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Not found");
        }
    }
}
