#include<stdio.h>
void main()
{
	int arr[]={1,2,3,4,5,6,7,8,9,10};
	int size=sizeof(arr)/sizeof(arr[0]);
	int sum=0;
	printf("enter the even no in array");
	for(int i=0;i<size;i++)
	{
		if(arr[i]%2==0)
		{
			printf("%d",arr[i]);
			sum=sum+arr[i];
		}
		printf("\n");
	}
	printf("\nsum of even no is %d",sum);
}