/**
 * B_Drinks
 */
import java.util.*;
public class B_Drinks {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double sum = 0;
        for(int i = 0;i<n;i++)
        {
            Double p =sc.nextDouble();

            sum = sum + p;
        }
        double finalAns =  sum / n;
        System.out.println(finalAns);
        sc.close();
    }
}