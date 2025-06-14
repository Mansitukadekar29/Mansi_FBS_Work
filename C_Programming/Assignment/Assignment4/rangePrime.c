#include<stdio.h>
void main()
{
	int num,start,count=0;
	printf("prime number between 1 to 100 are:\n");
	
	for(num=2;num<=100;num++)
	{
		count=0;
		
		for(start=1;start<=num;start++)
		{
			if(num%start==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			printf("%d\n",num);
		}
	}
}


//output:prime number between 1 to 100 are:
//2
//3
//5
//7
//11
//13
//17
//19
//23
//29
//31
//37
//41
//43
//47
//53
//59
//61
//67
//71
//73
//79
//83
//89
//97
