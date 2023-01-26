package superProgram;

public class Person {
	private String name;
	private int age;
	
	public  Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void diplay() {
		System.out.println("Name is " + name +" and Age is :" +age);
	}

}
