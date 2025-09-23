package Assignment5Type4;

public class Strongfun {

	public static void main(String[] args) {
		int no=145;
//	    printf("Enter the no:");
//	    scanf("%d",&no);
	    int res=isStrong(no);
	    if(res==1)
	    {
	        System.out.printf("the number is strong");
	    }
	    else
	    {
	        System.out.printf("the number is not strong");
	    }

	}
	
	public static int isStrong(int n)
	{
	    int temp=n,rem,sum=0;
	    while(n>0)
	    {
	        rem=n%10;
	        sum=sum + fact(rem);
	        n=n/10;
	        // printf("%d",sum);
	        
	    }
	    if(temp==sum)
	    	return 1;
	    else
	    	return 0;
	    //return (temp==sum);
	}
	public static int fact(int no)
	{
	    int fact=1;
	    for(int i=1;i<=no;i++)
	    fact=fact*i;
	    return fact;
	}
}
