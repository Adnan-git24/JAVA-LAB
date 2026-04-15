package stream;

import java.util.ArrayList;



public class prac2 {
	
	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<Student>();
	list.add(new Student(1,"Student 1", 65));
	list.add(new Student(2,"Student 2", 95));
	list.add(new Student(3,"Student 3", 55));
	list.add(new Student(4,"Student 4", 45));
	list.add(new Student(5,"Student 5", 15));
	list.add(new Student(6,"Student 6", 25));
	System.out.println("\tSid\tName\tMarks");
	list.stream().filter(Student->Student.getMarks()>60).forEach((Student)->{
		String result= String.format("\t%d\t%s\t%d",
				Student.getSid(),Student.getName(),Student.getMarks());
		System.out.println(result);
	});
	
		
		
	
	}

}
