package stream;

import java.util.Arrays;
import java.util.List;


public class prac {

	
	public static void main(String[] args) {
		System.out.println("Unsorted array");
		List<Integer> ls= Arrays.asList(1,24,56,12,34,10);
		ls.forEach(System.out::println);
		System.out.println("Sorter array");
		ls.stream().sorted().toList().forEach(System.out::println);
		
		
		System.out.println("Sqaure of top 4 values");
		List<Integer> list=Arrays.asList(3,5,7,2,8,6,4);
		list.stream().limit(4).map(a->a*a).forEach(System.out::println);	
		
		System.out.println("sum of teh smallest 4 numbers");
		List<Integer> listt=Arrays.asList(3,5,7,2,8,6,4);
		int result=listt.stream().sorted().limit(4).reduce(0,(a,b)->a+b);
		System.out.println("Sum="+result);
		
		System.out.println("smallest odd number greater than 20");
		List<Integer> lst=Arrays.asList(3,5,7,2,8,6,4);
		lst.stream().sorted().filter(n->n%2==0).filter(n->n>20).limit(1).forEach(System.out::println);
		
		System.out.println("product of all numbers greater than 5");
		List<Integer> list2=Arrays.asList(3,5,7,2,8,6,4);
	    int product=list2.stream().filter(n->n>5).reduce(1,(a,b)->a*b);
	    System.out.println(product);
	    
	    System.out.println("skip first 2 element and find minimum value");
		List<Integer> list3=Arrays.asList(3,5,7,2,8,6,4);
	    list3.stream().sorted().skip(2).limit(1).forEach(System.out::println);
	    
	   
	    System.out.println("Sum of first 3 even numbers");
	    int sum= list.stream().filter(n->n%2==0).limit(3).reduce(0,(a,b)->a+b);
	    System.out.println(sum);
		
	}
}
