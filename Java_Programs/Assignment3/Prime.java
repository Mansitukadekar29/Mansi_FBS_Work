package Assignment3;

public class Prime {

	public static void main(String[] args) {
		int n=13,i=2,flag=0;
//	     int n,i=2,flag=0;
//	     printf("Enter the no:");
//	     scanf("%d",&n);	   
	     while(i<n)
	     {
	        if(n%i==0){
	        flag=1;
	        break;}
	     
	     i++;
	     }
	     if(flag==0)
	     {
	        System.out.printf("The number is prime");
	     }
	     else
	     {
	        System.out.printf("The number is not prime");
	     }
	}

}
