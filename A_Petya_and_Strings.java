import java.util.Scanner;


/**
 * A_Petya_and_Strings
 */
public class A_Petya_and_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean z = false;

       
            if(a.length() == b.length())
            {
                String low1 = a.toLowerCase();
                String low2 = b.toLowerCase();
                
                for (int i = 0; i < a.length(); i++) 
                {
                    if(low1.charAt(i) == low2.charAt(i))
                    {
                        z = true;
                    }
                    else if(low1.charAt(i) > low2.charAt(i))
                    {
                        z = false;
                        System.out.println(1);
                        break;
                    }
                    else if(low1.charAt(i) < low2.charAt(i))
                    {
                        z = false;
                        System.out.println(-1);
                        break;
                    }
                }
            }
            
            if(z)
            {
                System.out.println(0);
            }
       
        sc.close();
    }
}