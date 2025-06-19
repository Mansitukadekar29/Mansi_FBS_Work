#include<stdio.h>
void isprime(int*,int*,int*);
void main()
{
	int num,start,flag,ch1,ch2;
	printf("prime number upto range:");
	scanf("%d",&num);
	printf("\nEnter the first poisition:");
    scanf("%d",&ch1);
	printf("Enter the second position:");
	scanf("%d",&ch2);
	isprime(&num,&ch1,&ch2);
}
void isprime(int* num,int* p1,int* p2)
{
	int n=(*num),temp= (*p1),temp1= (*p2);
	int count=0,first,sec;

	for(int start=2;start<=n;start++)
	{
		int flag=0;
		for(int i=2;i<start;i++)
		{
			if(start % i==0)
			{
				flag=1;
				break;
			}
		}
	
		if(flag==0)
		{
			printf(" %d",start);
			count++;
			if(count==temp)
			{
				first=start;
				printf("(%d)",first);
			}
			if(count==temp1)
			{
				sec=start;
				printf("(%d)",sec);
			}
		}
	}
		int sum=first + sec;
		printf("\nsum of assign prime no %d",sum);
		
}

//output:prime number upto range:100

// Enter the first poisition:4
// Enter the second position:8
//  2 3 5 7(7) 11 13 17 19(19) 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
// sum of assign prime no 26
