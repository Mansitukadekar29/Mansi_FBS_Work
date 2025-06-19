#include<stdio.h>
#include<string.h>
typedef struct Student
{
	int rollno;
	char name[10];
	int marks;
}Student;
void storeStudents(Student* ,int );
void displayStudents(Student* , int );
int searchStudentByRollNo(Student* ,int ,int );
void main()
{
	 Student sarr[5],sbrr[10];
	 
	  printf("Enter student details for 1st batch");
	 storeStudents(sarr,5);

	 printf("Student details is as follows\n");
	 displayStudents(sarr,5);
	
	 int rollno;
	 printf("Enter the rollno you want to search");
	 scanf("%d",&rollno);
	 
	 int index=searchStudentByRollNo(sarr,5,rollno);
	 
	
	 if(index==-1)
	 	printf("Student not found");
	 else
	 	displayOne(&sarr[index]);
}

void storeStudents(Student* ptr,int size)
{
	
	 for(int i=0;i<5;i++)
	 {
	 	scanf("%d",&ptr[i].rollno);
	 	scanf("%s",ptr[i].name);
	 	scanf("%d",&ptr[i].marks);
	 }
}

void displayStudents(Student* ptr, int size)
{
	printf("Rollno     Name     Marks   \n");
	 for(int i=0;i<5;i++)
	 {
	 	printf("| %d  |",ptr[i].rollno);
	 	printf(" %s    |",ptr[i].name);
	 	printf("   %d |\n",ptr[i].marks);
	 }
	 
}

int searchStudentByRollNo(Student* ptr,int size,int rollno)
{
	
	 for(int i=0;i<size;i++)
	 {
	 	if(ptr[i].rollno==rollno)
	 	{
	 		return i;
		 }
	 }
	 return -1;
}


void displayOne(Student* s)
{
	printf(" Rollno = %d Name= %s Marks =%d ",s->rollno,s->name,s->marks);
}


//output:Enter student details for 1st batch1
//mansi
//98
//2
//aboli
//100
//3
//akanksha
//99
//4
//mrunmayee
//89
//5
//rutika
//88
//Student details is as follows
//Rollno     Name     Marks
//| 1  | mansi    |   98 |
//| 2  | aboli    |   100 |
//| 3  | akanksha    |   99 |
//| 4  | mrunmayee    |   89 |
//| 5  | rutika    |   88 |
//Enter the rollno you want to search4
// Rollno = 4 Name= mrunmayee Marks =89