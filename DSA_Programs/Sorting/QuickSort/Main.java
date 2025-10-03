package QuickSort;

public class Main {
	
	int[] arr= {36,52,1,3,49,15,2,10,43};

	public static void main(String [] args) 
	{
		Main app=new Main();
		app.quick(app.arr);
		app.print();
		
	}
	
     private void print() {
		// TODO Auto-generated method stub
    	 for(int i=0;i<arr.length;i++)
 		{
 			System.out.println( arr[i]);
 		}
	}
     
		public void quick(int[] arr)
		{
			sort(arr,0,arr.length-1);
		}
		
		public void sort(int[] arr,int low,int high) {
			if(low<high)
			{
				int divisionPos=divide(arr,low,high);
				sort(arr,low,divisionPos-1);
				sort(arr,divisionPos+1,high);
				
			}
		}
		
		public int divide(int[] arr,int low,int high)
		{
			int pivot=arr[high];
			int first=low-1;
		
		
		
		
		for(int second=low;second<high;second++)
		{
			if(arr[second] <=pivot)
			{
				first++;
				
				int temp=arr[first];
				arr[first]=arr[second];
				arr[second]=temp;
			}
		}
		
		int temp=arr[first+1];
		arr[first+1]=arr[high];
		arr[high]=temp;
		
		return first + 1;
		
		
	}

}
