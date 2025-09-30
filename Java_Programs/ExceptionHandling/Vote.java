package p2;

class VoterAgeException extends Exception{

	@Override
	public String toString() {
		return "Invalid age!YOu cant vote!";
	}	
}


class Voter{
	int age;
	Voter(int a){
		this.age=a;
	}
	void validate() throws VoterAgeException
	{
		if(this.age<18) {
			throw new VoterAgeException();
		}else {
			System.out.println("you can vote");
		}
	}
}



public class Vote {

	public static void main(String[] args) {
	   Voter v1=new Voter(12);
	   try {
	   v1.validate();
	   }
	   catch(VoterAgeException e) {
		   System.out.println("inside main");
		   System.out.println(e);
	   }
	   finally {
		   System.out.println("inside finally");
	   }
	}

}
