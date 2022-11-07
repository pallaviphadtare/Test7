package Logical_Programs;

import java.util.Arrays;

public class Arraysequals
{
public static void main(String[] args) 
{

	char A[]={'P','B','Z'};
	char B[]={'P','B','Z'};
	char C[]={'A','B','Z'};
	System.out.println(Arrays.equals(A, B));
	System.out.println(Arrays.equals(C, B));
	System.out.println(Arrays.equals(A, C));
	
}
}
