package Assignment3;

public class Table {

	public static void main(String[] args) {
		 int n=8,i=1;
//		    printf("Enter the no to print the table:");
//		    scanf("%d",&n);
		    System.out.printf("Multiplication table  of %d\n",n);
		    while(i<=10)
		    {
		        System.out.printf("%d x %d=%d\n",n,i,n*i);
		        i++; 
		    }
	}

}
