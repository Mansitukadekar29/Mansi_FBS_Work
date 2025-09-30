
class Even {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5};
		int count=1;
		for(int i=0;i<3;i++) {
			if(arr[i]%2==0) {
				System.out.println("Number is even");
				count++;
			}
		}
		System.out.printf("count is:",+count);
	} 
}
