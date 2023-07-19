package SortingAlgo;

public class MergeSort {

	  
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
	   public static void merge(int arr[],int temp[],int low,int mid,int high) {
		   
		   for(int i=low;i<=high;i++){
	            temp[i]=arr[i];

	        }
		   
		   int i=low;
		   int j=mid+1;
		   int k=low;
		   while(i<=mid && j<=high){
	            if(temp[i]<=temp[j]){
	                arr[k]=temp[i];
	                i++;
	            }else{
	                arr[k]=temp[j];
	                j++;
	            }
	            k++;
	        }
	        while(i<=mid){
	            arr[k]=temp[i];
	            k++;
	            i++;
	        }
	   }
		public static void mergeSort(int arr[],int temp[],int low,int high) {
			if(low<high) {
				int mid= low + (high - low )/2;
                mergeSort(arr, temp, low, mid);
                mergeSort(arr, temp, mid+1, high);
                merge(arr, temp, low, mid, high);
			
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			  int arr[]= {20,2,16,5,11,9};
		   		System.out.println("Before Sorting : ");
		           printArray(arr);
		           
		           mergeSort(arr,new int[arr.length],0,arr.length-1);
		           
		   		System.out.println("After Sorting : ");
		          printArray(arr);
		}

	}
