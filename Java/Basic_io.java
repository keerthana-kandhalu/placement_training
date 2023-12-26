
package javaapplication3;

import java.util.Scanner;

public class Basic_io {
    public static void main(String[] args) {
        int number;
        float f1,f2;
        Scanner scan=new Scanner(System.in);  
        System.out.println("Enter integer:");
        number = scan.nextInt();
        System.out.println("Entered number: "+number);
        System.out.println("Enter two floating point integers");
        f1=scan.nextFloat();
        f2=scan.nextFloat();
        float avg=(f1+f2)/2;
        System.out.printf("Average of the two floating number is:%.2f%n",avg);
        scan.close();
}
}
