package Classwork;

public class Series2 {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<i+1;j++) 
			{
				System.out.printf("%d",i);
			}
			if(i!=n)
			System.out.printf("+");
		}

	}

}
