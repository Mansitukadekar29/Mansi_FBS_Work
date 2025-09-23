package Assignment4;

public class RangePrime {

	public static void main(String[] args) {
		int num,start,count=0;
		System.out.printf("prime number between 1 to 100 are:\n");
		
		for(num=2;num<=100;num++)
		{
			count=0;
			
			for(start=1;start<=num;start++)
			{
				if(num%start==0)
				{
					count++;
				}
			}
			if(count==2)
			{
			System.out.	printf("%d\n",num);
			}
		}

	}

}
