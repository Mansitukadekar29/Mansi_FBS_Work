package Assignment1;

public class Salary {

	public static void main(String[] args) {
		double basic=7000;
		double tot_sal,da,ta,hra;
//	    printf("Enter the salary:");
//	    scanf("%f",&basic);

	    if(basic<=5000)
	    {
	    da=(basic * 10) /100.0;
	    ta=(basic * 20) /100.0;
	    hra=(basic * 25) /100.0;
	    tot_sal=basic+da+ta+hra;
	    System.out.printf("your total salary is %2f",tot_sal);
	    }
	    else
	    {
	        da=(basic * 15) /100.0;
	        ta=(basic * 25) /100.0;
	        hra=(basic * 30) /100.0;
	        tot_sal=basic+da+ta+hra;
	        System.out.printf("your total salary is %2f",tot_sal);
	    }
	}

}
