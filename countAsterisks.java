import java.util.Scanner;
public class countAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count1 =0 , count2=0, count3=0;

        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length-1; i++) 
        {
            if(strArray[i] == "|")
            {
                count1++;
                for (int j = 1; j < strArray.length; j++) 
                {
                    if(count1 ==1 && strArray[j] == "|")
                    {
                        count2++;
                    }
                    else if(strArray[j] == "*" )
                    {
                        count3++;
                    }    
                }
            }   


            
        }
        System.out.println(count3);
        
    }
}
