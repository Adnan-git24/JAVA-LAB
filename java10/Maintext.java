package java10;

public class Maintext {

	public static void main(String[] args) {
		String dataString="""
	package java10;


public class Mainvar {
//var=10;//not supported
	
public static void main(String[] args) {
	int a=10;
	var name="kiet";//local variable type inference (it cannoot be declared instance)
	
	var value=10.2;
	System.out.println(name+value+name);
	//var c;
	//c=1;//not possible
	//var=null;//not possible
	
	String name1= new String("hello");
	var name2= new String("world");

    int[] arr= new int[3];
	for(var x:arr)
	{
		System.out.println(x);
	}
	
	
	
	
}
}
				""";
		System.out.println(dataString);
		
	}
}
