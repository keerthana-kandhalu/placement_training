
package javaapplication3;
import java.util.*;
public class StringCompression {
    public static void compressstring(){
        String str=new String();
        System.out.println("Enter the string in Capital:");
        Scanner scan = new Scanner(System.in);
        str=scan.nextLine();
        
        StringBuilder compressedString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressedString.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        compressedString.append(str.charAt(str.length() - 1)).append(count);

        System.out.println("Input: " + str);
        System.out.println("Output: " + compressedString);
    }
    public static void main(String args[])
    {
        compressstring();
    }
 }

