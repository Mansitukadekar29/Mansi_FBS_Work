package Assignment1;

public class Vowels {

	public static void main(String[] args) {
		 char A='t';
//		    printf("Enter the alpha:");
//		    scanf("%c",&A);
		   
		    if( A=='a'|| A=='e' ||A=='i' ||A=='o' ||A=='u' ||A=='A' ||A=='E' ||A=='I' ||A=='O' ||A=='U')
		    {
		        System.out.printf("The alpha is vowel");

		    }
		    else if(A>='a' && A<='z')
		    {
		    	System.out.printf("The alpha is consonent");
		    }
		    else{
		    	System.out.printf("It is not alphabet");
		    }
	}

}
