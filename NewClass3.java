
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class NewClass3 {
    private static int n;
    public static void main(String[] args){
        
 int a=0;
    int s = 0;
    Scanner sc=new Scanner(System.in);
    int p1=sc.nextInt();
    
  while(p1!=0)
  {
      a=p1%10;
      p1=p1/10;
      s=s*10+a;
  }
  
  if(s==n)
  
  {
      System.out.println("palindrom");
  }
  else
    {
        System.out.println("not");
    }
       }
    }

