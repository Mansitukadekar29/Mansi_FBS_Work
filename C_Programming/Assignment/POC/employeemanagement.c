//Employee Management System
typedef struct Employee {
	int id;
	char name[20];
	double salary;
} Employee;
void storeEmployee(Employee *,int* );
void displayEmployees(Employee*,int );
int searchEmployeeById(Employee*,int,int );
void displayOne(Employee*);


void storeEmployee(Employee * emps,int* count) {
	emps[0].id=101;
	strcpy(emps[0].name,"raj");
	emps[0].salary=50000;

	emps[1].id=102;
	strcpy(emps[1].name,"vishal");
	emps[1].salary=52000;

	emps[2].id=103;
	strcpy(emps[2].name,"Shraddha");
	emps[2].salary=500400;


	emps[3].id=104;
	strcpy(emps[3].name,"Ajinkya");
	emps[3].salary=450100;

	emps[4].id=105;
	strcpy(emps[4].name,"muskan");
	emps[4].salary=50000;

	emps[5].id=106;
	strcpy(emps[5].name,"prerna");
	emps[5].salary=150000;

	*count=6;
}

void displayEmployees(Employee* emps,int count) {
	for(int i=0; i<count; i++) {
		printf("\nEmployee Id= %d Name= %s Salary= %lf \n",emps[i].id,emps[i].name,emps[i].salary);
	}
}

int searchEmployeeById(Employee* emps,int count,int id) {
	for(int i=0; i<count; i++) {
		if(emps[i].id==id)
			return i;
	}
	return -1;
}

void displayOne(Employee* emp) {

	printf("\nEmployee Id= %d Name= %s Salary= %lf \n",emp->id,emp->name,emp->salary);

}