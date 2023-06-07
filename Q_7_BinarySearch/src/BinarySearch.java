import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target){
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int middle = start + (end-start) /2;
			
			if(target < arr[middle]) {
				end = middle - 1;
			}else if( target > arr[middle]) {
				start = middle + 1;
			}else {
				return middle;
			}
		}
		return -1;
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array of integers

		int[] arr = {10,20,30,46,56,65,76,55,71,51,33,22,66,99,23};
		Scanner scan = new Scanner(System.in);
		
		//Get target value from user
		System.out.println("Enter the target value you have to find from 1 to 100 :: ");
		int target = scan.nextInt();
		
		Arrays.sort(arr);
		//sorted order array
		System.out.println(Arrays.toString(arr));
		
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
