package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest_Element_long {
	static int getSecondLargest(int[] arr) {
          int n=arr.length;
          /*  Arrays.sort(arr); 
        	return arr[n-2]; */
          
          for(int i=0;i<n-1;i++){
        	  for(int j=0;j<n-i-1;j++){
        		  if(arr[j] > arr[j+1]){
        			  int temp=arr[j];
        			  arr[j]=arr[j+1];
        			  arr[j+1] =temp;  
        		
        		  }
        			 
        	  }
          }
		return arr[n-3];       
	}
          
    		 public static void main(String[] args) {
			
			 int arr[]={19, -10, 20, 14, 2, 16, 10};
		        System.out.println(getSecondLargest(arr));
		    
		 }}
