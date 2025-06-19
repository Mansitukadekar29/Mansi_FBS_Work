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
    for(int i=0;i<=size;i+=2)
    {
        printf("Alternate No:%d ",arr[i]);
    }
}

//output:Enter element of array:5
// 1 2 3 4 5 
// Alternate No:1 Alternate No:3 Alternate No:5 
 