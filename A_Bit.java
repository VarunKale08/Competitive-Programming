/**
 * A_Bit
 */
import java.util.Scanner;
public class A_Bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = 0;
        for (int i = 0; i < n; i++) 
        {
           
             String op = sc.next();
           
          
            if(op.charAt(1) == '+' )
            {
                num++;
            }
            else 
            {
                num--;
            }
            
        }
        System.out.println(num);

        sc.close();
    }
}