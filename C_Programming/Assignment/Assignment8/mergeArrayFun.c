#include<stdio.h>
void merge(int* ,int* ,int );
void main()
{
    int size;
    int arr[size],brr[size],crr[size];
    int n1,n2,n=0;
    printf("Enter the number of elements in first array:");
    scanf("%d",&n1);

    printf("Enter %d elements:",n1);

     for(int i=0;i<n1;i++)
    {
        scanf("%d",&arr[i]);
         crr[n++]=arr[i];
    }
    //int brr[size];
    printf("Enter the number of elements in second array:");
    scanf("%d",&n2);

    printf("Enter %d elements:",n2);
    for(int i=0;i<n2;i++)
    {
        scanf("%d",&brr[i]);
         crr[n++]=brr[i];
         
    }
    merge(arr,brr,crr);
}
void merge(int* n1,int* n2,int crr)
{
    int crr[size];
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
