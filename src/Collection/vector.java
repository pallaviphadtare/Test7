package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector
{
public static void main(String[] args) 
{

	Vector V1=new Vector();
	V1.add(100);
	V1.add("Payal");
	V1.add('X');
	V1.add("Pallavi");
	V1.add(100.25);
	V1.add('X');
	
	System.out.println(V1);
	System.out.println(V1.isEmpty());
	System.out.println(V1.contains(1000));
	System.out.println(V1.size());
	System.out.println(V1.indexOf(100.25));
	V1.add(2,"Banana");
	System.out.println(V1);
	V1.remove(5);
	System.out.println(V1);
	System.out.println(V1.get(3));
	V1.set(5, 200);
	System.out.println(V1);
	System.out.println("-------for each loop-------");
	for(Object A:V1)
	{
		System.out.println(A);
	}
	System.out.println("----------iterator-----------");
	Iterator IT=V1.iterator();
	while(IT.hasNext())
	{
		System.out.println(IT.next());
	}
	System.out.println("----------Listiterator-----------");
	ListIterator it=V1.listIterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("----------Enumeration-----------");
	Enumeration E=V1.elements();
	while(E.hasMoreElements())
	{
		System.out.println(E.nextElement());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
