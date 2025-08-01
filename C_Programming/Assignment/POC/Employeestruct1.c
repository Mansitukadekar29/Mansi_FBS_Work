#include<stdio.h>
typedef struct Employee
{
    int id;
    char name;
    int salary;

}Employee;
void storeEmployee(Employee* ,int);
 void displayEmployee(Employee* ,int);
 int searchEmployeeByID(Employee* ,int,int);
 void displayOne(Employee*);
int main()
{
     Employee Earr[5];
	 
	  printf("Enter Employee details:");
	 storeEmployee(Earr,5);

	 printf("Employee details is as follows\n");
	 displayEmployee(Earr,5);
	
	 int id;
	 printf("Enter the id you want to search:");
	 scanf("%d",&id);
	 
	 int index=searchEmployeeByID(Earr,5,id);
	 
	
	 if(index==-1)
	 	printf("Employee not found");
	 else
	 	displayOne(&Earr[index]);
}
void storeEmployee(Employee* ptr,int size)
{
    for(int i=0;i<5;i++)
	 {
	 	scanf("%d",&ptr[i].id);
	 	scanf("%s",ptr[i].name);
	 	scanf("%d",&ptr[i].salary);
	 }
}
void displayEmployee(Employee* ptr, int size)
{
	printf("id     Name     salary   \n");
	 for(int i=0;i<5;i++)
	 {
	 	printf("| %d  |",ptr[i].id);
	 	printf(" %s    |",ptr[i].name);
	 	printf("   %d |\n",ptr[i].salary);
	 }
	 
}

int searchEmployeeByID(Employee* ptr,int size,int id)
{
	
	 for(int i=0;i<size;i++)
	 {
	 	if(ptr[i].id==id)
	 	{
	 		return i;
		 }
	 }
	 return -1;
}


void displayOne(Employee* s)
{
	printf(" id = %d Name= %s salary =%d ",s->id,s->name,s->salary);
}
