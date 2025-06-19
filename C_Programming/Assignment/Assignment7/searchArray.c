#include<stdio.h>
void main()
{
    int arr[5],n,no;
    printf("Enter the numbers of elements in array:");
    scanf("%d",&n);
    printf("Enter element of array:");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    int index=-1;
    printf("Enter the search number:");
    scanf("%d",&no);
    for(int i=0;i<n;i++)
    {

        if(arr[i]==no)
        {
         
         index=i;
         break;
        }
   }
    if(index==-1)
    {
        printf("number not found");
    }
    else
    {
        printf("number found at %d",index);
    } 
}

//output:Enter element of array:12 23 34 45
// Enter the search number:34
// number found at 2