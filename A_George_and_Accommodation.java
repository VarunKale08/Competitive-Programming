/**
 * A_George_and_Accommodation
 */
import java.util.Scanner;


public class A_George_and_Accommodation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p,q,total;
        int count=0;
        for (int i = 0; i < n; i++) 
        {
           p = sc.nextInt();  
           q = sc.nextInt(); 
          
          total = q - p;

          if(total >= 2)
          {
              count++;
              
          }
         
        }
    
        System.out.println(count);
        sc.close();
    }
}