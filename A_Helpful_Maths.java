import java.util.*;
import java.util.Arrays;
/**
 * A_Helpful_Maths
 */
public class A_Helpful_Maths 
{

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        String first1 = sc.next();
       
        first1 = first1.replace("+", "");
        char []arr = first1.toCharArray();
      
       
        Arrays.sort(arr);
      
       
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i == arr.length-1)
                continue;
            System.out.print("+");           
        }
        // System.out.println();
        sc.close();
    }
}