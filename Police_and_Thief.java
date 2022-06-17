import java.util.*;

/**
 * Police_and_Thief
 */
public class Police_and_Thief {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        // int count = 0;
        for (int i = 0; i < t; i++) 
        {
           
            int x = sc.nextInt();
            int y = sc.nextInt();

           
            if(x == y)
            {
                System.out.println(0);
            }
            else if(y > x)
            {
                System.out.println(y - x);
            }
            else if(x > y)
            {
                System.out.println(x - y);
            }
        }
        sc.close();
    }
}

// Scanner sc = new Scanner(System.in);

// int t = sc.nextInt();
// int count = 0;
// for (int i = 0; i < t; i++) {
//     int x = sc.nextInt();
//     int y = sc.nextInt();

//     if (x > y) {
//         System.out.println(x - y);
//     } else if (x < y) {
//         x = x + 2;
//         count += 2;

//         if (x == y) {
//             System.out.println(count);
//         }
//     } else if (x == y) {
//         System.out.println(0);
//     }
// }
