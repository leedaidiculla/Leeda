package abstraction;

public abstract class Student {
	
	public abstract void  process();// abstract method
	
	public void setUp() {// non abstract method or concrate
		System.out.println("Print set up");
	}
	
	public void tearDown() {
		System.out.println("Print tear down");
	}

}
