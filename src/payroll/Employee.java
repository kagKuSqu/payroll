package payroll;

public class Employee {
	private int emplId;
	private String name;
	private String address;
	private PaymentClassification paymentClassification;
	
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
	public PaymentClassification getPaymentClassification() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPaymentClassification(PaymentClassification paymentClassification) {
		this.paymentClassification = paymentClassification;
	}
	public PaymentMothod getPaymentMethod() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
