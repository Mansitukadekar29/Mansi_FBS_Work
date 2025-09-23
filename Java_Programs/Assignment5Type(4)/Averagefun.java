package Assignment5Type4;

public class Averagefun {

	public static void main(String[] args) {
		int n1=40,n2=50,n3=60,n4=70,n5=80;
//	    printf("enter five number:\n");
//	    scanf("%d %d %d %d %d",&n1,&n2,&n3,&n4,&n5);
	     avg(n1,n2,n3,n4,n5);
	}

	public static float avg(int n1,int n2,int n3,int n4,int n5)
	{
	 float sum=0,avg;

	     sum=n1+n2+n3+n4+n5;
	     avg=sum/5;
	    System.out.printf("the avg of five numbers %f",avg);
	    return avg;
	 }
}
