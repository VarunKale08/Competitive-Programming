/**
 * Course_Registration
 */
import java.util.Scanner;
public class Course_Registration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) 
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int r = k + n;
            
            if(r <= m)
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