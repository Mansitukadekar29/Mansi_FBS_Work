#include<stdio.h>
void isStrong(int num);
void main()
{
  int num;
  printf("Enter the no:");
  scanf("%d",&num);
  isStrong(num);
}
void isStrong(int num)
{
  int rem,fact,sum=0,i;
   int temp=num;
  while(num>0)
  {
    rem = num % 10;
    fact=1,i=1;
    while(i<=rem)
    {
    fact=fact*i;
    i++;
    }
    sum=sum+fact;
    num=num/10;
    
  }
  if(temp == sum)
  printf("It is a Strong Number",num);
  else
  printf("It is not Strong number",num);
}

//output:Enter the no:145
//It is a Strong Number
// Enter the no:134
// It is not Strong number

