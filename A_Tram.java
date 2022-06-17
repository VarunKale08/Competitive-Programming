/**
 * A_Tram
 */
import java.util.Scanner;

public class A_Tram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, max =0;
        for (int i = 0; i < n; i++) 
        {
            int a = sc.nextInt();    
            int b = sc.nextInt();   
            if(i==0)
            {
                if(a == 0)
                {
                    sum = sum + b;
                }
            }
            else if(i == n-1)
            {
                if(b==0)
                {
                    sum = sum + b;
                }
            }
            
            else if(a>=0 && b>=0) 
            {
                sum = sum - a;
                sum = sum + b;
            }


            if(sum > max)
            {
                max = sum;
            }
            
        }

        System.out.println(max);

      sc.close();

    }
}