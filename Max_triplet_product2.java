package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Max_triplet_product2 {

          static int maxProduct(int[] arr)
          {
              int n = arr.length;
	          int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
	          int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
	          
	          for(int num : arr){
	        	  if(num > max1){
	        		  max3 =max2 ;
	        		  max2= max1;
	        		  max1=num;
	        	  }
	        	  else if(num > max2){
	        		  max3=max2;
	        		  max2 = num;
	        	  }
	        	  else if(num > max3){
	        		  max3=num;
	        	  }
	        	  if(num < min1){
	        		  min2 =min1;
	        		  min1=num;
	        	  }
	        	  else if(num <min2){
	        		  min2 =num;
	        	  }
	          }
	          return Math.max(max1*max2*max3,max1*min1*min2);
          }
         
	
          
    		 public static void main(String[] args) {
			
			 int arr[]={3, 5, 6, 10, 20};
		        System.out.println(maxProduct(arr));
		    
		 }}
