#include<stdio.h>
typedef struct Date
{
    int date;
    char Month[50];
    int Year;
    
}Date;
void main()
{
Date arr[1];
int i=0;
   printf("Enter the Date:");
   scanf("%d",&arr[i].date);

  printf("Enter the Month:");
  scanf("%s",&arr[i].Month); 

  printf("Enter the Year:");
  scanf("%d",&arr[i].Year);

  printf("Date deatails as follows:");
  printf("\n%d/",arr[i].date);
  printf("%s/",arr[i].Month);
  printf("%d",arr[i].Year);
 
  
}


//output:Enter the Date:29
//Enter the Month:may
//Enter the Year:2003
//Date deatails as follows:
//29/may/2003
