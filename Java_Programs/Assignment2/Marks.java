package Assignment2;

public class Marks {

	public static void main(String[] args) {
		int marks=98;
//	    printf("Enter the marks:");
//	    scanf("%d",&marks);
	    if(marks>75)
	    {
	        System.out.printf("Distinction pass");
	    }
	    else if(marks>65)
	    {
	    	System.out.printf("First Class pass");
	    }
	    else if(marks>55)
	    {
	    	System.out.printf("Second class pass");
	    }
	    else if(marks>40)
	    {
	    	System.out.printf("Pass class");
	    }
	    else if(marks<40)
	    {
	    	System.out.printf("fail");
	    }
	    else
	    {
	    	System.out.printf("Enter the valid  marks");
	    }

	}

}
