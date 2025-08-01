#include<stdio.h>
int evenodd();
void main()
{
   int x=evenodd();

if(x==1)
{
    printf("the number is even");
}
else
{
printf("the number is odd");
}
}
 int evenodd()
 {
    int num;
    printf("\nEnter the number:");
    scanf("%d",&num);
    if(num%2==0)
    {
        return 1;
    }
    else
    {
        return 0;
    }
 }

 //output:Enter the number:4
//the number is even
// Enter the number:5
// the number is odd