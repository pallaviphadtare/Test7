package Practice;



public class practice1 
{
	
	public static void main(String[] args)
	{
			
		int a=1348;
		int rev=0;
		for(int i=a; i>0; i=i/10)
		{
		int rem=i%10;
		rev=rev*10+rem;
		}
		System.out.println(rev);

	
	

	}
	
}

