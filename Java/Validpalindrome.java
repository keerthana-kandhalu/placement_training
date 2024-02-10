
package javaapplication4;

import java.util.Scanner;

public class Validpalindrome {
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String str1=scan.next();
        System.out.println(checkpalindrome(str1));
        
    }
    private static boolean checkpalindrome(String s)
    {
        int k=0;
        int l=s.length()-1;
        while(k<l)
        {
          if(Character.isLetter(s.charAt(k))&&Character.isLetter(s.charAt(l))) 
                  {
                    if(Character.toLowerCase(s.charAt(k))!=Character.toLowerCase(s.charAt(l)))  
                        return false;
                    k++;
                    l--;
                    
                  }
          else if(Character.isDigit(s.charAt(k))&&Character.isDigit(s.charAt(l)))
          {
              if(s.charAt(k)!=s.charAt(l))
              {
                  return false;
              }
              k++;
              l--;
             
          }
          else if(!Character.isLetter(s.charAt(k))&&!Character.isLetter(s.charAt(k)))
              k++;
          else if(!Character.isDigit(s.charAt(k))&&!Character.isDigit(s.charAt(k)))
              l--;
          else
              return false;
        }    
    return true;
    }
}
