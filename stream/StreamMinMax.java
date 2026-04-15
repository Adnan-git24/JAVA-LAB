package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(12,1,2,56,23,78,21,200);
	List<Integer> sortedList=list.stream().sorted((a,b)->a-b).toList();
	System.out.println(list);
	System.out.println(sortedList);
	
	Optional<Integer> result1=list.stream().max((a,b)->a-b);
	result1.ifPresent(System.out::println);
	
	Optional<Integer> result=sortedList.stream().min((a,b)->a-b);
	result.ifPresent(System.out::println);
	
	
	
	
	
	
	
	
}
	
}
