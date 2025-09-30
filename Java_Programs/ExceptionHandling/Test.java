package p1;

class LowMarkException extends Exception{
	public String toString()
	{
		return"mark less than 0";
	}
}
class HighMarkException extends Exception{
	public String toString()
	{
		return"mark greater than 100";
	}
}
public class Test {

	public static void main(String[] args) {
	    try {
	    	int mark=110;
	    	if(mark<=0)
	    	{
	    		throw new LowMarkException();
	    	}
	    	if(mark>100)
	    	{
	    		throw new HighMarkException();
	    	}
	    	
	    }
	    catch(LowMarkException lme) {
	    	System.out.println(lme);
	    }
	    catch(HighMarkException hme) {
	    	System.out.println(hme);
	    }
	}

}
