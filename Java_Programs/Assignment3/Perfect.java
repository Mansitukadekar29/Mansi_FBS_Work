package Assignment3;

public class Perfect {

	public static void main(String[] args) {
		int n=28,sum=0;
//	    int n,sum=0;
//	    printf("\n Enter the value:");
//	    scanf("%d",&n);
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
	      System.out.printf("The no is perfect");
	    }
	    
	  
	      else
	      {
	        System.out.printf("The no is not perfect");
	      }

	}

}
