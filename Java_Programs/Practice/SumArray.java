
class SumArray {

	public static void main(String[] args) {
	
		int[] arr= {10,20,30,40,50};
		int size=arr.length;
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		System.out.println("The sum of array:" +sum);
	}

}
