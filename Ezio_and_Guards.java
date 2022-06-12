import java.util.Scanner;

/**
 * Ezio_and_Guards
 */
public class Ezio_and_Guards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) 
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x >= y)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}