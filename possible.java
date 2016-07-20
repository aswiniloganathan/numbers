
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class possibl {
    public static void main(String[] args)
    {
        int b=0,c=0,d=0;
        int avg1 = 0,avg2=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        b=((a.length)/2);
        if(b==3)
        {
            for(int i=0;i<a.length-2;i++)
            {
                c=c+a[i];
                avg1=c/2;
            }
                System.out.println(avg1);
      for(int i=3;i<a.length;i++)
              {
         d=d+a[i];
         avg2=d/2;
      }
      System.out.println(avg2);
     if(avg1==avg2)
     {
      System.out.println("possible");  }
       else
     {
         System.out.println("not");
     }
        
    }}
}
    

