/**
 * A_Hit_the_Lottery
 */
import java.util.Scanner;
public class A_Hit_the_Lottery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
    int ans = a/100;
    int left = a%100;
 
    ans+= left/20;
    left= left%20;
 
    ans+= left/10;
    left = left%10;
 
    ans+= left/5;
    left=left%5;
 
    ans+=left/1;
        System.out.println(ans);
    }
}