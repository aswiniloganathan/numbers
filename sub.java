
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class sub {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
 
        String w = "";
        String largeWord = "";
        int i, l, lw, max = 0, c = 0;
        char m;
        s= s + " ";
        l = s.length();
        for (i = 0; i < l; i++) {
            m = s.charAt(i);
            if (m!= ' ') {
                w = w+ m;
            } else {
                lw = w.length();
                if (lw > max) {
                    max = lw;
                    largeWord = w;
                }
                w = "";
            }
        }
        System.out.println("Largest Word: " + largeWord);    
}
}

    


    

