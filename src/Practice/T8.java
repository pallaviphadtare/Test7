package Practice;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class T8
{
	public static void main(String[] args)
	{
	Vector V=new Vector();
	V.add("Mango");
	V.add('D');
	V.add(null);
	V.add("PINK");
	V.add(9999);
	V.add(1562);
	V.add('D');
	V.add("Addition");
	System.out.println(V);
	System.out.println(V.size());
	System.out.println(V.indexOf(1562));
	System.out.println(V.isEmpty());
	System.out.println(V.get(4));
	System.out.println(V.contains("PINK"));
	System.out.println(V.contains("PINKY"));
	V.add(1,'P');
	System.out.println(V);
	V.remove(2);
	System.out.println(V);
	V.set(0,"Blue");
	System.out.println(V);
	for(Object A:V)
	{
	System.out.println(A);
	}
	Iterator ir=V.iterator();
	while(ir.hasNext())
	{
	System.out.println(ir.next());
	}
	ListIterator ir1=V.listIterator();
	while(ir1.hasNext())
	{
	System.out.println(ir1.next());
	}

	}
}
