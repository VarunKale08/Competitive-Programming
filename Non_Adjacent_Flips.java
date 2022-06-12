import java.util.Scanner;
/**
 * Non_Adjacent_Flips
 */
public class Non_Adjacent_Flips {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) 
        {
                int n = sc.nextInt();
                String s = sc.nextLine() ;
                int num = Integer.parseInt(s);
                for (int j = 0; j < s.length(); j++) 
                {
                    if(s.charAt(j) == 1)
                    {
                        count++;
                    }
                }
                System.out.println(count);

        }

        sc.close();
    }
}