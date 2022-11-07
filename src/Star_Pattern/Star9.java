package Star_Pattern;

public class Star9
{
	    //* * * * * * *
		//  * * * * *
		//    * * *
		//      *

	public static void main(String[] args) 
	{
	
		int star=7; 
		int space=0;
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
			star=star-2;
			space++;
		}
		
		
		
		
	}
}
