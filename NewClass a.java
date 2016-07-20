
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class NewClass {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]= sc.nextInt();
        }
        outer :for(int i=0;i<=a.length-1;i++)
            {
                for(int j=i+1;j<=a.length-1;j++)
                {
                    if(a[i]==a[j])
                    {
                        System.out.println(a[i]);
                        break outer;
                    }
                }
            }
            
            
    }
            
    
}
