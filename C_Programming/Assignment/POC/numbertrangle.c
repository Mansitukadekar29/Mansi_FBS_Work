// #include<stdio.h>
// void main()
// {
//     int i,j,size;
//     printf("Enter the size:");
//     scanf("%d",&size);
    
//     for(i=1;i<=size;i++)
//     {
//      for(j=1;j<=i;j++)
//     {
//         printf(" %d",2*j);
//     }
//     printf("\n");
//    }
// }

//output:Enter the size:5
//  2
//  2 4
//  2 4 6
//  2 4 6 8
//  2 4 6 8 10


// #include<stdio.h>
// void main()
// {
//     int i,j,size;
//     printf("Enter the size:");
//     scanf("%d",&size);
    
//     for(i=1;i<=size;i++)
//     {

//      for(j=1;j<=size-i;j++)
//     {
//     
//          printf(" %d",2*j);
      
//     }
//     printf("\n");
//    }
// }


//output:Enter the size:6
//  2 4 6 8 10
//  2 4 6 8
//  2 4 6
//  2 4
//  2




#include<stdio.h>
void main()
{
    int i,j,size;
    printf("Enter the size:");
    scanf("%d",&size);
    
    for(i=1;i<=size;i++)
    {
     for(j=1;j<=i;j++)
    {
        printf(" %d",i);
    }
    printf("\n");
   }
}

//output:Enter the size:5
//  1
//  2 2
//  3 3 3
//  4 4 4 4
//  5 5 5 5 5