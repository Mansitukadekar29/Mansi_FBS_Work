#include<stdio.h>
void main()
{
    int arr[10],brr[5],crr[20];
       printf("Enter the first array:");

     for(int i=0;i<10;i++)
    {
        scanf("%d",&arr[i]);
        crr[i]=arr[i];
    }
    printf("Enter the second array:");
    for(int i=0;i<15;i++)
    {
        scanf("%d",&brr[i]);
        crr[i+10]=brr[i];

    }
    printf("Merge of two array is:");
    for(int i=0;i<5;i++)
    {
        printf("%d ",crr[i]);
    
    }
}
