#include<stdio.h>
#include<math.h>>
void main(){
	int num,i;
	printf("enter the number:\n");
	scanf("%d",&num);
	if(pow(5,i)){
		printf("yes,number is power of 5\n");
	}
	else{
		printf("no,number is not power of 5\n");
	}
	int res=1;
	while(res<=num)
	{
		 res= pow(5,i);
		if(res==num)
		printf("the power is%d:",i);
		i++;
	}
	
}