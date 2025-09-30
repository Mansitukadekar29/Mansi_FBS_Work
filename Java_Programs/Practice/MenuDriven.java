package Classwork;

public class MenuDriven {

	public static void main(String[] args) {
		
		int n=7;
		int choice=3;
		do {
		System.out.println("1.Check no. is Eligible or not for votting");
		System.out.println("2.Check no. is even or odd");
		System.out.println("3.Check leap year ");
		
		}while(n==1);
		int age=67;

	    if(age >= 18)
	     {
	    	System.out.printf("\nEligible for votting");
	    
	     }
	     else
	     {
	    	 System.out.printf("\nNot eligible for votting");
	     }


//  }
   //int n=87;
	    
    if(n%2==0)
    {
        System.out.printf("\nThe no is even");
    }
    else
    {
    	System.out.printf("\nThe value is odd");
    }


    int year=2004;
    if(year%4==0 && year%100 !=0 || year%400==0)
    {
    	System.out.printf("\nThe year is leap");
    }
    else
    {
    	System.out.printf("\nThe year is not leap");
    }
    
    int num=121;
	int r1,r2,r3,q1,res;
    r1=num%10;//121
    q1=num/10;
    r2=q1%10;
    r3=q1/10;
    
    res=r1*100+r2*10+r3;
    if(num==res)
    {
    	System.out.printf("\nThe no. is palindrome");
    }
    else
    {
    	System.out.printf("\nThe no. is not palindrome");
    }
}
}

