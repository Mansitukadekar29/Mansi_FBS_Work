package Classwork;

public class Series4 {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<i+1;j++) 
			{
				System.out.printf("%c",65+j);
			}
			if(i!=n)
			System.out.printf("+");
		}
	}

}
