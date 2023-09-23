import java.util.HashSet;
class P9 
{
	public static void main(String[] args) 
	{
		HashSet obj=new HashSet();
	
		obj.add(123);
		obj.add(true);
		obj.add("false");
		obj.add('a');
		System.out.println(obj);

		HashSet obj1=new HashSet();
		obj1.add(true);
		obj1.add("hh");
		obj1.add('b');
		//obj1.add(obj);//add whole object  to object1
		//obj1.addAll(obj);//add all element in object to object1 

		System.out.println(obj1);
		System.out.println(obj.contains('a'));
		System.out.println(obj1.indexOf(123));
		
	}
}
