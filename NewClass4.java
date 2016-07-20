
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class NewClass4 {
    public static void main(String[] args)
    {
        int b=0;
  Scanner sc=new Scanner(System.in);
  int a[]=new int[4];
  for(int i=0;i<a.length;i++)
  {
      a[i]=sc.nextInt();
  }
  for(int i=0;i<a.length;i++)
  {
      for(int j=i+1;j<a.length;j++)
      {
          b=a[i]+a[j];
          if(b==9)
          {
              System.out.println("value is"+a[i]+" "+a[j]);
          
          }
          else
          {
             //System.out.println("not present");
              }
          }
          
      }}
  
}
