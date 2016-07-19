/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
        int t;
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<5;j++)
        {
            if(a[j]>a[j+1])
            {
                t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }}
        for(int l=0;l<2;l++)
        {
            System.out.println(a[l]);
        }
        // TODO code application logic here
    }

   
}
