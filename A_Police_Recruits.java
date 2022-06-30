/**
 * A_Police_Recruits
 */
import java.util.Scanner;
public class A_Police_Recruits {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] b = new int[n];
    int sum =0,count=0;
    for (int i = 0; i < n; i++) 
    {
         b[i] = sc.nextInt();    
    }
    for (int i = 0; i < b.length; i++) {
        if(b[i] >= 1)
        {
            if(b[i-1] == -1)
            {

            }
        }
        else
        {
            count++;
        }
    }
    System.out.println(count);
    }
}