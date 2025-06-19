#include<stdio.h>
void main() 
{
    int arr[100],n,i,min,max;
    printf("Enter the number of elements in array:");
    scanf("%d",&n);
    printf("Enter %d elements:",n);
    for(i=0;i<n;i++) 
	{
        scanf("%d",&arr[i]);
    }
    max=arr[0];
    min=max; 
    for(i=1;i<n;i++)
	 {
        if(arr[i]<min)
            min=arr[i];
        if(arr[i]>max)
            max=arr[i];
    }
     printf("Minimum number is: %d\n",min);
     printf("Maximum number is: %d\n",max);

}


//output:Enter the number of elements in array:3
//Enter 3 elements:1 5 3
//Minimum number is: 1
//Maximum number is: 5