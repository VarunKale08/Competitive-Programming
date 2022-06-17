/**
 * A_Elephant
 */
import java.util.Scanner;
public class A_Elephant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
       int ele =5;
        if(x > 5)
        {
            do{
                
                x = x % ele;
                ele--;
            }while(x==0);

            System.out.println(5-x);
            

        }
        else
        {
            System.out.println(1);
        }
    }
}