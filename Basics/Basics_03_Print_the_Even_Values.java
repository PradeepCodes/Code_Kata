package Basics;


import java.util.Scanner;

public class Basics_03_Print_the_Even_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input values : ");
        int input = sc.nextInt();
        for(int i=1;i<=input;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}




//
//Write a code to get an integer N and print the even values from 1 till N in a separate line.
//
//
//        Input Description:
//        A single line contains an integer N.
//
//        Output Description:
//        Print the even values from 1 to N in a separate line.
//
//        Sample Input :
//        6
//        Sample Output :
//        2
//        4
//        6