package Assignment5Type4;

public class Palindromefun {

	public static void main(String[] args) {
		int num=121;
//	    printf("Enter an integer:");
//	    scanf("%d",&num);
	    int x=isPalindrome(num);
	if(x==1)
	{
	    System.out.printf("The number is palindrome");

	}
	else
	{
	     System.out.printf("The number is not a palindrome");
	}

	}
	
	public static int isPalindrome(int no)
	{
	    
	    int rev=0,rem,temp;
	     temp=no;
	     while(no!=0)
	     {
	     rem=no%10;
	     rev=rev*10+rem;
	     no=no/10;
	     }

	     if(temp==rev)
	     {
	        return 1;
	     }
	     else
	     {
	        return 0;
	     }
	    
	}

}
