import java.util.*;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * A_Word_Capitalization
 */
public class A_Word_Capitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String s = sc.next();

        // char[] arr = s.toCharArray();

        String first = s.substring(0, 1);
        String rem = s.substring(1, s.length());

        first = first.toUpperCase();
        
    
        System.out.println(first+rem);

   sc.close();
    }
}