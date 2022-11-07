package Logical_Programs;

public class Pallendrome_String
{
public static void main(String[] args) 
{

	String A="Madam";
	String rev="";
	for(int i=A.length()-1; i>=0; i--)
	{
		rev=rev+A.charAt(i);
	}
	if(A.equals(rev))
	{
		System.out.println("given string is pallendrome");
	}
	else
	{
		System.out.println("given string is not pallendrome");
	}
	
		
}
}
