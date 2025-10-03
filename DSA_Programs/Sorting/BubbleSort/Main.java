package BubbleSort;

public class Main {

	public static void main(String[] args) {
		int []arr = {37,64,10,98,25};
		int size=arr.length;
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1-i;j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
