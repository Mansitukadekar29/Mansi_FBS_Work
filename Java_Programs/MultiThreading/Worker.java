package p1;

public class Worker extends Thread {

	public void run() {
		String str="123456789098765432123456789";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(" "+str.charAt(i));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	

}//Worker class ends here

class AnotherWorker implements Runnable{
	
	public void run() {
		String str="!@##$%%^^&&**(()_+_)(*&^^%$#@!";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(" "+str.charAt(i));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}//Class AnotherWorker ends here

class MainThread{
	public static void main(String[] args) {
		Worker w1=new Worker();
		w1.start();
		
		AnotherWorker aw=new AnotherWorker();
		Thread t1=new Thread(aw);
		t1.start();
		
		String str="abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(" "+str.charAt(i));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
	}
}//class MainThread ends here
