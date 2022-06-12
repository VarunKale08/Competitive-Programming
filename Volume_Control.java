/**
 * Volume_Control
 */
import java.util.Scanner;


class Volume_Control {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    
        
    for (int i = 0; i < t; i++) 
    {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r;
        
        if(y > x)
        {
            r = y - x;
            System.out.println(r);
        }
        else 
        {
            r = x - y;
            System.out.println(r);
        }
    }
    sc.close();
    }
}