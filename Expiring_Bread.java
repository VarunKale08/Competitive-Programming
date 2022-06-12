import java.util.*;
/**
 * Expiring_Bread
 */
public class Expiring_Bread {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) 
        {
            int n = sc.nextInt();    
            int m = sc.nextInt() ;   
            int k = sc.nextInt();
            
            if((n - (m*k) == 0) || n - (m*k) < 0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        sc.close();
    }
}