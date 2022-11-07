package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class T7 
{
public static void main(String[] args) 
{

	ArrayList Ar=new ArrayList();
	
	Ar.add(1000);
	Ar.add("Pallavi");
	Ar.add('P');
	Ar.add(12.0564);
	Ar.add(null);
	System.out.println(Ar);
	System.out.println(Ar.indexOf(1000));
	System.out.println(Ar.size());
	System.out.println(Ar.contains(12.0564));
	System.out.println(Ar.contains(564));
	System.out.println(Ar.isEmpty());
	Ar.add(3,'Z');
	System.out.println(Ar);
	System.out.println(Ar.size());
	System.out.println(Ar.indexOf('Z'));
	Ar.remove(5);
	System.out.println(Ar);
	Ar.set(3, 'P');
	System.out.println(Ar);
	System.out.println(Ar.get(1));
	for(Object P:Ar)
	{
		System.out.println(P);
	}
	Iterator it=Ar.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	ListIterator it1=Ar.listIterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	

}
}
