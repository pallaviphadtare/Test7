package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist
{
public static void main(String[] args)
{
	ArrayList al=new ArrayList();
	al.add(100);
	al.add(100);
	al.add("Pallavi");
	al.add('Z');
	al.add(12.02);
	
	System.out.println(al);
	System.out.println(al.isEmpty());
	System.out.println(al.size());
	System.out.println(al.contains(100));
	al.add(1,500);
	System.out.println(al);
	al.remove(1);
System.out.println(al);
	al.set(2,"Vishal");
	System.out.println(al);
	System.out.println(al.indexOf('Z'));
	System.out.println(al.get(4));
	System.out.println("------For each loop------");
	for(Object S:al)
	{
		System.out.println(S);
	}
	System.out.println("------Using iterator curser------");
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("------Using Listiterator curser------");
	ListIterator IT=al.listIterator();
	while(IT.hasNext()) 
	{
		System.out.println(IT.next());
	}
	
	
	
	
	
	
	
}
}
