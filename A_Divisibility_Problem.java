/**
 * A_Divisibility_Problem
 */
import java.util.Scanner;
public class A_Divisibility_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count ;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) 
        {
             a[i] = sc.nextInt();
             b[i] = sc.nextInt();

             count = 0;
             while(a[i] % b[i] != 0 )
             {
                 a[i]++; //= a + 1;
                 count++;
             }  
             System.out.println(count);   
        }

        // for (int i = 0; i < n; i++) 
        // {
            
        // }
        sc.close();
      
    }
}