package stream;

import java.util.*;



public class prac1 {
	
	public static void main(String[] args) {
		List<Integer> s2= Arrays.asList(10,15,20,25,30);
		ArrayList<Integer> list= new ArrayList<>();
		list.addAll(s2);
		list.stream().filter((n)->n>15).filter((n)->n%2==0).forEach(System.out::println);
	}

}
