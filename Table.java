/* 3. Ask your to provide number and you will print the table of that number. */

import java.util.*;
public class Table{

    public static void main(String[] args)
    {
        System.out.println("Enter Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
2
        while(i<=10)
        {
            System.out.println(n+" * "+i+" = "+n*i);
            i++;
        }

    }
}