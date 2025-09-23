package Assignment2;

public class PersonAge {

	public static void main(String[] args) {
		int age=12;
//	     printf("Enter the age:");
//	     scanf("%d",&age);
	     if(age<12)
	     {
	    	 System.out.printf("\nChild");
	    
	     }
	     else if(age >= 12 && age <=19 )
	     {
	    	 System.out.printf("Teenager");
	     }
	     else if(age >=20 && age <=59)
	     {
	    	 System.out.printf("Adult");
	     }
	     else if(age >= 60)
	     {
	    	 System.out.printf("senior");
	     }
	     else
	     {
	    	 System.out.printf("Invalid value");
	     }

	}

}
