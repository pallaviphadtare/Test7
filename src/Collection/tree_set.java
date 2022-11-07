package Collection;

import java.util.TreeSet;

public class tree_set
{
public static void main(String[] args) 
{

	TreeSet T=new TreeSet();
	T.add(100);
	T.add(200);
	T.add(500);
	T.add(800);
	T.add(400);
	T.add(300);
	T.add(600);
	T.add(700);
	T.add(200);
	
	System.out.println(T);
	System.out.println(T.size());
	System.out.println(T.isEmpty());
	System.out.println(T.contains(800));
	System.out.println(T.contains(80));
	T.remove(600);
	System.out.println(T);
	T.pollFirst();
	System.out.println(T);
	T.pollLast();
	System.out.println(T);
	System.out.println(T.first());
	System.out.println(T.last());
}
}
