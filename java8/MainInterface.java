package java8;

interface Calc{
	void calculate(int n1,int n2);
	
default void calculate(int n1,int n2,int n3)
{
	int s=n1+n2+n3;
	System.out.println("sum="+s);
}

static String getInfo() {
	return "this is sattic getInfo method inside calc interface";
}


}

class Calculator implements Calc{

	@Override
	public void calculate(int n1, int n2) {
		// TODO Auto-generated method stub
		int s=n1+n2;
		System.out.println("Sum="+s);
	}
	public void calculate(int n1,int n2, int n3)
	{
		int s=n1+n2+n3;
		System.out.println("Sum of 3 numbers="+s);
	}
	
}

public class MainInterface {
	
	public static void main(String[] args) 
	{
	
		
		Calculator c= new Calculator();
		c.calculate(2, 3,4);	
		System.out.println(Calc.getInfo());
	}

}
