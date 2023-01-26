package aggregation;

public class StudentDetails {
	private String Studname;
	private int rollno;
	private StudentAddress studaddress;
	
	public String getStudname() {
		return Studname;
	}


	public void setStudname(String studname) {
		Studname = studname;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public StudentAddress getStudaddress() {
		return studaddress;
	}


	public void setStudaddress(StudentAddress studaddress) {
		this.studaddress = studaddress;
	}


	public static void main(String[] args) {
		StudentDetails s=new StudentDetails();
		s.setStudname("Leeda");
		s.setRollno(1245);
		
		StudentAddress sd=new StudentAddress();
		sd.setHousename("Kizhakkepurathu");
		sd.setStreetname("Kallissery");
		sd.setPincode(689456);
		
		s.setStudaddress(sd);
		System.out.println("Name : "+s.getStudname());
		System.out.println("Roll : "+s.getRollno());
		System.out.println("Address : "+s.getStudaddress().getHousename()+","+s.getStudaddress().getStreetname()+","+s.getStudaddress().getPincode());

	}

}
