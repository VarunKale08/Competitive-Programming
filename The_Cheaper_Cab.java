/**
 * The_Cheaper_Cab
 */
import java.util.Scanner;

public class The_Cheaper_Cab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) 
        {
            int f = sc.nextInt();
            int s = sc.nextInt();

            if(f == s)
            {
                System.out.println("ANY");
            }
            else if(f > s)
            {
                System.out.println("SECOND");
            }
            else
            {
                System.out.println("FIRST");
            }
        }
        sc.close();
    }
}