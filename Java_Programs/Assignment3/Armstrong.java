package Assignment3;

public class Armstrong {

	public static void main(String[] args) {
		int num=153;
//	    printf("Enter the number:");
//	    scanf("%d",&num);
	    int temp=num;
	    int count=0;
	    while(temp>0)
	    {
	        temp=temp/10;
	        count++;
	    }
	    temp=num;
	    int sum=0;
	    while(temp>0)
	    {
//	        int rem=temp%10;
//	        int pow=1;
	        while(temp>0)
	        {
	            int rem=temp%10;
	            int pow=1;
	            for(int i=1;i<=count;i++)
	            {
	                pow=pow*rem;
	            }
	            sum=sum+pow;
	            temp=temp/10;
	        }
	        if(num==sum)
	        {
	            System.out.printf(" It is a Armstrong number");
	        }
	        else
	        {
	            System.out.printf("It is not Armstrong no");
	        }
	    }

	}

}
