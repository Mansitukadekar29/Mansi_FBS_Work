package Assignment4;

public class RangeArmstrong {

	public static void main(String[] args) {
		for(int start=1;start<=1000;start++)
	    {
	       int num=start;
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
	            System.out.printf("%d\n",start);
	        }
	    }
	}

}
