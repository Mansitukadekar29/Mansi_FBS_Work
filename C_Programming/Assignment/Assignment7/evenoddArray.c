#include<stdio.h>
void main()
{
    int size;
    printf("Enter element of array:");
    scanf("%d",&size);
    int arr[size];
    for(int i=0;i<size;i++)
    {
     scanf("%d",&arr[i]);

    }
    printf("Even number:");
    int c=1;
    for(int i=0;i<size;i++)
    {
        if(arr[i]%2==0)
        {
            c=arr[i];
            printf("%d ",c);
        }
    }
    printf("\nOdd number are:");
    for(int j=0;j<size;j++)
    {
        if(arr[j]%2!=0)
        {
            c=arr[j];
            printf("%d ",c);
        }
    }
    
}

//output:Enter element of array:4
// 1 2 3 4
// Even number:2 4 
// Odd number are:1 3 
