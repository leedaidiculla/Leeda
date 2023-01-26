package superProgram;

public class Student extends Person {
	private String course;
	
	public Student(String name,int age,String course) {
		super(name,age);
		this.course=course;
		
	}
	
	public void print() {
		diplay();
		System.out.println("Course : " +course);
		
	}
}
