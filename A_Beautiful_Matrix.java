/**
 * A_Beautiful_Matrix
 */
import java.util.Scanner;
import java.math.*;
public class A_Beautiful_Matrix {

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
        int a=0,b=0,i,j,result ;
      
        for ( i = 1 ;i <= 5; i++) 
        {
            for ( j =1; j <= 5; j++) 
            {
                if( sc.nextInt() == 1)
                {
                    a = i;
                    b = j;
                    break;
                }    
            }
            
        }
        result = Math.abs(3 - a) + Math.abs(3 - b);
         System.out.println(result);
       
       


    }
}