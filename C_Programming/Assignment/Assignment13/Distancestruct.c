#include<stdio.h>
typedef struct Distance
{
    int feet;
    int inch;
   
}Distance;
void main()
{
Distance arr[1];
int i=0;
   printf("Enter the feet:");
   scanf("%d",&arr[i].feet);

  printf("Enter the inch:");
  scanf("%d",&arr[i].inch); 

  printf("Distaance deatails as follows:");
  printf("\n%d feet.",arr[i].feet);
  printf("%d inch",arr[i].inch);
  
 
  
}


//output:Enter the feet:14
//Enter the inch:6
//Distaance deatails as follows:
//14 feet.6 inch