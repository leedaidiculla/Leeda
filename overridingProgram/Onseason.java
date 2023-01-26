package overridingProgram;

public class Onseason {
	private float price;
	private float discountamt;
	private float reducedamt;
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscountamt() {
		return discountamt;
	}

	public void setDiscountamt(float discountamt) {
		this.discountamt = discountamt;
	}

	public float getReducedamt() {
		return reducedamt;
	}

	public void setReducedamt(float reducedamt) {
		this.reducedamt = reducedamt;
	}
	
	public void discount() {
		reducedamt=(40*price)/100;
		discountamt=price-reducedamt;
	}
	
	public void display() {
		System.out.println("Actual price is "+getPrice());
		System.out.println("Discounted price on onseason is "+discountamt);
	}

	
	

}
