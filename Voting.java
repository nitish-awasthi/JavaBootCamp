/*1: Take input from user as a int age if age 
is greater than 18 then should display the message that eligible for voting.*/

import java.util.*;
public class Voting{

    public static void main(String[] args)
    {
        System.out.println("Enter age to check whether eligible for voting or not");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("Eligible:");
        }
        else
        {
            System.out.println("Not Eligible:");
        }

    }
}