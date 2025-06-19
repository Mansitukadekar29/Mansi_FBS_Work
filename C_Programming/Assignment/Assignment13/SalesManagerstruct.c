#include<stdio.h>
typedef struct SalesManager
{
    int id;
    char name[50];
    double salary;
    int intensive;
    int target;
}SalesManager;
void main()
{
SalesManager arr[1];
int i=0;
   printf("Enter the SalesManager id:");
   scanf("%d",&arr[i].id);

  printf("Enter the SalesManager name:");
  scanf("%s",&arr[i].name); 

  printf("Enter the SalesManager salary:");
  scanf("%lf",&arr[i].salary);

  printf("Enter the SalesManager intensive:");
  scanf("%d",&arr[i].intensive);
  
  printf("Enter the SalesManager target:");
  scanf("%d",&arr[i].target);

printf("SalesManager deatails are follows:");
  printf("\nid=  %d\n",arr[i].id);
  printf("name= %s\n",arr[i].name);
  printf("salary= %lf\n",arr[i].salary);
  printf("commission= %d\n",arr[i].intensive);
  printf("target= %d\n",arr[i].target);
  
}


//output:Enter the SalesManager id:101
//Enter the SalesManager name:akanksha
//Enter the SalesManager salary:10000
//Enter the SalesManager intensive:4000
//Enter the SalesManager target:345
//SalesManager deatails are follows:
//id=  101
//name= akanksha
//salary= 10000.000000
//commission= 4000
//target= 345

