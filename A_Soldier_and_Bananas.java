/**
 * A_Soldier_and_Bananas
 */
import java.util.*;
public class A_Soldier_and_Bananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        
        
                k = k *w;
        

        if(k>n)
        {
            k = k -n;
            System.out.println(k);
        }
        else if(k <=n)
        {
            System.out.println(0);
        }
    }
}