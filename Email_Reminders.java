/**
 * Email_Reminders
 */
import java.util.Scanner;
public class Email_Reminders {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();

        int result = n - u;

        System.out.println(result);
        sc.close();
    }
}