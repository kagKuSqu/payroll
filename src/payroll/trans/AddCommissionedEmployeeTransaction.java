package payroll.trans;

import payroll.PaymentClassification;

public class AddCommissionedEmployeeTransaction extends AddEmployeeTransaction {

	private double salary;

	public AddCommissionedEmployeeTransaction(int empId, String name, String address, double salary,
			double commissionRate) {
		    super(empId,name,address);
			this.salary = salary;
	}

	@Override
	protected PaymentClassification getPaymentClassification() {
		// TODO Auto-generated method stub
		return null;
	}

}
