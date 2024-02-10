
package javaapplication4;

import java.util.Scanner;

public class Countvowels {
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String:");
        String str1=scan.next();
        countvowels(str1);    }
    private static void countvowels(String s)
    {
        int arr[]=new int[5];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
                arr[0]++;
            else if(s.charAt(i)=='e')
                arr[1]++;
            else if(s.charAt(i)=='i')
                arr[2]++;
            else if(s.charAt(i)=='o')
                arr[3]++;
            else if(s.charAt(i)=='u')
                arr[4]++;
           // else
                //continue;
           
        }
            System.out.println("a:"+arr[0]);
            System.out.println("e:"+arr[1]);
            System.out.println("i:"+arr[2]);
            System.out.println("o:"+arr[3]);
            System.out.println("u:"+arr[4]);
    }
}
