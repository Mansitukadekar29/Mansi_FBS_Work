#include<stdio.h>
 void StoreArray(int* ,int );
 void DisplayArray(int* ,int );
 int ReplaceArray(int* ,int ,int ,int );
void main()
{
    int arr[10];
    int oldv,newv;
    printf("Enter the elements:");
    StoreArray(arr,10);
    printf("The elements are:");
    DisplayArray(arr,10);
    printf("Enter the Replace elements:");
    ReplaceArray(arr,10,7,5);
    
}
 void StoreArray(int* arr,int size)
{
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
}

void DisplayArray(int* arr,int size)
{
   for(int i=0;i<size;i++)
    {
        printf("%d",arr[i]);
    } 
}

int ReplaceArray(int* arr,int size,int oldv,int newv)
{
    int status=0;
   for(int i=0;i<size;i++)
    {
        
    if(arr[i]==oldv)
    {
        arr[i]=newv;
        status=1;
    }
    printf("%d",arr[i]);
    return status;
}
}
