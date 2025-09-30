
interface Test {
	
void brake();
abstract void start();
public abstract void stop();
}

class Car implements Test
{
	//@override
	public void brake() {
		System.out.println("Brake has been implemented");
	}
	
		//@override
		public void start() {
			System.out.println("Start has been implemented");
			
		}
		
		public void stop() {
			System.out.println("Stop has been implemented");
		}
	
	class vehicle{
		public static void main(String[] args) {
			Test T1;
			Car c1=new Car();
			c1.brake();
			c1.start();
			c1.stop();
		}
	}
}
