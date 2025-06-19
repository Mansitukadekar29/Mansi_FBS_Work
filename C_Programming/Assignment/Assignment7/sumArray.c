#include<stdio.h>
void main()
{
    int size;
    printf("Enter the size:");
    scanf("%d",&size);
    int arr[size];
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
      int sum=0;
    for(int i=0;i<size;i++)
    {
       
        sum=sum+arr[i];
       
    }
     printf("The sum of array is:%d",sum);
}

//output:Enter the size:4
// 1 2 3 4
// The sum of array is:10
    