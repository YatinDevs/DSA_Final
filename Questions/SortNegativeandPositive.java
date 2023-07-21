package Questions;

public class SortNegativeandPositive {
// Q. SOrting Negative and Positive Maintaining there Relative Position
	public static void SeperateNegativeandPositive(int arr[],int n) {
		  int j=0;
		  int temp;
		  for (int i = 0; i < n; i++) {
			  if(arr[i]<0) {
				  if(i!=j) {
					  temp = arr[i];
					  arr[i] = arr[j];
					  arr[j] = temp;
				  }
				  j++;
			  }
		  }
	}
    

	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[]= {10,-1,3,-4,0,-2,4};
		 
		 SeperateNegativeandPositive(arr, arr.length);
		 printArray(arr);
	}

}
