
#include<stdio.h>
int SumOf(int*,int*,int*,int); 
void main() 
{
    int size;
    printf("Enter the size:");
    scanf("%d",&size);
    int arr[size]; 
    printf("Enter first array:\n");
    for(int i=0;i<size;i++) 
    {
        scanf("%d", &arr[i]);
    }
    int brr[size];
    printf("Enter second array:\n");
    for(int i=0;i<size;i++) 
    {
        scanf("%d", &brr[i]);
    }
  
    int crr[size];
    int totalSum=SumOf(arr,brr,crr,size); 
    printf("sum array:");
    for(int i=0;i<size;i++) 
    {
        printf("%d ",crr[i]);
    }

    printf("\ntotal sum=%d\n",totalSum);
}

int SumOf(int* a,int* b,int* c,int size) 
{
    int total=0;
    for(int i=0;i<size;i++)
    {
        c[i]=a[i]+b[i];
        total=total+c[i];  
    }
    return total;
}

//output:Enter the size:4
// Enter first array:
// 1 2 34 5
// Enter second array:
// 9 8 7 6
// sum array:10 10 41 11 
// total sum=72
