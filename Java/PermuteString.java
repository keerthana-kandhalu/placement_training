
package javaapplication4;

import java.util.ArrayList;
import java.util.Scanner;

public class PermuteString {
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the string: ");
        String s=in.nextLine();
        char ch[]=s.toCharArray();
        ArrayList<String> res=new ArrayList<>();
        permutation(ch,0,res);
        //ArrayList<String> uniqueList = new ArrayList<>();
       ArrayList<String> uniqueRes = removeDuplicates(res);
        for (String str : uniqueRes) {
            System.out.print(str + " ");
        }
    }
        private static void permutation(char ch[],int fi,ArrayList<String> res)
        {
            if(fi==ch.length-1)
            {
                res.add(new String(ch));
            }
            for(int i=fi;i<ch.length;i++)
            {
                swap(ch,i,fi);
                permutation(ch,fi+1,res);
                swap(ch,i,fi);
            }
        }
        private static void swap(char ch[],int i,int fi)
        {
            char temp=ch[i];
            ch[i]=ch[fi];
            ch[fi]=temp;
        }
    private static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        ArrayList<String> uniqueList = new ArrayList<>();
        for (String str : list) {
            if (!uniqueList.contains(str)) {
                uniqueList.add(str);
            }
        }
        return uniqueList;
    }
}    