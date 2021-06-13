/* 4. print the pyramid triangle(while loop) */

/* 3. Ask your to provide number and you will print the table of that number. */

import java.util.*;
public class Pyramid{

    public static void main(String[] args)
    {
        System.out.println("Enter Number of Rows: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}