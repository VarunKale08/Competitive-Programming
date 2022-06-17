/**
 * A_In_Search_of_an_Easy_Problem
 */
import java.util.Scanner;
public class A_In_Search_of_an_Easy_Problem {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int n = sc.nextInt();

    for(int i = 0;i<n;i++)
    {
        int p = sc.nextInt();

        if(p == 1)
        {
            count++;
        }

    }

    if(count == 0)
    {
        System.out.println("EASY");
    }
    else
    {
        System.out.println("HARD");
    }
    sc.close();
    }
}