package overridingProgram;


public class Offseason extends Onseason {
	private float reducedamt;
	private float discountamt;
	private static String stat="Onseason";
	
	
	public void discount() {
		reducedamt=(15*getPrice())/100;
		discountamt=getPrice()-reducedamt;
	}
	
	public void display() {
		System.out.println("Actual price is "+getPrice());
		System.out.println("Discounted price on offseason is "+discountamt);
	}


	public static void main(String[] args) {
		
		if(stat=="Offseason") {
		Offseason o =new Offseason();
		o.setPrice(5000.00f);
		o.discount();
		o.display();
		}else if(stat=="Onseason")
		{
		Onseason os=new Onseason();
		os.setPrice(5000.00f);
		os.discount();
		os.display();
		}

	}

}
