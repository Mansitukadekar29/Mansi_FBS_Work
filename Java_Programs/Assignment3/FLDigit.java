package Assignment3;

public class FLDigit {

	public static void main(String[] args) {
		int num=2345;
		int fDigit,lDigit,sum;
//	    printf("Enter a number: ");
//	    scanf("%d", &num);

	    lDigit = num % 10;
	    
	    while (num >= 10)
	    {
	        num=num/ 10;
	    }
	    fDigit = num;
	    sum = fDigit + lDigit;
	    System.out.printf("\nThe first digit is:%d",fDigit);
	    System.out.printf("\nThe last digit is:%d",lDigit);
	    System.out.printf("\nThe sum of the first and last digit is: %d\n", sum);


	}

}
