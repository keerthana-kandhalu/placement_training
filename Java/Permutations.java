
package javaapplication3;

import java.util.ArrayList; 
import java.util.Arrays; 
public class Permutations {

	static void swap(int nums[], int l, int i) 
	{ 
		int temp = nums[l]; 
		nums[l] = nums[i]; 
		nums[i] = temp; 
	} 

	static void permutations(ArrayList<int[]> res, int[] nums, int l, int h) 
	{ 
		if (l == h) { 
			res.add(Arrays.copyOf(nums, nums.length)); 
			return; 
		} 

		for (int i = l; i <= h; i++) { 
			swap(nums, l, i); 
 
			permutations(res, nums, l + 1, h); 

			swap(nums, l, i); 
		} 
	} 

	static ArrayList<int[]> permute(int[] nums) 
	{ 
		ArrayList<int[]> res = new ArrayList<int[]>(); 
		int x = nums.length - 1; 
 
		permutations(res, nums, 0, x); 
		return res; 
	} 

	public static void main(String[] args) 
	{ 
		int[] nums = { 1, 2, 3 }; 
		ArrayList<int[]> res = permute(nums); 

		for (int[] x : res) { 
			for (int y : x) { 
				System.out.print(y + " "); 
			} 
			System.out.println(); 
		} 
	} 
}


/*
    }
    public static void main(String[] args) 
	{ 
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter n:");
                int n=scan.nextInt();
                int[] input =new int[n];
                System.out.println("Enter the array elements:");
                for (int i=0;i<n;i++)
                {
                    input[i]=scan.nextInt();
                }
		Permutations pa = new Permutations(); 
		System.out.println("The product array is : "); 
		pa.permutaion_array(input, n); 
	} 
}*/
