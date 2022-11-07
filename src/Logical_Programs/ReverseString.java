package Logical_Programs;

public class ReverseString 
{
public static void main(String[] args)
{
	String A="Pallavi Ghare";
	String R="";
	for(int a=A.length()-1; a>=0; a--)
	{
		R=R+A.charAt(a);
	}
	System.out.println(R);
}
}
