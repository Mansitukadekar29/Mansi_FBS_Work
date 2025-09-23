package Assignment5Type3;

public class Areaofrectperifun {

	public static void main(String[] args) {
		float l=3,b=4;
//		   printf("enter length,breadth:");
//		   scanf("%f%f",&l,&b);

		   areaofrect(l,b);
		   periofrect(l,b);

	}

	public static void areaofrect(float l,float b)
	{
	   float area=l*b;

	   System.out.printf("area of rectangle %f:",area);
	}

	public static void periofrect(float l,float b)
	{
	    float peri=2*(l+b);

	   System.out. printf("\nperimeter of rectangle %f:",peri);
	}

	
}
