package Assignment5Type4;

public class Arearectperifun {

	public static void main(String[] args) {
		float l=4,b=5;
//		   printf("enter length,breadth:");
//		   scanf("%f%f",&l,&b);
		   float x=areaofrect(l,b);
		   System.out.printf("area is %f",x);
		   float y=periofrect(l,b);
		   System.out.printf("\nperi is %f",y);

	}

	
	public static float areaofrect(float l,float b)
	{
	   float area=l*b;

	   return area;
	}


	public static float periofrect(float l,float b)
	{
	    float peri=2*(l+b);
	   
	return peri;
	}
}
