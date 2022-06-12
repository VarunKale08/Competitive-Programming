/**
 * Digit_Sum_Parities
 */
import java.util.Scanner;
public class Digit_Sum_Parities 
{

    static void digitSum(int n)
    {
        int len = String.valueOf(n).length();
        int sum1 = 0, z=0;
        for (int j = 0; j < len ; j++) 
         {
                 z = n % 10;
                sum1 = sum1 + z;
                n = n / 10;
         }
       
         if(sum1 % 2 == 0)
         {
            int a = n + 1;
            digitSum(a);
 
         }
         else
         {
           System.out.println(n);
         }
            
    }

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        for (int i = 0; i < t; i++) 
        {
             n = sc.nextInt();
            digitSum(n);
        }
        sc.close();
    }


}

// if(n % 2 == 0)
//             {
//                 int a = n + 1;
//                 for (int j = 0; j < len ; j++) 
//                 {
//                         int z = a % 2;
//                         sum = sum + z;
//                 }
//                 if(sum % 2 == 0)
//                 {
//                     a = a+1;
//                 }
//                 else
//                 {
//                     System.out.println(sum);
//                 }

//             }