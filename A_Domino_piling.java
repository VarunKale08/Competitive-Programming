/**
 * A_Domino_piling
 */
import java.util.Scanner;
public class A_Domino_piling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int total = m * n;

        int d = 2;

            int max = total / d;
            System.out.println(max);
        sc.close();
        }
}