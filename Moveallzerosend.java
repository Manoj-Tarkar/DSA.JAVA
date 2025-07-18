package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Moveallzerosend {
	
	 public static void main(String[] args) {
		int arr[]={1, 2, 0, 4, 3, 0, 5, 0};
		int max[] = new int[arr.length];
		int count=0 ,max1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != 0){
				max[count]=arr[i];
				count++;
				//System.out.println(count);
			}}
				for(int i=0;i<arr.length;i++){
					System.out.println(max[i]);
	 }}}