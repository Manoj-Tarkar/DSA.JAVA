package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Max_triplet_product {

          static int maxProduct(int[] arr)
          {
              int n = arr.length;
	      int max_pro=Integer.MIN_VALUE;
	      for(int i=0;i<n;i++){
	    	  for(int j=i+1;j<n-1;j++){
	    		  for(int k=j+1;k<n;k++){
	    			 max_pro=Math.max(max_pro, arr[i]*arr[j]*arr[k]);
	    		  }
	    	  }
	      }
         
          return max_pro;
          }
         
	
          
    		 public static void main(String[] args) {
			
			 int arr[]={3, 5, 6, 10, 20};
		        System.out.println(maxProduct(arr));
		    
		 }}
