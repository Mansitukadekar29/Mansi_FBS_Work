#include<stdio.h>
void main(){
	int amount;
	int n1=2000,n2=500,n3=200,n4=100,n5=50,n6=20,n7=10,n8=5,r1=2,r2=1;//n-notes & r-coin
	printf("Enter the amount:");
	scanf("%d",&amount);
	printf("Notes Distribution:");
	
	n1=amount/2000;
	amount=amount%2000;
	printf("\n2000 = %d\n",n1);
	
	n2=amount/500;
	amount=amount%500;
	printf("500 = %d\n",n2);
	
	n3=amount/200;
	amount=amount%200;
	printf("200 = %d\n",n3);
	
	n4=amount/100;
	amount=amount%100;
	printf("100 = %d\n",n4);
	
	n5=amount/50;
	amount=amount%50;
	printf("50 = %d\n",n5);
	
	n6=amount/20;
	amount=amount%20;
	printf("20 = %d\n",n6);
	
	n7=amount/10;
	amount=amount%10;
	printf("10 = %d\n",n7);
	
	n8=amount/5;
	amount=amount%5;
	printf("5 = %d\n",n8);
	
	r1=amount/2;
	amount=amount%2;
	printf("2 = %d\n",r1);
	
	//1r=amount/1;
	//amount=amount%1;
	r2=amount;
	printf("1 = %d\n",r2);
	
}

//output:Enter the amount:5674
//Notes Distribution:
//2000 = 2
//500 = 3
//200 = 0
//100 = 1
//50 = 1
//10 = 0
//20 = 1
//5 = 0
//2 = 2
//1 = 0