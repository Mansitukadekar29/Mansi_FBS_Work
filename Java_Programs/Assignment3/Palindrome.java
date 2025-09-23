package Assignment3;

public class Palindrome {

	public static void main(String[] args) {
		int num=121,rev=0,rem,temp;
//	    printf("Enter an integer:");
//	    scanf("%d",&num);
	    temp=num;
	    while(num!=0)
	    {
	    rem=num%10;
	    rev=rev*10+rem;
	    num=num/10;
	}
	if(temp==rev)
	{
	    System.out.printf("%d is a palindrome",temp);

	}
	else
	{
	     System.out.printf(" %d is not a palindrome",temp);
	}
	}

}
