/**
 * Fitness
 */
import java.util.*;
public class Fitness {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) 
        {
            int x = sc.nextInt();

            int n = x + x;

            System.out.println(n * 5);
        }
        sc.close();
    }
}