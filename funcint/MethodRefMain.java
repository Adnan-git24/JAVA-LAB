package funcint;



class calculator{
	  
	  
	   calculator() {
		// TODO Auto-generated constructor stub
	System.out.println("This is constructor");
	  }
	  calculator(int n1,int n2){
		  System.out.println("Division="+n1/n2);
	  }
	  
	
	int sub(int n1,int n2)
	{
		return n1-n2;
	}
	 static int mul(int n1,int n2) {
		return n1*n2;
	}
	
}

@FunctionalInterface
interface cal{
	void cal(int n1,int n2);
}


public class MethodRefMain {

public static void main(String[] args) {
	
	calculator c= new calculator();
	//int r=c.cal(100, 23);
	//System.out.println("Subtraction="+r);
//	cal c1=c::sub;
//	int s1=c1.cal(100, 25);
//	System.out.println("Subtraction="+s1);
//	
//	cal c2=calculator::mul;
//	int r1=c2.cal(100, 50);
//	System.out.println("multiply="+r1);
	
	cal c3=calculator::new;
	c3.cal(20,10);
	
	
}
	
}
