package payroll.trans;

import payroll.Employee;
import payroll.PaymentClassification;
import payroll.PayrollDatabase;
import payroll.Transaction;
import payroll.method.HoldMethod;

public abstract class AddEmployeeTransaction implements Transaction{

	protected int empId;
	public AddEmployeeTransaction(int empId, String address, String name) {
		super();
		this.empId = empId;
		this.address = address;
		this.name = name;
	}
	protected String address;
	protected String name;

	public AddEmployeeTransaction() {
		super();
	}

	@Override
	public void excute() {
		Employee employee=new Employee(empId,name,address);
		employee.setPaymentClassification(getPaymentClassification());
		employee.setPaymentMethod(new HoldMethod());
		PayrollDatabase.save(employee);
	}
	protected abstract PaymentClassification getPaymentClassification();


}