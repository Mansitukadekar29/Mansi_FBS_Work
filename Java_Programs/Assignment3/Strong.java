package Assignment3;

public class Strong {

	public static void main(String[] args) {
		int num=145;
		  int rem,fact,sum=0,i;
//		  printf("Enter the no:");
//		  scanf("%d",&num);
		   int temp=num;
		  while(num>0)
		  {
		    rem = num % 10;
		    fact=1;
		    i=1;
		    while(i<=rem)
		    {
		    fact=fact*i;
		    i++;
		    }
		    sum=sum+fact;
		    num=num/10;
		    
		  }
		  if(temp == sum)
		  System.out.printf("It is a Strong Number",num);
		  else
		  System.out.printf("It is not Strong number",num);
	}

}
