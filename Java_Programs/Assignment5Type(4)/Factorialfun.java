package Assignment5Type4;

public class Factorialfun {

	public static void main(String[] args) {
		int num=3;
//	    printf("Enter the value of no.:");
//	    scanf("%d",&num);
	   int x= isfact(num);
	   System.out.printf("The factorial of no is:%d",x);

	}
	
	public static int isfact(int num)
	{
	    int fact=1;
	    int temp=num;
	    while(num>0)
	    {
	        fact=fact*num;
	        num--;

	    }
	    
	    return fact ;
	}

}
