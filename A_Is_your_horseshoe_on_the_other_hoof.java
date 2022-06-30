/**
 * A_Is_your_horseshoe_on_the_other_hoof
 */

import java.util.Arrays;
import java.util.Scanner;
public class A_Is_your_horseshoe_on_the_other_hoof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count =0;
        long[] s = new long[4];

        for (int i = 0; i < 4; i++) 
        {
            s[i] = sc.nextLong();    
        }
        
        Arrays.sort(s);
        for (int i = 0; i < 3; i++) 
        {
            if(s[i] == s[i+1])
            {
                count++;
            }    
        }
      
        System.out.println(count);
        sc.close();
    }
}