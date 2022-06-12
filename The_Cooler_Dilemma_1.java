import java.util.Scanner;

/**
 * The_Cooler_Dilemma_1
 */
public class The_Cooler_Dilemma_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) 
        {
            int x = sc.nextInt();      
            int y = sc.nextInt();      
            int m = sc.nextInt();
            

            if(x * m == y)
            {
                System.out.println("NO");
            }
            else if(x * m > y)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }


        sc.close();
    }
}