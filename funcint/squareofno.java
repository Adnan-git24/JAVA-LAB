package funcint;

@FunctionalInterface
interface square{
	public int cal(int n);
}


public class squareofno {

	public static void main(String[] args) {
		
		square sc=(int num)->num*num;		
		System.out.println(sc.cal(7));
	}
}
