/*2.Take 3 inputs from user as a numbers and chek which no is largest and smallest*/

import java.util.*;
public class LargestOfThree{

    public static void main1(String[] args) {
        System.out.println("*****Largest Of Three*****");
        System.out.println("Enter three numbers: ");
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a +" "+"is largest.");
            }
            else
            {
                System.out.println(c +" "+"is largest.");
            }
        }
        else if(b>a)
        {
            if(b>c)
            {
                System.out.println(b +" "+"is largest.");
            }
            else
            {
                System.out.println(c +" "+"is largest.");
            }
        }
        else 
        {
            System.out.println(c +" "+"is largest.");
        }
    }
}