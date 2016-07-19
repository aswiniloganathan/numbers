/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TODO code application logic here Scanner sc=new Scanner(System.in);
        int a[]=new int [5];
        int t;
        for(int i=0;i<5;i++)
        {
       a[i]=sc.nextInt();
        }
        for(int j=0;j<5;j++)
        {
           for(int s=j+1;s<5;s++)
           {
        if(a[j]>a[s])
        {
         t=a[j];
         a[j]=a[s];
         a[s]=t;
        }
        
    }
        }
        for(int m=0;m<2;m++)
        {
            System.out.println(""+a[m]);
        }

}}
    

