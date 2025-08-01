#include<stdio.h>
#include<math.h>>
void main(){
	int num,i;
	printf("enter the number:\n");
	scanf("%d",&num);
	if(pow(2,i)){
		printf("yes,number is power of 2\n");
	}
	else{
		printf("no,number is not power of 2\n");
	}
	int res=1;
	while(res<=num)
	{
		 res= pow(2,i);
		if(res==num)
		printf("the power is%d:",i);
		i++;
	}
	
}