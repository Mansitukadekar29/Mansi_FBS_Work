
class DTest{
			int day,month,year;
			
			void setDay(int day) {
				this.day = day;
			}
			void setMonth(int month) {
				this.month = month;
			}
			void setYear(int year) {
				this.year = year;
			}
			int getDay() {
				return this.day;
			}
			int getMonth() {
				return this.month;
			}
			int getYear() {
				return this.year;
			}
//			void display() {
//				System.out.println("Date is:"+this.day+"/"+this.month+"/"+this.year);  //this is a keyword which is used as reference,which refer current invoking variable
//			}
			void display() {
				System.out.println("Date is:"+getDay()+"/"+getMonth()+"/"+getYear());  //this is a keyword which is used as reference,which refer current invoking variable
			}
			
		}
class Test1 {

		public static void main(String[] args) {
			DTest d1 = new DTest();
			System.out.println(d1);
//				d1.display();
			d1.setDay(24);//d1.day=24;
			d1.setMonth(06);//d1.month=06;
			d1.setYear(2025);//d1.year=2025;
			d1.display();
			d1.getDay();
			d1.getMonth();
			d1.getYear();

			}

		}
