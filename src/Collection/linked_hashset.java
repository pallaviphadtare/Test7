package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linked_hashset
{
public static void main(String[] args) 
{

	LinkedHashSet LH=new LinkedHashSet();
	LH.add(100);
	LH.add("banana");
	LH.add('B');
	LH.add(100);
	LH.add(null);
	LH.add(null);
	LH.add(52.25);
	LH.add(500);
	System.out.println(LH);
	System.out.println(LH.size());
	System.out.println(LH.contains('B'));
	System.out.println(LH.contains("AB"));
	System.out.println(LH.isEmpty());
	LH.remove(null);
	System.out.println(LH);
	System.out.println("-----for each loop--------");
	for(Object S1:LH)
	{
		System.out.println(S1);
	}
	System.out.println("------Using iterator curser------");
	Iterator IR=LH.iterator();
	while(IR.hasNext())
	{
		System.out.println(IR.next());
	}
}
}
