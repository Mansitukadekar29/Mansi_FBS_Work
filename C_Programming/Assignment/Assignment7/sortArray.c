#include<stdio.h>
void main()
{
    int a[7];
    
    for(int i=0;i<4;i++)
    {
        scanf("%d",&a[i]);
    }

    int temp;
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            if(a[j]>a[j+1])
            {
             temp=a[j];
             a[j]=a[j+1];
             a[j+1]=temp;
        
            }
        
        }  
    }
    for(int i=0;i<=4;i++) 
    {
        printf("%d ",a[i]);
    }
    
    
}
