package Assignment4;

public class RangeStrong {

	public static void main(String[] args) {
		for(int j=1;j<=1000;j++)
		{
			int num=j;
			int rem,fact,sum=0,org=num;
			while(num>0)
			{
				rem=num%10;
				fact=1;
				for(int i=1;i<=rem;i++)
				{
					fact=fact*i;

				}
				sum=sum+fact;
				num=num/10;
			}
			if(sum==org)
			{
				System.out.printf("\n%d",j);

			}

		}
	}

}
