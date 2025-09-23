package Assignment5Type4;

public class Primefun {

	public static void main(String[] args) {
		int n=17;
//	     printf("Enter the no:");
//	     scanf("%d",&n);
	     int x=isprime(n);
	     if(x==1)
	     {
	      System.out.printf("The number is prime");
	     }
	     else
	     {
	      System.out.printf("The number is not prime");
	     }

	}

	public static int isprime(int n)
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
	        return 1;
	     }
	     else
	     {
	        return 0;
	     }
	}

}
