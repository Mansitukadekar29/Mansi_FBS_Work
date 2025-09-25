
class Player{
	int jerseyno,age,rank;
	String Coachname;
	int getJerseyno() {
		return jerseyno;
	}
	 void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	int getAge() {
		return age;
	}
	 void setAge(int age) {
		this.age = age;
	}
	 int getRank() {
		return rank;
	}
	void setRank(int rank) {
		this.rank = rank;
	}
	 String getCoachname() {
		return Coachname;
	}
	 void setCoachname(String coachname) {
		Coachname = coachname;
	}
	Player(){
		this.jerseyno=0;
		this.age=0;
		this.rank=0;
		this.Coachname="not given";
	}
	Player(int jno,int age,int rank,String Cname){
		this.jerseyno=jno;
		this.age=age;
		this.rank=rank;
		this.Coachname=Cname;
	}
	void display() {
		System.out.println("player jersey no is:"+jerseyno);
		System.out.println("player age is:"+age);
		System.out.println("playe rrank are"+rank);
		System.out.println("player coachname is:"+Coachname);
	}
}

class Cricketplayer extends Player{
	int run;
	int over;
	
	Cricketplayer(){
		super();
		this.run=0;
		this.over=0;
	}
	Cricketplayer(int jno,int age,int rank,String Cname,int run,int over){
		super(jno,age,rank,Cname);
		this.run=run;
		this.over=over;
		
	}
	int getRun() {
		return run;
	}
	void setRun(int run) {
		this.run = run;
	}
	 int getOver() {
		return over;
	}
	 void setOver(int over) {
		this.over = over;
	}
	void display() {
		super.display();
		System.out.println("Player run are:"+run);
		System.out.println("Over are :"+over);
	}
}

class Footballplayer extends Player{
	int noofgoal;
	int noofpenalti;
	Footballplayer(){
		super();
		this.noofgoal=0;
		this.noofpenalti=0;
	}
	Footballplayer(int jno,int age,int rank,String Cname,int noofgoal ,int noofpenalti){
		super(jno,age,rank,Cname);
		this.noofgoal=noofgoal;
		this.noofpenalti=noofpenalti;
	}
	int getNoofgoal() {
		return noofgoal;
	}
	 void setNoofgoal(int noofgoal) {
		this.noofgoal = noofgoal;
	}
	 int getNoofpenalti() {
		return noofpenalti;
	}
	 void setNoofpenalti(int noofpenalti) {
		this.noofpenalti = noofpenalti;
	}
	void display() {
		super.display();
		System.out.println("no of goal:"+noofgoal);
		System.out.println("no of penalti:"+noofpenalti);
	}
}
class PlayerTest {

	public static void main(String[] args) {
		Player p1=new Player();
		p1.display();
		Player p2=new Player(18,40,7,"Mansi");
		p2.display();
		
		Cricketplayer Ck1=new Cricketplayer();
		Ck1.display();
		Cricketplayer Ck2=new Cricketplayer(7,50,7,"Mrunmayee",40,8);
		Ck2.display();
		
		Footballplayer f1=new Footballplayer();
		f1.display();
		Footballplayer f2=new Footballplayer(9,40,4,"Akanksha",30,5);
		f2.display();

	}

}
