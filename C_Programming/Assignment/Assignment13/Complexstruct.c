#include<stdio.h>
typedef struct Complex
{
    int real;
    int imaginary;
   
}Complex;
void main()
{
Complex arr[1];
int i=0;
   printf("Enter the real:");
   scanf("%d",&arr[i].real);

  printf("Enter the imaginary:");
  scanf("%d",&arr[i].imaginary); 

  printf("Complex deatails as follows:");
  printf("\n%d +",arr[i].real);
  printf(" %di",arr[i].imaginary);
  
 
  
}


//output:Enter the real:2
//Enter the imaginary:4
//Complex deatails as follows:
//2 + 4i