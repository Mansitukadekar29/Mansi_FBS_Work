#include<stdio.h>
void main()
{
    int arr[10],n;
    printf("Enter the elements in array:");
    scanf("%d",&n);

    printf("Enter elements:");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Reverse array is:");
    for(int i=n-1;i>=0;i--)
    {
        printf("%d ",arr[i]);
    }
}

//output:Enter the elements in array:4
// Enter elements:1 2 3 5
// Reverse array is:5 3 2 1 