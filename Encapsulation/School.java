package Encapsulation;

public class School {

	public static void main(String[] args) {
		
		Student s =new Student();
		
		//s.setSchool("St.Thomas");
		System.out.println(s.getSchool());	
		s.setName("Leeda");
		System.out.println(s.getName());	
		s.setAge(10);
		System.out.println(s.getAge());
		s.setIspass(false);
		System.out.println("Student Status :" +s.isIspass());
		
		
	}
		

}
