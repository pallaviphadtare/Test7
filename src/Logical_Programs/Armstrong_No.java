package Logical_Programs;

public class Armstrong_No 
{
public static void main(String[] args) 
{

	int num=153;		//1^3+5^3+3^3 = 1+125+27 = 153 ----> Armstrong number
	int rev=0;
	for(int i=num; i>0; i=i/10)
	{
		int rem=i%10;
		rev=rev+rem*rem*rem;
	
	}
	if(num==rev)
	{
		System.out.println(num+" is armstrong number");
	}
	else
	{
		System.out.println(num+" is not armstrong number");
	}
	
}
}
