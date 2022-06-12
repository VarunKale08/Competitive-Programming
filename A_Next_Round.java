/**
 * A_Next_Round
 */
import java.util.Scanner;
public class A_Next_Round {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int count = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i = 0; i<n; i++ )
        {
            a[i] = sc.nextInt();

            if(a[i] >= a[k-1] && a[i] > 0 )
            {
                count++;
            }
        }

       
        System.out.println(count);
        sc.close();
    }
}