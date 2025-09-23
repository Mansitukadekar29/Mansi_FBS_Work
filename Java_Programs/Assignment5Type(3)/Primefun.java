package Assignment5Type3;

public class Primefun {

	public static void main(String[] args) {
		int n=13;
//	     printf("Enter the no:");
//	     scanf("%d",&n);
	     isprime(n);
	}

	public static void isprime(int n)
	{
	   int i=2,flag=0;
	     while(i<n)
	     {
	        if(n%i==0)
	        {
	        flag=1;
	        break;
	        }
	     
	       i++;
	     }
	     if(flag==0)
	     {
	       System.out.printf("The number is prime");
	     }
	     else
	     {
	       System.out.printf("The number is not prime");
	     }
	}

}
