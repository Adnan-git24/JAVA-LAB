package java16;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class foreach {

	
	public static void main(String[] args) {
		
		
	int[] arr= new int[] {1,2,3,4,5,6,7,8,9};
		
	List<Integer> list =Arrays.stream(arr).boxed().toList();//array to list
System.out.println(list);
		list.forEach((item)->System.out.println(item));//iteratre through collection on each index one by one
list.forEach(System.out::println);

	}
}
