package map;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class mapq1 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("sachin","rahul","amit");
		System.out.println(list);
		List<String> result=list.stream().map(n->n.toUpperCase()).toList();
		System.out.println(result);
		
		List<Integer> numbers=Arrays.asList(1,2,3,4);
		System.out.println(numbers);
		List<Integer> resulttInteger=numbers.stream().map(n->n*n).toList();		
		System.out.println(resulttInteger);
		
		List<String> listt=Arrays.asList("Java","Python","C");
		System.out.println(list);
		List<Character> resultt=listt.stream().map(n->n.charAt(0)).toList();
		System.out.println(resultt);
		
		List<Integer> numberss=Arrays.asList(1,2,3,4);
		System.out.println(numbers);
		List<String> resulttIntegerr=numbers.stream().map(n->n.toString()).toList();		
		System.out.println(resulttIntegerr);
		
		List<String> lis=Arrays.asList("Java","Python","C");
		System.out.println(lis);
		List<String> resu=lis.stream().map(n->"Item-"+n).toList();
		System.out.println(resu);
		
		List<String> li=Arrays.asList("Java","Python","C");
		System.out.println(li);
		List<Integer> re=li.stream().map(n->n.length()).toList();
		System.out.println(re);
		
		
		
		
	}

}
