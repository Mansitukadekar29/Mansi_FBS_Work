package InsertionSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {89,77,54,9,23};
//		int []arr= {37,64,10,98,25};
//		int size=arr.length;
//		
//		for(int i=1;i<size;i++)
//		{
//			for(int j=i-1;j>=0;j--)
//			{
//				if(arr[j+1] < arr[j])   //here values are swap not shift
//				{
//					int temp=arr[j+1];   //for insertion shift is mandatory not swap
//					arr[j+1]=arr[j];
//					arr[j]=temp; 
//							
//				}
//		   }
//
//	   }
//		
//		System.out.println("The insertion sorted array is:");
//        for(int i=0;i<size;i++) {
//      	  System.out.println(arr[i]);
//        }

//------------------------------------------------------------------------------------------------		
		//shifting the value
		
		int[] arr = {76,45,2,1,87,4,7};
		int size=arr.length;
		
		for (int i=1;i<size;i++)
		{
			int compareValue = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>compareValue)
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=compareValue;
		}
		System.out.println("The insertion sorted array is:");
         for(int i=0;i<size;i++) {
    	  System.out.println(arr[i]);
      }
	}
}
