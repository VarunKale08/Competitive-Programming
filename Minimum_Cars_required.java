import java.util.Scanner;
// import java.lang.Math;
/**
 * Minimum_Cars_required
 */
public class Minimum_Cars_required {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int total;
        for (int i = 0; i < t; i++) 
        {
            int n = sc.nextInt();
            
            if(n <= 4)
            {
                 total = 1;
                System.out.println(total);
            }
            else if(n % 4 == 0)
            {
                 total = n / 4;
                System.out.println(total);
            }
            else if(n % 4 != 0)
            {

                 total = n / 4;
                total = total + 1;
                System.out.println(total);
            }
        }
        sc.close();
    }
}