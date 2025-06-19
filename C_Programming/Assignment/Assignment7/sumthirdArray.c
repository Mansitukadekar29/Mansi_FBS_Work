#include<stdio.h>
void main()
{
    int arr[5],brr[5],crr[5];
    printf("Enter the first array:");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the second array:");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&brr[i]);
    }
    printf("sum in third array:");
    for(int i=0;i<5;i++)
    {
        crr[i]=arr[i]+brr[i];
        printf("%d ",crr[i]);
    }
}

//output:Enter the first array:1 2 3 4 5
// Enter the second array:9 7 6 5 4
// sum in third array:10 9 9 9 9
