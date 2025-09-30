
class Test {

	public static void main(String[] args) {
//		int a=10;
//		int b=2;
//		int c;
		try {
//			if(b==0)
//			{
//				throw new ArithmeticException();
//			}
//			else
//			{
//				c=a/b;
//				System.out.println("Answer is:"+c);
//			}
			int arr[]= {10,2};
			int a=arr[0];
			int b=arr[2];
			int c;
			
			c=a/b;
			System.out.println("Answer is:"+c);//here implicitely throw by java
		}
		
//		catch(Exception e)
//		{
//			System.out.println("Something is happen");
//		}
		
		catch(ArithmeticException e)
		{
			System.out.println("please dont provide 0 in b");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please dont provide more than 1 index b");
		}
		
		catch(Exception e)
		{
			System.out.println("Something is happen");
		}
		
	}
}
