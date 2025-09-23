package Assignment5Type4;

public class FLDigitfun {

	public static void main(String[] args) {
		int num=1234;
//		   printf("Enter a number: ");
//		   scanf("%d", &num);
		  int x=digits(num);
		  System.out.printf("sum of fdigit & ldigit :%d",x);
	}

	public static int digits(int num)
	{
		
	int temp, fDigit, lDigit;
	    temp = num;
	    lDigit = temp % 10;

	    while (temp > 10)
	     {
	        temp = temp / 10;
	    }
	    fDigit = temp;

	    int sum = fDigit + lDigit;
	    return sum;
	}
}
