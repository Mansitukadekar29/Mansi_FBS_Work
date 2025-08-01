#include<stdio.h>
void main()
{
  int num,size;
  printf("Enter the size of an array:");
  scanf("%d",&size);

  //int arr[size];
  int* arr=(int*)malloc(sizeof(int)*size);
  printf("Enter the numbers:");
   for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
  //int brr[size];
  int* brr=(int*)malloc(sizeof(int)*size);
  printf("Enter the numbers:");
   for(int i=0;i<size;i++)
    {
        scanf("%d",&brr[i]);
    }
   //int crr[size];
   int* crr=(int*)malloc(sizeof(int)*size);
    for(int i=0;i<size;i++)
    {
        crr[i]=arr[i]+brr[i];
        printf("%d ",crr[i]);
    }

}

//output:Enter the size of an array:5
//Enter the numbers:2 3 4 5 6
//Enter the numbers:9 8 7 6 5
//11 11 11 11 11

