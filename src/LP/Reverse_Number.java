package LP;

public class Reverse_Number 
{
public static void main(String[] args) 
{

	int a=89745;
	int rev=0;
	int rem;
	int pal=a;
	while(a!=0)
	{
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
	}
	System.out.println(rev);
	
	
}
}
