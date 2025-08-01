#include<stdio.h>
#include<string.h>
struct Employee
{
    int id;
    char name[15];
    double salary;
    char addr[100];
    int age;
};
void main()
{
    struct Employee e1,e2;
    e1.id=123;
    strcpy(e1.name,"mansi");
    e1.salary=50000;
    strcpy(e1.addr,"Bharamshing nagar");
    e1.age=22;
     printf("Id is:%d\nName is:%s\nsalary is:%lf\nAddress is:%s\nage is:%d\n",e1.id,e1.name,e1.salary,e1.addr,e1.age);


    printf("Enter your id:");
    scanf("%d",&e2.id);

    printf("Enter your name:");
    scanf("%s",&e2.name);

    printf("Enter your salary:");
    scanf("%lf",&e2.salary);

    printf("Enter your Address:");
    scanf("%s",&e2.addr);

    printf("Enter your age:"); 
    scanf("%d",&e2.age);
    printf("Id is :%d\n Name is:%s\n salary is:%lf\n Address is:%s\nage is:%d\n",e2.id,e2.name,e2.salary,e2.addr,e2.age);


}