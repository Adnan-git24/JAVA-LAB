package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class minmaxPrac {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,5,40,15,70,40);        //miin
		Optional<Integer> result=list.stream().min((a,b)->a-b);
	 result.ifPresent(System.out::println);
	 
	 Optional<Integer> result1=list.stream().max((a,b)->a-b);  //max
	 result1.ifPresent(System.out::println);
	 
	 
	 List<Integer> result2=list.stream().distinct().toList();   //distinct
	 System.out.println(result2);
	 
	 
	 List<Integer> result3=list.stream().limit(4).toList();   //distinct
	 System.out.println(result3);
	 
	 
	 List<Integer> result4=list.stream().skip(3).toList();   //distinct
	 System.out.println(result4);
	 
	 
	 
	 Optional<Integer> result5=list.stream().distinct().sorted().findFirst();//second max
	 result5.ifPresent(System.out::println);
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
