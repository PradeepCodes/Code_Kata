package Basics;

import java.util.Scanner;

public class Basics_01_PrintNumber_1_to_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input values : ");
        int input = sc.nextInt();
        for(int i=1;i<=input;i++)
        {
            System.out.println(i);
        }

    }
}
