import java.util.*;

/**
 * A_Boy_or_Girl
 */
public class A_Boy_or_Girl {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Set <Character> c = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) 
        {
            c.add(s.charAt(i)); 
        }

        if(c.size() % 2 ==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}