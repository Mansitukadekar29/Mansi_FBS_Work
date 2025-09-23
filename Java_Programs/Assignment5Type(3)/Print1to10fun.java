package Assignment5Type3;

public class Print1to10fun {

	public static void main(String[] args) {
		int i=1;
//	    printf("\nEnter the no:") ;
//	    scanf("%d",&i);
	    isprint(i);

	}

	public static void isprint(int i)
	{
	    while(i<=10)
	    {
	       System.out.printf("\n %d",i);
	    
	    i++;
	    }
	}
}
