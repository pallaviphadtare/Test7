package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist 
{
public static void main(String[] args) 
{

	LinkedList L1=new LinkedList();
	L1.add(100);
	L1.add("Virat");
	L1.add("Subodh");
	L1.add('F');
	L1.add(264);
	L1.add(99.99);
	L1.add(null);
	L1.add('F');
	System.out.println(L1);
	System.out.println(L1.isEmpty());
	System.out.println(L1.contains(100));
	System.out.println(L1.contains(1004));
	System.out.println(L1.get(5));
	System.err.println(L1.lastIndexOf('F'));
	System.err.println(L1.indexOf('F'));
	L1.add(6,555f);
	System.out.println(L1);
	L1.remove(1);
	System.out.println(L1);
	L1.set(6, "Kohli");
	System.out.println(L1);
	System.out.println(L1.size());
	System.out.println("-------------for each loop----------");
	for(Object OB:L1)
	{
		System.out.println(OB);
	}
	System.out.println("-------------iterator----------");
	Iterator it=L1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("-------------Listiterator----------");
	ListIterator it1=L1.listIterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
}
}
