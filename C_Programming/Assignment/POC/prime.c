#include<stdio.h>
void main()
{
     //int n=13,i=2,count=0,flag=0;
     int n,i=2,flag=0;
     printf("Enter the no:");
     scanf("%d",&n);
   
     while(i<n)
     {
        if(n%i==0){
        flag=1;
        break;}
     
     i++;
     }
     if(flag==0)
     {
        printf("The number is prime");
     }
     else
     {
        printf("The number is not prime");
     }
}