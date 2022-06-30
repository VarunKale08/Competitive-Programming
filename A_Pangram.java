/**
 * A_Pangram
 */
import java.util.*;
public class A_Pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int count = 0;
        

        for (char ch='a'; ch<= 'z' ; ch++) 
        {
            if(s.toLowerCase().contains(String.valueOf(ch)))
            {
                count++;
            }
        }        
       if(count == 26)
       {
        System.out.println("YES");
       }
       else
       {
        System.out.println("NO");
       }
    }
}