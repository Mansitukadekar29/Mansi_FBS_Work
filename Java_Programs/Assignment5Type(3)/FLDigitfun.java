package Assignment5Type3;

public class FLDigitfun {

	public static void main(String[] args) {
		int num=3456;
//	    printf("Enter a number: ");
//	    scanf("%d", &num);
	    isFLdigit(num);

	}

	public static void isFLdigit(int num)
	  {
	    int fDigit,lDigit,sum;

	    lDigit = num % 10;
	    
	    while (num >= 10)
	    {
	        num=num/ 10;
	    }
	    fDigit = num;
	    sum = fDigit + lDigit;
	    System.out.printf("The first digit is:%d",fDigit);
	    System.out.printf("\nThe last digit is:%d",lDigit);
	    System.out.printf("\nThe sum of the first and last digit is: %d\n", sum);

	}
}
