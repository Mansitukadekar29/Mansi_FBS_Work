package Assignment4;

public class RangePerfect {

	public static void main(String[] args) {
		int num=1,start,sum;
		   System.out.printf("perfect num are\n");
		   for(num=1;num<=1000;num++)
		   {
		    	sum=0;
		    	
		    	for(start=1;start<num;start++)
		    	{
				
		    	if(num%start==0)
		    	{
		    		sum=start+sum;
				}
		    	}		
				if(sum==num)
				{
					System.out.printf("%d\n",num);
				}
	}

}
}
