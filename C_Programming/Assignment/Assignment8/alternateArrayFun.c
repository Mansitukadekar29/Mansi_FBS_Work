#include<stdio.h>
#include<stdlib.h>
void Alternate(int*,int);
void main()
{
    int size;
    printf("Enter the size:");
    scanf("%d",&size);
    int arr[size];
    printf("Enter element of array:");
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }

    Alternate(arr,size); 
}
void Alternate(int*a,int size)
{
    printf("The Alternate no is:");
    for(int i=0;i<size;i=i+2)
    {
        printf("%d ",a[i]);
    }

}

//output:Enter the size:6
// Enter element of array:1 2 3 4 5 6
// The Alternate no is:1 3 5 