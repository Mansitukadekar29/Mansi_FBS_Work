#include<stdio.h>
typedef struct Time
{
    int hour;
    int min;
    int sec;
    
}Time;
void main()
{
Time arr[1];
int i=0;
   printf("Enter the Hour:");
   scanf("%d",&arr[i].hour);

  printf("Enter the Minute:");
  scanf("%d",&arr[i].min); 

  printf("Enter the Sec:");
  scanf("%d",&arr[i].sec);

  printf("Time deatails as follows:");
  printf("\n%d Hour:",arr[i].hour);
  printf("%d Min:",arr[i].min);
  printf("%d Sec",arr[i].sec);
 
  
}


//output:Enter the Hour:4
//Enter the Minute:60
//Enter the Sec:56
//Time deatails as follows:
//4 Hour:60 Min:56 Sec
