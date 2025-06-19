#include<stdio.h>
void main()
{
    int arr[10],brr[10],crr[50];
    int n1,n2,n=0;
    printf("Enter the number of elements in first array:");
    scanf("%d",&n1);

    printf("Enter %d elements:",n1);

     for(int i=0;i<n1;i++)
    {
        scanf("%d",&arr[i]);
         crr[n++]=arr[i];
    }
    printf("Enter the number of elements in second array:");
    scanf("%d",&n2);

    printf("Enter %d elements:",n2);
    for(int i=0;i<n2;i++)
    {
        scanf("%d",&brr[i]);
         crr[n++]=brr[i];
         
    }
    printf("Merge of two array is:");
    for(int i=0;i<n1+n2;i++)
    {
        printf("%d ",crr[i]);
    
    }
}

//output:Enter the number of elements in first array:3
// Enter 3 elements:1 2 4
// Enter the number of elements in second array:4
// Enter 4 elements:6 7 8 9
// Merge of two array is:1 2 4 6 7 8 9  
