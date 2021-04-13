package payroll.trans;

import payroll.Transaction;

public class AddHourlyEmployeeTransation implements Transaction {

	private int empId;

	public AddHourlyEmployeeTransation(int empId, String name, String address, double hourlyRate) {
		this.empId = empId;
		// TODO Auto-generated constructor stub
	}

}
