/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class b {
    public static void main(String[] args)
    {
     String startingfrom = "AVH**8mryk".toUpperCase();
        char a[] = startingfrom.toCharArray();
        for(int i = 0; i < a.length; i++) {
                            int value = (int)a[i];
                            if(value >= 65 && value <= 90)
                                System.out.println(a[i]+ " is an alphabate");
                            else 
                                System.out.println(a[i]+ " is not an alphabate");
        }
    
}}
