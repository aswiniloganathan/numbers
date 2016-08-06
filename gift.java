
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class gift {
    private static int KEY_LENGTH;
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an 8 char key: ");
        String input;
        try{
            input = br.readLine();
            if (input.length() < 8) {
                System.out.println("Key < 8B. Exiting. . .");
                System.exit(1);
            }
            
            char[] inputKey = input.toCharArray();
            byte[] k = new byte[8];
            byte[] key = new byte[7];

            
            for (int counter = 0; counter < 8; counter++)
                k[counter] = (byte) inputKey[counter];

            System.out.print("\n$$ " + new String(k) + "  $$\n");

           
            for (int counter = 0; counter < KEY_LENGTH - 1; counter++) {
                k[counter] = (byte) (k[counter] >>> 1);
                k[counter] = (byte) (k[counter] << 1);
            }

            for (int counter = 0; counter < KEY_LENGTH - 1; counter++) {
                key[counter] = (byte) (k[counter] << counter);
                key[counter] = (byte) (key[counter] | (k[counter + 1] >>> (KEY_LENGTH - 1 - counter)));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }}

