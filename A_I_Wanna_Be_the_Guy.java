/**
 * A_I_Wanna_Be_the_Guy
 */
import java.util.Scanner;
import java.util.Arrays;
public class A_I_Wanna_Be_the_Guy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int p = sc.nextInt();
        int[] a = new int[p];
        for (int i = 0; i < p; i++) 
        {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] b = new int[q];
        for (int j = 0; j < q; j++) 
        {
            b[j] = sc.nextInt();
        }

        // Arrays.sort(a);
        // Arrays.sort(b);
     
        int max1 = a[0];

        for(int k =0;k<a.length;k++)
        {
            if(a[k]>max1)
            {
                max1= a[k];
            }
        }

        int max2= b[0];
        for(int o =0;o<b.length;o++)
        {
            if(b[o]>max2)
            {
                max2 = b[o];
            }
        }
        // if(a[p-1] > b[q-1])
        // {
        //     System.out.println("I become the guy.");
        // }
        // else if(a[p-1] < b[q-1])
        // {
        //     System.out.println("I become the guy.");
        // }

        if(max1 > max2 )
        {
            System.out.println("I become the guy.");
        }
        else if( max2 > max1)
        {
            System.out.println("I become the guy.");
        }
        else
        {
            System.out.println( "Oh, my keyboard!");
        }
        sc.close();
    }
}