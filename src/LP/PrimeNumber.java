package LP;

//import java.util.Scanner;

public class PrimeNumber
{
public static void main(String[] args) 
{
//Scanner sc=new Scanner(System.in);
//System.out.println("enter number");
//int z=sc.nextInt();
int a=7;
	int sum=0;
	for(int i=2;i<=a-1;i++)
	{	//7<=6
		if(a%i==0)
		{	//7%6
			sum++;
		}	
		
	}
	if(sum==0)
	{
		System.out.println(a+" is prime");
	}
	else {
		System.out.println(a+" is not prime");
	}
	
	
}
}
