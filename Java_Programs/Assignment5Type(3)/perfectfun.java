package Assignment5Type3;

public class perfectfun {

	public static void main(String[] args) {
		int n=28;
//	    printf("\n Enter the value:");
//	    scanf("%d",&n);
	    isperfect(n);

	}

	public static void isperfect(int n)
	{
	  int sum=0;
	    int i=1;
	    while(i<=n/2)
	    {
	        if(n%i==0)
	        {
	            sum=sum+i;
	            
	        }
	      i++;
	    }
	    if(sum==n)
	    {
	     System.out.printf("The number is perfect");
	    }
	    
	  
	      else
	      {
	       System.out.printf("The number is not perfect");
	      }

	    }

}
