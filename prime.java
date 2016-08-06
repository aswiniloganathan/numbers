
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class prime {
    private static int[] a;
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
       for(int i=0;i<5;i++)
       {        int a=sc.nextInt();
    }
       for(int i=0;i<5;i++){
           if(a[i]<100){
              char []c= String.valueOf(a[i]).toCharArray();
               System.out.println(c[i]+" "+c[i+1]);
           }
       }
    
}}
