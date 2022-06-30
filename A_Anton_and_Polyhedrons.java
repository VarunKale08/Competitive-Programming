/**
 * A_Anton_and_Polyhedrons
 */
import java.util.*;;
public class A_Anton_and_Polyhedrons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  count =0;
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n]; 
        for (int i = 0; i < n; i++) 
        {
            
            s[i] = sc.nextLine();
            
            if(s[i].equals("Tetrahedron"))
            {
                count += 4;
            }
            else if(s[i].equals("Cube"))
            {
                count += 6;
            }
            else if(s[i].equals("Octahedron"))
            {
                count += 8;
            }
            else if(s[i].equals("Dodecahedron"))
            {
                count += 12;
            }
            else if(s[i].equals("Icosahedron"))
            {
                count += 20;
            }
           
            
        }
        System.out.println(count);
    }
}