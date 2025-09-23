package Assignment1;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int r1,r2,r3,q1,res;
//	    printf("Enter the no:");
//	    scanf("%d",&num);
	    r1=num%10;//121
	    q1=num/10;
	    r2=q1%10;
	    r3=q1/10;
	    
	    res=r1*100+r2*10+r3;
	    if(num==res)
	    {
	    	System.out.printf("The no. is palindrome");
	    }
	    else
	    {
	    	System.out.printf("The no. is not palindrome");
	    }
	}

}
