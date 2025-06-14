#include<stdio.h>
void main()
{
	int n,i,a=0,b=1,c;
	printf("Enter the number :");
	scanf("%d",&n);
	printf("\nFibonacci series:");
	
	for(i=0;i<=n;i++)
	{
	
	printf("\n%d",a);
	c=a+b;
	a=b;
	b=c;
	
   }
   printf("\n");
	
}


//output:Enter the number :6

//Fibonacci series:
//0
//1
//1
//2
//3
//5
//8