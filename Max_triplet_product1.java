package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Max_triplet_product1 {

          static int maxProduct(int[] arr)
          {
              int n = arr.length;
	         Arrays.sort(arr);
          return Math.max(arr[n-1]*arr[n-2]*arr[n-3],arr[0]*arr[1]*arr[2]);
          }
         
	
          
    		 public static void main(String[] args) {
			
			 int arr[]={3, 5, 6, 10, 20};
		        System.out.println(maxProduct(arr));
		    
		 }}
