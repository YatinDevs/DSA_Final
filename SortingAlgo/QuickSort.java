package SortingAlgo;

public class QuickSort {
    
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

	
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static int partition(int arr[],int low,int high) {
		int mid= low + (high - low )/2;

		int pivot=arr[high];
		int i=low;
		int j=low;
		// i --------> high   ======> to be iterated
		// comparing arr[i] with pivot if greater
		//low to j-1 --> less than or equal to pivot 
		// j to i-1  ---> greater than or equal to pivot
        
		while(i<=high) {
		   if(arr[i]<=pivot) {
			   swap(arr, i, j);
			   j++;
		   }
		   i++;
		}
        return j-1;
	}
	
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
		int p=partition(arr,low,high);
		quickSort(arr, low, p-1);
		quickSort(arr, p+1, high);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[]= {20,2,17,5,11,9};
	   		System.out.println("Before Sorting : ");
	           printArray(arr);
	           
	           quickSort(arr,0,arr.length-1);
	           
	   		System.out.println("After Sorting : ");
	          printArray(arr);
	}

}
