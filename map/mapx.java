package map;

import java.util.*;

public class mapx {
public static void main(String[] args) {
	
	List<Integer> numbers=Arrays.asList(23,554,667,89,23);
	System.out.println(numbers);
	List<Integer> resultIntegers=numbers.stream().filter(n->n<40).map(n->n+5).toList();
	System.out.println(resultIntegers);
}
}
