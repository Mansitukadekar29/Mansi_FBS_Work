
import java.util.*;

class Player implements Comparable<Player>// step 1
{
	int jerseyno;
	String Teamname;
	String Playername;
	int runs;
	int wickets;

	int getJerseyno() {
		return jerseyno;
	}

	void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}

	String getTeamname() {
		return Teamname;
	}

	void setTeamname(String teamname) {
		Teamname = teamname;
	}

	String getPlayername() {
		return Playername;
	}

	void setPlayername(String playername) {
		Playername = playername;
	}

	int getRuns() {
		return runs;
	}

	void setRuns(int runs) {
		this.runs = runs;
	}

	int getWickets() {
		return wickets;
	}

	void setWickets(int wickets) {
		this.wickets = wickets;
	}

	Player() {
		this.jerseyno = 0;
		this.Teamname = "not given";
		this.Playername = "not given";
		this.runs = 0;
		this.wickets = 0;
	}

	Player(int jerseyno, String teamname, String playername, int runs, int wickets) {

		this.jerseyno = jerseyno;
		this.Teamname = teamname;
		this.Playername = playername;
		this.runs = runs;
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "\nPlayer [jerseyno=" + jerseyno + ", Teamname=" + Teamname + ", Playername=" + Playername + ", runs="
				+ runs + ", wickets=" + wickets + "]";
	}

	@Override
	public int compareTo(Player p2) {

		System.out.println("Inside compareTo");
		return this.jerseyno - p2.jerseyno;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals ke andar hai");
		Player e2 = (Player) obj;
		if (this.jerseyno == e2.jerseyno)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		System.out.println("In Hashcode");
		return this.jerseyno;
	}
}// class Player ends here


public class PlayerCollection {

	
	public static void main(String[] args) {

		HashSet<Player> h1 = new HashSet<Player>();
		Player p1 = new Player(45, "mi", "rohit", 20, 30);
		Player p2 = new Player(10, "india", "Sachin", 20, 30);
		Player p3 = new Player(1, "punjab", "Yuvaraj", 20, 30);
		Player p4 = new Player(10, "india", "Sachin", 20, 30);

		h1.add(p1);
		h1.add(p2);
		h1.add(p3);
		h1.add(p4);

		System.out.println(h1);

		if (h1.contains(new Player(1, "punjab", "Yuvaraj", 20, 30))) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		System.out.println("End");

	}

	public static void main2(String[] args) {
		ArrayList<Player> plist = new ArrayList<Player>();
		Player p1 = new Player(45, "mi", "rohit", 20, 30);
		Player p2 = new Player(10, "india", "Sachin", 20, 30);
		Player p3 = new Player(12, "punjab", "Yuvaraj", 20, 30);

		plist.add(p1);
		plist.add(p2);
		plist.add(p3);

		System.out.println(plist);

		Player p4 = new Player(12, "punjab", "Yuvaraj", 20, 30);

		if (plist.contains(p4)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	
	}
	public static void main1(String[] args) {

		TreeSet<Player> t1 = new TreeSet<Player>();
		Player p1 = new Player(45, "mi", "rohit", 20, 30);
		Player p2 = new Player(10, "india", "Sachin", 20, 30);
		Player p3 = new Player(12, "punjab", "Yuvaraj", 20, 30);

		t1.add(p1);
		t1.add(p2);
		t1.add(p3);

		Player p4 = new Player(18, "RCB", "Virat", 10, 20);
		System.out.println(t1);

		if (t1.contains(p4)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

}

	public static void main3(String[] args) {
		LinkedList<Player> p1 = new LinkedList<Player>();
		p1.add(new Player(45, "mi", "rohit", 20, 30));

		System.out.println(p1);
	}

	}
