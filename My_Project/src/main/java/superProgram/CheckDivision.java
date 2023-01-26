package superProgram;

public class CheckDivision extends Addition {

	private int d;
	
	public CheckDivision(int a,int b) {
		super(a,b);
	
	}
	
	public int Division() {
		//sum();
		d=sum()%10;
		if(d==0) {
			System.out.println("Sum is divisible by 10");
		}else
		{
			System.out.println("Sum is not divisible by 10");
		}
		return d;
		
	}
	
	public static void main(String[] args) {
		
		CheckDivision c1= new CheckDivision(20,2);
		c1.Division();

	}

}
