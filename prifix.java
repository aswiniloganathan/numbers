
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class fgggf {
    public static void main(String[] arg) 
    {
        
	
		int i;
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
	 int l=text.length()-1;

		char le = 0;
		for(i=0; i<text.length(); i++)
		{
		    le = text.charAt(i);
		    if(le>='A' && le<='Z')
		        System.out.println((int)le - 'A'+1);
		    if(le>='a' && le<= 'z')
		        System.out.println((int)le - 'a'+1);
                }
                for(i=l;i>=0;i--)
                {
                    int a=i;
                    
                }System.out.println("last char="+i);
                char s=(char) (le+i);
                System.out.println("alpha="+s);


	}
}
    

