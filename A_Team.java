/**
 * A_Team
 */
import java.util.Scanner;
public class A_Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        int count = 0;
        for (int i = 0; i < t; i++) 
        {
       
            int a, b, c;
            a = sc.nextInt();    
            b = sc.nextInt();    
            c = sc.nextInt();
            
            if( (a == 1 && b == 1) || (b == 1 && c == 1) || (a==1 && c==1) )
            {
                count = count + 1;
            }
            
            
        }
        System.out.println(count);
        sc.close();
    }
}