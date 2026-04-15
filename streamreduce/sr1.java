package streamreduce;
import java.util.*;

public class sr1 {
	
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(12,232,23,23,23);
		double avg=list.stream().reduce(0,(a,b)->a+b)/list.size();
		System.out.println("Avg="+avg);
//		int avg=sum/list.size();
//		System.out.println(avg);
		
		
		
	}

}
