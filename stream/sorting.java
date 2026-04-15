package stream;

import java.util.Arrays;
import java.util.List;

public class sorting {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,1,2,56,23,78,21,200);
		List<Integer> sortedList=list.stream().sorted((a,b)->a-b).toList();
		System.out.println(list);
		System.out.println(sortedList);
		
	}

}
