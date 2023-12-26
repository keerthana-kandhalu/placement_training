
package javaapplication3;
import java.io.*;
import java.util.*;
public class Happynumber {
        public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=scan.nextInt();
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNextNumber(n);
        }

        return n == 1;
    }

    private static int getNextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

}
