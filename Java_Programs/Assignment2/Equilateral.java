package Assignment2;

public class Equilateral {

	public static void main(String[] args) {
		int s1=23,s2=23,s3=45;
//	    printf("Enter the side:");
//	    scanf("%d %d %d" ,&s1,&s2,&s3);
	    if(s1==s2 && s2==s3)
	    {
	        System.out.printf("Equilateral triangle");
	    }
	    else if(s1==s2 || s2==s3 || s1==s3)
	    {
	    	System.out.printf("Isoscales triangle");
	    }
	    else{
	    	System.out.printf("scalene triangle");
	    }

	}

}
