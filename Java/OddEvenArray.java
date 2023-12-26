
package javaapplication3;
import java.io.*;
import java.util.*;

public class OddEvenArray {
   
    public static void spiltarray(int arr[])
    {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even.add(arr[i]);
            }
            else
            {
              odd.add(arr[i]); 
            }
        }
        System.out.println("Even array:"+even);
        System.out.println("Odd array:"+odd);
    }
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
    System.out.print("Enter no of elements in array:");
    int n=scan.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements: ");
    for (int i=0;i<n;i++)
    {
        arr[i]=scan.nextInt();
    }
    spiltarray(arr);        
    }
}