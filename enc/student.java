package enc;



public class student {
	
    private String name;
    private String course;
	private int old;
	
	public student(int i,String course,int old) {
		// TODO Auto-generated constructor stub
		super();
		this.name=i;
		this.course=course;
		this.old=old;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}
	
}
