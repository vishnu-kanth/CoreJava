package ArraysPraticeProblems;

public class index {
	public static void main(String[] args) {
		
//		1st Question
//		int arr[] = {1,2,3,4,5};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		2nd question
		
//		int arr[]= {2,3,4,5,6,10};
//		int max=arr[0];
//		for(int i = 0;i<arr.length;i++) {
//			if(arr[i]>max)
//				max=arr[i];
//		}
//		System.out.println(max);
//		
//		3rd Question
		
//		int arr[] = {2,3,4,5,6};
//		int sum = 0;
//		int avg = 0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		avg = sum/arr.length;
//		System.out.println(sum);
//		System.out.println(avg);

//      4th Question
		
//		int arr[]= {2,3,4,5,6,44,22};
//		int evencount = 0;
//		int oddcount = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2 !=0) {
//				oddcount++;
//			}else {
//				evencount++;
//			}
//		}
//		System.out.println("Even count: "+ evencount);
//		System.out.println("Odd count: "+ oddcount);
		
//      5th Question
		
//		int arr[] = {1,2,3,4,5};
//		int left = 0;
//		int right = arr.length -1;
//		while(left<right) {
//			int temp = arr[left];
//			arr[left] = arr[right];
//			arr[right] = temp;
//			
//			left++;
//			right--;
//		}
//		for(int num = 0;num<arr.length;num++) {
//			System.out.print(arr[num] + " ");
//		}
		
		
//		1st one
		
//		int arr [] = {10,20,30,40};
//		int sum = 0;
//		int avg = 0;
//		for(int i = 0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		avg = sum/arr.length;
//		System.out.println(sum);
//		System.out.println(avg);
		
		// 2nd one
		
		int arr [] = {10,20,30,40};
		int sum = 0;
		double avg = 0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
		}
		double avg1 = (double)sum/arr.length;
		System.out.println(sum);
		System.out.println(avg1);
		
		
		
	}
}


