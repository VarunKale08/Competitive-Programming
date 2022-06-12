/**
 * practice
 */
public class practice {

    public static void main(String[] args) {
        int a= 6,count = 0;
        String s = Integer.toBinaryString(a);
        System.out.println(s);

        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i) == 1)
            {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}