package Assignment5Type3;

public class Swapfun {

	public static void main(String[] args) {
		int n1=5,n2=7;//temp;
//	    printf("Enter the value of n1:");
//	    scanf("%d",&n1);
//	    printf("Enter the value of n2:");
//	    scanf("%d",&n2);
	    swap(n1,n2);

	}

	public static void swap(int n1,int n2)
	{
	   int temp=n1;
	    n1=n2;
	    n2=temp;
	   System.out.printf("After swapping n1=%d and n2=%d",n1,n2);
	}
}
