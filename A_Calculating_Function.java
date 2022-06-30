/**
 * A_Calculating_Function
 */
import java.util.*;
import java.math.*;
public class A_Calculating_Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long formula;
		
		
		if (n%2 == 0)
        {
            formula = n/2;  
        } 
		else
        {
            formula = (-1)*(n/2 + 1);
        } 
		
		
		System.out.println(formula);
       
        
      
            
           
    
        
     
        sc.close();
    }
}