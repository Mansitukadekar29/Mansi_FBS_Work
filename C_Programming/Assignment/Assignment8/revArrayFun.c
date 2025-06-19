#include<stdio.h>
void rev(int*);
void main()
{
    int a[5];
    printf("Enter element of array:");
    for(int i=0;i<5;i++)
    {
        scanf("%d",&a[i]);
    }
    rev(a); 
}
void rev(int*a)
{
     for(int i=4;i>=0;i--)
     {
        printf("%d ",a[i]);
        
    }

}

//output:Enter element of array: 2 3 4 5 6
//6 5 4 3 2