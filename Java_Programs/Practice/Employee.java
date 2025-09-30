

class Details {
			
			int id,salary;
			String name;
			
			void setId(int id1) {
				this.id = id1;
			}
			void setName(String n) {
				this.name = n;
			}
			void setSalary(int s) {
				this.salary = s;
			}
			int getId() {
				return this.id;
			}
			String getName() {
				return this.name;
			}
			int getSalary() {
				return this.salary;
			}

			void display() {
				System.out.println("Id is:"+getId());
				System.out.println("Name is:"+getName());
				System.out.println("Salary is:"+getSalary());  //this is a keyword which is used as reference,which refer current invoking variable
			}
			
		}
		class Employee {

			public static void main(String[] args) {
				Details e1 = new Details();
				System.out.println(e1);
//				d1.display();
				e1.setId(1);//d1.day=24;
				e1.setName("Mansi");//d1.month=06;
				e1.setSalary(50000);//d1.year=2025;
				e1.display();
				e1.getId();
				e1.getName();
				e1.getSalary();

			}


		}
