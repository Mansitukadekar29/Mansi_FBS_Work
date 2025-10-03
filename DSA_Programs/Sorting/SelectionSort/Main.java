package SelectionSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {37,64,10,98,25};
		int size=arr.length;
		
		for(int i=0;i<size;i++) {
			int min=i;
			for(int j=i+1;j<size;j++)
			{                           
			   if(arr[j]<arr[min]) {  //find min value
				   min=j;
			   }
			}
			//swap the value 
			 int temp=arr[i];
			 arr[i]=arr[min];
			 arr[min]=temp;
		}
          System.out.println("The sorted array is:");
          for(int i=0;i<size;i++) {
        	  System.out.println(arr[i]);
          }
	}

}
