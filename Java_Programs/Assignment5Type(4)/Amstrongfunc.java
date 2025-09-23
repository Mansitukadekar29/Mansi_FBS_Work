package Assignment5Type4;

public class Amstrongfunc {

	public static void main(String[] args) {
		int num=153;
//	    printf("Enter the number:");
//	    scanf("%d",&num); 
	   int x=isarmstrong(num);
	   if(x==1)
	   {
	    System.out.printf("The number is amstrong");
	   }
	   else
	   {
	    System.out.printf("The number is not amstrong");
	   }

	}
	
	public static int isarmstrong(int no)
	{
	    
	    int temp=no;
	    int count=0;
	    while(temp>0)
	    {
	        temp=temp/10;
	        count++;
	    }
	    temp=no;
	    int sum=0;
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
	        if(no==sum)
	         {
	             return 1;
	         }
	         else
	         {
	             return 0;
	         }
	    }
	}



