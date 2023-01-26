package abstraction;

public class AbstractImplementation extends Student {
	public void  process() {
		System.out.println("Print process method");
	}

	public static void main(String[] args) {
		AbstractImplementation a = new AbstractImplementation();
		a.process();
		a.setUp();
		a.tearDown();

	}

}
