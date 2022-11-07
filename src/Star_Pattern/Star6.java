package Star_Pattern;

public class Star6 
{

//	    *
//    * *
//  * * *
//* * * *

	public static void main(String[] args) 
	{
		int star=1,space=3;
		for(int i=1; i<=4; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}
		
		
		
		
		
		
		
		
		
	}
}
