/**
 * A_Fox_And_Snake
 */

import java.util.Scanner;

public class A_Fox_And_Snake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int flag =0;

        for (int i = 1; i <= n; i++) 
        {
            if(i % 4 ==2)
            {
                for (int j = 1; j < m; j++) 
                {
                   System.out.print(".");
                }
                System.out.print("#");
            }
            else if(i%4==0)
            {
                System.out.print("#");
                for (int j = 1; j < m; j++) 
                {
                   System.out.print(".");
                }
            }
            else
            {
                for (int j = 1; j <= m; j++) 
                {
                   System.out.print("#");
                }
            }
            System.out.println();
        }

    }
}