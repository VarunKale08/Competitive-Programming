/**
 * A_Arrival_of_the_General
 */
import java.util.Scanner;
public class A_Arrival_of_the_General {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int count = 0;


        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < a.length; i++) 
        {
            
            for (int j = i+1; j < a.length; j++) 
            {
                if(a[i] < a[j])
                {
                    count++;
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
                
            }

            
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
       
        System.out.println(count);
    }
}