import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target){
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int middle = (start + end) /2;
			
			if(arr[middle] == target) {
				return middle;
			}else if(arr[middle] < target) {
				start = middle + 1;
			}else {
				end = middle -1;
			}
		}
		return -1;
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//Get target value from user
		System.out.println("Enter the target value from 10 to 100 :");
		int target = scan.nextInt();
		
		//array of integers
		
		int[] arr = {10,20,30,46,56,65,76,55,71,51,33,22,66,99,23};
		int temp = 0;
		
		System.out.println("Unsorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("sorted array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//Find index of target value
		int index = binarySearch(arr, target);
		
		//print index of target value
		if (index != -1) {
			System.out.println("The target value find at index "+(index+1));
		} else {
			System.out.println("The target value is not found");
		}
	}

}
