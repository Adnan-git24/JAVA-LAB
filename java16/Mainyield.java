package java16;

public class Mainyield {

	public static void main(String[] args) {
		
		
		int day=5;
		switch(day) {
		case 1:
			System.out.println("MONDAY");
			break;
			
		case 2:
			System.out.println("TUESDAY");
			break;
			
			default:
				System.out.println("not valid");
		}
	
		
		String result=switch(day)
				{
		case 1,3,4,5->{
			System.out.println("this is 1,3,4,5");
		yield "MONDAY";}
		case 2->"TUESDAY";
		default->"NOT VALID";
				};
				System.out.println(result);
		
		
		
		
	}
}
