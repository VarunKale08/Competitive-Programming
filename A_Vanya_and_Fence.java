/**
 * A_Vanya_and_Fence
 */
import java.util.Scanner;
public class A_Vanya_and_Fence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] a = new int[10000];
        for (int i = 0; i < n; i++) 
        {
              a[i] = sc.nextInt();      
        }
      
        int totalW= 0;
        for (int j = 0; j < n; j++) 
        {
            if(a[j] >  h)
            {
                totalW = totalW + 2;
            }
            else if(a[j]<= h)
            {
                totalW = totalW + 1;
            }
        }
        System.out.println(totalW);

        sc.close();
    }
}