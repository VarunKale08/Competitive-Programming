/**
 * Rearranging_digits_to_get_a_multiple_of_5
 */
import java.util.Scanner;

public class Rearranging_digits_to_get_a_multiple_of_5 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
        boolean op = false;
       for (int i = 0; i < t; i++) 
       {
           int n = sc.nextInt();
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) 
            {
                if(s.charAt(j) == '5' || s.charAt(j) == '0')
                {
                  op   = true;
                  break;
                }  
            }

            if(op == true)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
       }

        sc.close();
    }
}