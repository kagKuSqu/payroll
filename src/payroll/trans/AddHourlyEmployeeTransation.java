package payroll.trans;

import payroll.PaymentClassification;
import payroll.Transaction;
import payroll.classification.HourlyClassification;

public class AddHourlyEmployeeTransation extends AddEmployeeTransaction implements Transaction {

	private double hourlyRate;
	public AddHourlyEmployeeTransation(int empId, String name, String address, double hourlyRate) {
		super(empId,name,address);
		this.hourlyRate = hourlyRate;
	}

	@Override
	protected PaymentClassification getPaymentClassification() {
		return new HourlyClassification(hourlyRate);
	}

}
