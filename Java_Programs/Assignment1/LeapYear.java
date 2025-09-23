package Assignment1;

public class LeapYear {

	public static void main(String[] args) {
		int year=2004;
	    //System.out.printf("Enter the year:");
	    //scanf("%d",&year);
	    if(year%4==0 && year%100 !=0 || year%400==0)
	    {
	    	System.out.printf("The year is leap");
	    }
	    else
	    {
	    	System.out.printf("The year is not leap");
	    }
	}

}
