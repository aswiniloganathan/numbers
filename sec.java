
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class sec {
    public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
 
        String word = "";
        String largeWord = "";
        int i, l, lw, max = 0, c = 0;
        char ch;
        st = st + " ";
        l = st.length();
        for (i = 0; i < l; i++) {
            ch = st.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } else {
                lw = word.length();
                if (lw > max) {
                    max = lw;
                    largeWord = word;
                }
                word = "";
            }
        }
        System.out.println("Largest Word: " + largeWord);    
}
}

