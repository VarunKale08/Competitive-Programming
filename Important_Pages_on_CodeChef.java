/**
 * Important_Pages_on_CodeChef
 */
import java.util.Scanner;


public class Important_Pages_on_CodeChef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == 1 && b == 1)
        {
           System.out.println("https://discuss.codechef.com"); 
        }
        else if(a == 0)
        {
            System.out.println("https://www.codechef.com/practice");
        }
        else if(a == 1 )
        {
            System.out.println("https://www.codechef.com/contests");
        }
      sc.close();

    }
}