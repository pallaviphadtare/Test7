package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset 
{
public static void main(String[] args) 
{
	HashSet H=new HashSet();
	H.add(100);
	H.add(null);
	H.add(null);		// Allow only one null values
	H.add("Virat");
	H.add('D');
	H.add(20.15);
	H.add('D');			// Duplicate
	
	System.out.println(H);
	System.out.println(H.isEmpty());
	System.out.println(H.size());
	System.out.println(H.contains('D'));
	System.out.println(H.contains("DS"));
	H.remove(null);
	System.out.println(H);
	System.out.println("-------------for each loop----------");
	for(Object S:H)
	{
		System.out.println(S);
	
	}
	System.out.println("-------------iterator----------");
	Iterator it=H.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
