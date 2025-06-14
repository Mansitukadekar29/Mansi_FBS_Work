#include<stdio.h>
void main()
{
   int num,start,end,sum;
   printf("perfect num are\n");
   for(num=1;num<=1000;num++)
   {
    	sum=0;
    	
    	for(start=1;start<num;start++){
		
    	if(num%start==0)
    	{
    		sum=start+sum;
		}
		}
		if(sum==num)
		{
			printf("%d\n",num);
		}
		
   }
   
}

//output:perfect num are
//6
//28
//496