#include<stdio.h>
typedef struct admin
{
    int id;
    char name[50];
    double salary;
    int allowance;
}admin;
void main()
{
admin arr[1];
int i=0;
   printf("Enter the Admin id:");
   scanf("%d",&arr[i].id);

  printf("Enter the Admin name:");
  scanf("%s",&arr[i].name); 

  printf("Enter the Admin salary:");
  scanf("%lf",&arr[i].salary);

  printf("Enter the Admin allowance:");
  scanf("%d",&arr[i].allowance);

  printf("id=  %d\n",arr[i].id);
  printf("name= %s\n",arr[i].name);
  printf("salary= %lf\n",arr[i].salary);
  printf("allowance= %d\n",arr[i].allowance);
}


//output:Enter the Admin id:101
//Enter the Admin name:mansi
//Enter the Admin salary:89000
//Enter the Admin allowance:78900
//id=  101
//name= mansi
//salary= 89000.000000
//allowance= 78900