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

//Alternate Solution
===================
//package Src;

// import java.util.Scanner;

// public class PrimeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int num=0;
//         for(int i=1;i<=a;i++)
//         {
//             float value = a%i;
//             if(value == 0)
//             {

//                 num=num+1;
//             }
//         }
//         if(num <= 1)
//         {
//             System.out.println("nor Prime Number either composite");
//         }
//         if(num ==2)
//         {
//             System.out.println("Prime Number");
//         }
//         else{
//             System.out.println("Composte Number");
//         }
//     }
// }


//
//Given a number N, print 'yes' if it is composite else print 'no'.
//Sample Testcase :
//INPUT
//123
//OUTPUT
//        yes
