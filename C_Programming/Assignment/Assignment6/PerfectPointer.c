#include<stdio.h>
void isperfect(int* n);
void main()
{
    int n;
    printf("\n Enter the value:");
    scanf("%d",&n);
    isperfect(&n);
}
void isperfect(int* n)
{
  int sum=0;
    int i=1;
    while(i<=(*n)/2)
    {
        if((*n)%i==0)
        {
            sum=sum+i;
            
        }
      i++;
    }
    if(sum==(*n))
    {
      printf("The number is perfect");
    }
    
  
      else
      {
        printf("The number is not perfect");
      }

    }

//output:Enter the value:28
//The number is perfect

    

