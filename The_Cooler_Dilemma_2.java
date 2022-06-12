import java.util.Scanner;
import java.math.*;
/**
 * The_Cooler_Dilemma_2
 */
public class The_Cooler_Dilemma_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) 
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result;
            
            if(x % 2 ==0)
            {
                result = y/x - 1;
                System.out.println(result);
            }
            else if(x < y)
            {
                result = (y / x);
                 System.out.println(result);
            }
            else{
                System.out.println(0);
            }
            
          
        }
          sc.close();
    }
}