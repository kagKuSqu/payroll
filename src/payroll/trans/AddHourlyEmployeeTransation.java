package payroll.trans;

import payroll.Employee;
import payroll.Transaction;

public class AddHourlyEmployeeTransation implements Transaction {

	private int empId;
	private String address;
	private double hourlyRate;
	private String name;

	public AddHourlyEmployeeTransation(int empId, String name, String address, double hourlyRate) {
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public void excute() {
		Employee employee=new Employee(empId,name,address);
		employee.setPaymentClassification(new HourlyClassification(hourlyRate));
	}

}
