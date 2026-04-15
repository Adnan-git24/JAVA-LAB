package poly;



class Animal {
 static String name;
static	String sound;
	
	Animal(){
		this("Cat1","");
	}
	
	Animal(String name,String sound)
	{
		this.name=name;
		this.sound=sound;
	}
	
	static void getInfo() {
		System.out.println("Animal"+name);
		System.out.println("Animal Sound"+sound);
		
	}
	
	
	void getInfo(String name,String sound,int leg) {
		System.out.println("Name"+name);
		System.out.println("Sound"+sound);
		System.out.println("Legs"+leg);
		
	}
	
	
	
}

class cat extends Animal{
	
	public cat(String name,String sound) {
		super(name,sound);
	
	
}
 static void getInfo() {
	 System.out.println("Cat name: "+name);
	 System.out.println("Cat Sound: "+sound);
	 
 }

}

public class poly{
	
	
	public static void main(String[] args)
	{
		
		cat c1= new cat("Cat1","meow");
		c1.getInfo();
		
		Animal a1= new cat("Dog","bhow");
		a1.getInfo();
	}
}


