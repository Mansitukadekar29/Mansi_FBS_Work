#include<stdio.h>
#include<math.h>
int main(){
	int num,i=0;
	 int res=1;
	printf("Enter the number:");
	scanf("%d",&num);
	while(res<=num)
	{
		 res= pow(2,i);
		if(res==num){
		printf("%d is power of 2\n",num);
		printf("the power is %d",i);
		return i;
	}
    i++;

}
printf("%d is not power of 2",num);
return 0;
}

//output:Enter the number:64
// 64 is power of 2
// the power is 6