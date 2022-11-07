package Logical_Programs;

public class Reverse_String
{
public static void main(String[] args) 
{

	String P ="Pallavi";
	
	String Rev ="";
	
	for(int i=P.length()-1; i>=0; i--)
	{
		Rev=Rev+P.charAt(i);
	}
	
System.out.println(Rev);
}
}
