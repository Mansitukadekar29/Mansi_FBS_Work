#include<stdio.h>
void main()
{
  int num,size;
  printf("Enter the size of an array:");
  scanf("%d",&size);

  int arr[size];
  printf("Enter the numbers:");
   for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
  int brr[size];
  printf("Enter the numbers:");
   for(int i=0;i<size;i++)
    {
        scanf("%d",&brr[i]);
    }
   int crr[size];
    for(int i=0;i<size;i++)
    {
        crr[i]=arr[i]+brr[i];
        printf("%d ",crr[i]);
    }

}

//output:Enter the size of an array:4    
// Enter the numbers:1 2 3 4
// Enter the numbers:5 6 7 8
// 6 8 10 12 
   