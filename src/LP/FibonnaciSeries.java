package LP;

public class FibonnaciSeries 
{
	public static void main(String[] args)
	{
	int a=0,b=1,c=0; 
	//1 2 3 4 5 
	System.out.println(a);
	System.out.println(b);
	for(int i=1;i<=10;i++)
	{
	c=a+b;
	System.out.println(c); //3 5 8 13 21
	a=b;
	b=c;
	}

	}
}
