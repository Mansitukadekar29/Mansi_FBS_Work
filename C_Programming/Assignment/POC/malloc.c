#include<stdio.h>
void main(){
	printf("How many elements you want to store:");
	int size;
	scanf("%d",&size);
	int* ptr=(int*)malloc(sizeof(int)*size);
	
	for(int i=0;i<size;i++)
	{
		scanf("%d",&ptr[i]);
	}
	for(int i=0;i<size;i++)
	{
		printf("\n%d",ptr[i]);
	}
	
	
}