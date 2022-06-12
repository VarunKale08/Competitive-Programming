import java.util.*;



/**
 * Dark_Light
 */
public class Dark_Light {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) 
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // if(k != 0 && (n >=1 || n <= 3) )
            // {
            //     System.out.println("Ambiguous");
            // }
            // else
            // {
                // for(int j = 0; j< n;j++)
                // {
                //      k = k+1;
                // }

                
                // System.out.println(k);
                

                    if(n >= 1 && k>=1)
                    {
                        System.out.println("Ambiguous");
                    }
                    else 
                    {
                        k = k+n;
                        if(k == 0 || k==4)
                        {
                            System.out.println("Off");
                        }
                        else if(k >= 1 || k <= 3)
                        {
                          System.out.println("On");
                        }
                    }
                
               
           

        }
        sc.close();
    }
}