package Assignment5Type3;

public class Factorialfun {

	public static void main(String[] args) {
		 int num=5;
//		    printf("Enter the value of no.:");
//		    scanf("%d",&num);
		    isfact(num);

	}

	public static void isfact(int num)
	{
	    int fact=1;
	    int temp=num;
	    while(num>0)
	    {
	        fact=fact*num;
	        num--;

	    }
	    
	   System.out.printf("The factorial of %d is %d",temp,fact);
	}
}
