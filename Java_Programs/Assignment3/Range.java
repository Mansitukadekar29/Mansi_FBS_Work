package Assignment3;

public class Range {

	public static void main(String[] args) {
		    int start=2, end=45, sum = 0, current;
//		    printf("Enter the start of the range: ");
//		    scanf("%d", &start);
//		    printf("Enter the end of the range: ");
//		    scanf("%d", &end);
		    current = start;
		    while (current <= end) {
		        sum =sum + current;  
		        current++;      
		    }
		    System.out.printf("Sum of numbers from %d to %d is: %d\n", start, end, sum);

	}

}
