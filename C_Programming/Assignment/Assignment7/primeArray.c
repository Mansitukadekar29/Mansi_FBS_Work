#include<stdio.h>
void main()
{
    int size;
    printf("Enter element of array:");
    scanf("%d",&size);
    int arr[size];
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<size;i++)
     {
        int num=arr[i];
        int flag=0;
        if(num<2) 
        {
            flag=1;
        } 
        else{
            for(int j=2;j<num;j++) 
            {
                if(num%j==0)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            printf("%d ",num);
        }
    }
}

//output:Enter element of array:4
// 1 2 3 4
// 2 3 






