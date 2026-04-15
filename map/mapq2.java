package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee

{
	int eid;
	String name;
	String dept;
	public Employee(int eid, String name, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
	}
}

public class mapq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1,"Ankit","mca"));
		list.add(new Employee(2,"rahul","mca"));
		
		List<String> lStrings=list.stream().map(n->n.name).toList();
		System.out.println(lStrings);
		
		List<Double> ls=Arrays.asList(0.0,20.0,30.0);
		List<Double> rs=ls.stream().map(n->n*(9/5)+32).toList();
		System.out.println(rs);

	}

}
