package funcint;

@FunctionalInterface //funcational interface include only ONE ABSTRACT method and can have private static default methods 
interface add{
	void square(int num1);
	
}




public class MainFuncInterface {

	public static void main(String[] args) {
		
//		add a= new add()
//				{
//					@Override
//					public int calculate(int n1, int n2) {
//						// TODO Auto-generated method stub
//						return n1+n2;
//					}		
//			
//				};
//				System.out.println("sum="+a.calculate(2, 3));
		
		
		
				add a1=(num1)->{
					
					System.out.println("Area of Square = "+(4*(num1*num1))+"cm\u00B2 "+" of side "+num1+"cm");
					
				}; //LAMDA EXPRESSION, in java script called arrow function
				a1.square(2);
		
	}
	
	
}


//LAMDA EXPRESSION TYPES
//1- ()->{}//for multi line
//2- ()-> System.out.println("hello")// for single line 


