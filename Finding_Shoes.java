/**
 * Finding_Shoes
 */
import java.util.Scanner;
public class Finding_Shoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

    for (int i = 0; i < t; i++) 
    {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int r;
        
            if(m > n || n > m)
            {
                r = n*2 - m;
            }
            else if(n == 0){
                r = n*2;
                System.out.println(r);
            }
    }
        
        sc.close();
    }
}