#include<stdio.h>
struct employee
{
    int id;
    char name[30];
    int salary;
    
};
void main()
{
   struct employee earr[3];
    for(int i=0;i<3;i++)
    {
        printf("Enter the employee id:");
        scanf("%d",&earr[i].id);
        printf("Enter the employee name:");
        scanf("%s",earr[i].name);
        printf("Enter the employee salary:");
        scanf("%d",&earr[i].salary);
    }
    
    // for(int i=0;i<5;i++)
    // {
    //     printf("\n%d",earr[i].id);
    //     printf("\n%s",earr[i].name);
    //     printf("\n%d",earr[i].salary);
    // }
    int searchid; 
    printf("Enter the id i want to search:");
    scanf("%d",&searchid);
    for(int i=0;i<3;i++)
    {
        if(earr[i].id==searchid)
        {
            printf("Enter the details:");
            printf("\nid=%d",earr[i].id);
            printf("\nname=%s",earr[i].name);
            printf("\nsalary=%d",earr[i].salary);
        }
    }

   
}