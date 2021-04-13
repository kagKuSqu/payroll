package payroll;

public class Employee {
	private int emplId;
	private String name;
	private String address;
	
	public Employee() {
		
	}
	public int getEmplId() {
		return emplId;
	}
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int emplId, String name, String address) {
		super();
		this.emplId = emplId;
		this.name = name;
		this.address = address;
	}
	
}
