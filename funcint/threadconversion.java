package funcint;



import java.util.Comparator;



public class threadconversion {

	public static void main(String[] args) {
		
		
//		Runnable r= new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("thread running");
//				
//			}
//		};
		
		Runnable r= ()->System.out.println("thread is running");//run method conversion to LAMDA
	r.run();			
	
	
	
//	Comparator<Integer> comp=new Comparator<Integer>() {
//		
//		@Override
//		public int compare(Integer o1, Integer o2) {
//			// TODO Auto-generated method stub
//			return a-b;
//		}
//	}; 
	
	
	Comparator<Integer> comp=(Integer a,Integer b)->a-b;//comparator conversion to LAMDA EXPRESSION
	
	
	ActionListener a1=(ActionEvent e)-> System.out.println("Button Clicked");
	
	
	
	
	}
	
}
