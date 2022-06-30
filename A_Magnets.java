/**
 * A_Magnets
 */
import java.util.Scanner;
public class A_Magnets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int prev = 0;
        
        for (int i = 0; i < n; i++) 
        {
             int mag = sc.nextInt();
             
             if(mag != prev)
             {
                count++;
             }

             prev = mag;
        }

        
        
        System.out.println(count);
        sc.close(); 
    }
}