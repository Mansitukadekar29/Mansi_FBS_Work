#include<stdio.h>
void isprime(int*n);
void main()
{
     int n;
     printf("Enter the no:");
     scanf("%d",&n);
     isprime(&n);
}
void isprime(int* n)
{
   int i=2,flag=0;
     while(i<(*n))
     {
        if((*n)%i==0)
        {
        flag=1;
        break;
        }
     
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

//output:Enter the no:13
// The number is prime
// Enter the no:15
// The number is not prime

