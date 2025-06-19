#include<stdio.h>
typedef struct HR
{
    int id;
    char name[50];
    double salary;
    int commission;
}HR;
void main()
{
HR arr[1];
int i=0;
   printf("Enter the HR id:");
   scanf("%d",&arr[i].id);

  printf("Enter the HR name:");
  scanf("%s",&arr[i].name); 

  printf("Enter the HR salary:");
  scanf("%lf",&arr[i].salary);

  printf("Enter the HR commission:");
  scanf("%d",&arr[i].commission);

printf("HR deatails are follows:");
  printf("\nid=  %d\n",arr[i].id);
  printf("name= %s\n",arr[i].name);
  printf("salary= %lf\n",arr[i].salary);
  printf("commission= %d\n",arr[i].commission);
}


//output:Enter the HR id:101
//Enter the HR name:mansi
//Enter the HR salary:120000
//Enter the HR commission:78900
//HR deatails are follows:
//id=  101
//name= mansi
//salary= 120000.000000
//commission= 78900


