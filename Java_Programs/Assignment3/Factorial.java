package Assignment3;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int fact=1;
//	    printf("Enter the value of no.:");
//	    scanf("%d",&num);
	    int temp=num;
	    while(num==0)
	    {
	        fact=fact*num;
	        num--;

	    }
	    System.out.printf("\nfactorial of no:%d is %d",temp,fact);

	}

}
