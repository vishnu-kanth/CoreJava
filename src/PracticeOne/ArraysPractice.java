package PracticeOne;
import java.util.*;

public class ArraysPractice {
	public static int getLargest(int nums[]) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(largest<nums[i]) {
				largest = nums[i];
			}
			if(smallest>nums[i]) {
				smallest = nums[i];
			}
		}
		System.out.println("Smallest value is: " + smallest);
		return largest;
	}
	public static void main(String args[]) {
		int nums []= {2,4,6,8,12};
		System.out.println("Largest Number is: " + getLargest(nums));
	}

}
