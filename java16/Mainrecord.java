package java16;

record Student(int sid,String name,String course) {};//automatically enable aencapsulation along with getters only and toSring


public class Mainrecord {
public static void main(String[] args) {
	Student s= new Student(1, "Adnan", "mca");
	
System.out.println(s.sid());
System.out.println(s.course());
System.out.println(s.name());
System.out.println(s);
	
}
}
