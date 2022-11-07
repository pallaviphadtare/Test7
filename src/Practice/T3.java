package Practice;

import java.util.Arrays;

public class T3
{
public static void main(String[] args)
{
	
	String Ar[]={"Pallavi","Vishal","Pallavi"};
	String A2[]= {"Pallavi"};
	String Ar1[]={"Pallavi"};
	String Ar3[]= {"Vishal"};

	System.out.println(Arrays.equals(Ar, A2));
	System.out.println(Arrays.equals(Ar1, A2));

System.out.println(Arrays.equals(Ar1, Ar3));
System.out.println(Arrays.equals(Ar, Ar3));
}
}