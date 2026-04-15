package funcint;



@FunctionalInterface
interface palin{
public Boolean check(String num); 
}


public class palindrome {
public static void main(String[] args) {
	palin p=(String num)->new StringBuilder(num).reverse().toString().equals(num);

System.out.println(p.check("NITIN"));
}
}
