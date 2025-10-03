package Heapsort;

public class HeapSort {
	
	int numbers[] = {76,34,2,67,90,12,21};
	
	public static void main(String[] args) {
		HeapSort app = new HeapSort();
		app.sort(app.numbers);
		app.print();
	}
	
	public void sort(int[] arr) 
	{
		int length = arr.length;
		
		for(int i = length / 2 - 1;i >= 0;i--) {
			heapify(arr,length,i);
		}
			
			for(int i=length - 1; i > 0;i--)
			{
		
		         int temp = arr[0];
		         arr[0] = arr[i];
		         arr[i] = temp;
		
		         heapify(arr,i,0);
		
		}	
	}

	public void heapify(int[] arr, int length, int start) {
		int largest = start;
		
		int left = 2*start + 1;
		int right = 2 * start + 2;
		
		if(left < length && arr[left] > arr[largest]) {
			largest = left;
		}
		
		if(right < length && arr[right] > arr[largest]) {
			largest = right;
		}
		
		if(largest != start) {
			int temp = arr[start];
			arr[start] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr,length,largest);
		}
		
		
	}

	public void print()
	{
		for(int i=0; i<numbers.length;i++)
		{
			System.out.println(numbers[i] + " ");
		}
		System.out.println();
	}

	

}
