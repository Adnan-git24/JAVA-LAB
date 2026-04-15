package funcint;

@FunctionalInterface
interface voter{
	
	void checkvoter(int age);
	
}

class voterlist{
	void checkvotername(int age)
	   {
			if(age>=18)
				System.out.println("can vote");
			else
				System.out.println("cannot vote");		
		
	   }
	
}


public class age {
	public static void main(String[] args) {
	
		voter v=age->{
			if(age>=18)
				System.out.println("Age valid");
			else
				System.out.println("Age not valid");		
		
	   };
	   
	   v.checkvoter(18);
	   voterlist v1= new voterlist();
	   voter v2=v1::checkvotername;//reference operator
	   v2.checkvoter(17);
		
	}
	
	

}
