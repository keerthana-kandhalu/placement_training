
package javaapplication4;

public class Nextpalindrome {

    public static void main(String[] args) {
        int number = 875 ;
        while(number!=0)
        {
            number++;
            if(checkpalindrome(number))
            {System.out.println(number);
                        break;}
        }
    }

    public static boolean checkpalindrome(int num) {
        
        int rev=0;
        int temp=num;
        while(num!=0)
        {
            int m=num%10;
            rev=(rev*10)+m;
            num=num/10;
        }
        if(temp==rev) return true;
        else return false;
    }
}