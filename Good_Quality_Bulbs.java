import java.util.*;

/**
 * Good_Quality_Bulbs
 */
public class Good_Quality_Bulbs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) 
        {
            int sum = 0;
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            for (int j = 0; j < n-1; j++) 
            {
                int ele = sc.nextInt();    
                sum +=ele;

            }
          
            if( sum >= x*n )
            {
                System.out.println(0);
            }
            else
            {
                System.out.println( (n * x)-sum);
            }
        }

        sc.close();
    }
}