#include<stdio.h>
void Search(int*,int);
void main()
{
    int a[5];
    int no;
    printf("Enter number:");
    scanf("%d",&no);
    printf("Enter element of array:");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&a[i]);
    }
    Search(a,no);
    
}

void Search(int*a,int no)
{
    int index=-1;
     for(int i=0;i<5;i++)
     {
        if(a[i]==no)
        {
         index=i;
         break;
        }
   }
    if(index==-1)
    {
        printf("element not found");
    }
    else
    {
        printf("element found at %d position",index);
    } 

}

//output:Enter number:5
// Enter element of array:2 3 5 6 7 8
// element found at 2 position