/**
 * A_Anton_and_Danik
 */
import java.util.Scanner;


public class A_Anton_and_Danik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int noOfGames = sc.nextInt();
        sc.nextLine();
        String outcome = sc.nextLine();
 
        int countAn =0, countDa = 0;
        for (int i = 0; i < noOfGames; i++) 
        {
            char w = outcome.charAt(i);
            
            if(w == 'A')
            {
                countAn++;
            }
            else if(w == 'D')
            {
                countDa++;
            }

        }

        if(countAn>countDa)
        {
            System.out.println("Anton");
        }
        else if(countAn < countDa)
        {
            System.out.println("Danik");
        }
        else 
        {
            System.out.println("Friendship");
        }
        
    }
}