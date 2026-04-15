package streamreduce;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class str2 {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,2,1);
	
		int pro=list.stream().reduce(1, (a,b)->a*b);
		System.out.println("Product="+pro);
		
		
		List<Integer> list1= Arrays.asList(1,2,24,13);
		int max=list1.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println("max="+max);
		
		List<Integer> list2= Arrays.asList(2,212,24,13);
		int min=list2.stream().reduce(10000,(a,b)->a<b?a:b);
		System.out.println("min="+min);
		
		List<Integer> list3= Arrays.asList(2,212,24,13);
		int count=list3.stream().reduce(0,(a,b)->a+1);
		System.out.println("count="+count);
		
		List<Integer> list4= Arrays.asList(2,212,24,13);
		int even=list4.stream().filter(n->n%2==0).reduce(0, (a,b)->a+b);
		System.out.println("even="+even);
		
		
		List<String> list5= Arrays.asList("Java","python","ApI");
		String concate=list5.stream().reduce("",(a,b)->a+b);
		System.out.println("combined="+concate);

		List<Integer> list6= Arrays.asList(12,45,67,23,89,34,78);
		int maxx=list6.stream().reduce(1000,(a,b)->a<b?a:b);
		int secmax=list6.stream().reduce(1000,(a,b)->a<b&&a>maxx?a:b);
		System.out.println("secmax="+secmax);
		
		
		List<String> list7= Arrays.asList("Java","python","API");
		String longest=list7.stream().reduce("",(a,b)->a.length()>b.length()?a:b);
		System.out.println("combined="+longest);
	
		List<Integer> list8= Arrays.asList(12,34,56,77);
		int SUM=list8.stream().reduce(0,(a,b)->a+(b%10)+(b-(b%10))/10);
		System.out.println("sum of digit="+SUM);
		

		int n=111;
		String num=String.valueOf(n);
		int rel=num.chars().map(c->c-'0').reduce(0,(a,b)->a+b);
		System.out.println("sum="+rel);
		
		int number=5;
		int fact=IntStream.rangeClosed(min, min);
		
		
	}
}
