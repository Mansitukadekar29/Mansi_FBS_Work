package Assignment2;

public class Divisible {

	public static void main(String[] args) {
		int num=6;
//	    printf("Enter the no:");
//	    scanf("%d",&num);
	    if(num%3==0 && num%5==0)
	    {
	    System.out.printf("\nDivisible by both");
	    }
	    else if(num%3==0)
	    {
	    	System.out.printf("\nDivisible by 3 but not by 5");
	    }
	    else if(num%5==0)
	    {
	    	System.out.printf("\nDivisible by 5 but not by 3");
	    }
	    else
	    {
	    	System.out.printf("\nDivisible by none");
	    }



	}

}
