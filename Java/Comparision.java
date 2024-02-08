
package javaapplication4;
import java.util.Scanner;
public class Comparision {
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String str1=scan.next();
        System.out.println("Enter the string2: ");
        String str2=scan.next();
        comparestring(str1,str2);        
    }
    private static void comparestring(String s, String t)
    {   if(s.length()==t.length())
        {
            for(int i=0;i<s.length();i++)
            {
                if (s.charAt(i)!=t.charAt(i) )
                {
                    if(s.charAt(i+1)!=t.charAt(i+1))
                    {System.out.println(s.charAt(i)+""+s.charAt(i+1)+","+t.charAt(i)+""+t.charAt(i+1));
                        i++;}
                    else if(s.charAt(i+1)==t.charAt(i+1))
                        System.out.println(s.charAt(i)+","+t.charAt(i));
                }
            }
        }
    else System.out.println("Enter equal length strings");
        
    }
}
 