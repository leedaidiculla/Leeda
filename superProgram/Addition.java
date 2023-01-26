/*Program to check the addition result is divisible by 10 
• Class 1 Return addition result of two numbers 
• Class 2 Check the addition result is divisible by 10(use super keyword)
*/
package superProgram;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int sum() {
		int c=a+b;
		System.out.println("Sum is "+c);
		return c;
	}

}
