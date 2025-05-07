package Basics;

import java.util.Scanner;

public class Basics_02_To_Check_the_Composite_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input values : ");
        int input = sc.nextInt();
        sc.close();
        if(isComposite(input))
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
    public static boolean isComposite(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                return true;
            }
        }
        return  false;
    }
}

//
//Given a number N, print 'yes' if it is composite else print 'no'.
//Sample Testcase :
//INPUT
//123
//OUTPUT
//        yes