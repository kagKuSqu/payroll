package payroll.test;

import static org.junit.Assert.*;

import org.junit.Test;

import payroll.Employee;
import payroll.PaymentClassification;
import payroll.PaymentMethod;
import payroll.PayrollDatabase;
import payroll.Transaction;
import payroll.classification.HourlyClassification;
import payroll.classification.SalariedClassification;
import payroll.method.HoldMethod;
import payroll.trans.AddCommissionedEmployeeTransaction;
import payroll.trans.AddHourlyEmployeeTransation;
import payroll.trans.AddSalariedEmployeeTransaction;

public class AddEmployeeTest {

	@Test
	public void testAddHourlyEmployeeTransaction() {
		int empId=1001;
		String name="Bill";
		String address="Home";
		double hourlyRate=12.5;
		Transaction t=new AddHourlyEmployeeTransation(empId,name,address,hourlyRate);
		t.execute();
		Employee e=PayrollDatabase.getEmployee(empId);
		assertNotNull(e);
		assertEquals(empId, e.getEmpId());
		assertEquals(name, e.getName());
		assertEquals(address, e.getAddress());
		PaymentClassification pc = e.getPaymentClassification();
		assertTrue(pc instanceof HourlyClassification);
		HourlyClassification hc = (HourlyClassification) pc;
		assertEquals(hourlyRate, hc.getHourlyRate(), 0.01);
		PaymentMethod pm = e.getPaymentMethod();
		assertTrue(pm instanceof HoldMethod);
	}
	public void testAddSalariedEmployee() {
		int empId=1002;
		String name="Bill";
		String address="Home";
		double salary=2410.0;
		
		Transaction t=new AddSalariedEmployeeTransaction(empId,name,address,salary);
		t.execute();
		
		Employee e=PayrollDatabase.getEmployee(empId);
		assertNotNull(e);
		assertEquals(name,e.getName());
		assertEquals(address,e.getAddress());
		PaymentClassification pc=e.getPaymentClassification();
		assertTrue(pc instanceof SalariedClassification);
		SalariedClassification sc=(SalariedClassification) pc;
		assertEquals(salary,sc.getSalary(),0.01);
		PaymentMethod pm=e.getPaymentMethod();
		assertTrue(pm instanceof HoldMethod);
	}
	
	
	public void testAddCommissionedEmployee() {
		int empId=1002;
		String name="Hill";
		String address="Home";
		double salary=2410.0;
		double commissionRate=0.02;
		
		Transaction t=new AddCommissionedEmployeeTransaction(empId,name,address,salary,commissionRate);
		t.execute();
		
		Employee e=PayrollDatabase.getEmployee(empId);
		assertNotNull(e);
		assertEquals(name,e.getName());
		assertEquals(address,e.getAddress());
		PaymentClassification pc=e.getPaymentClassification();
		assertTrue(pc instanceof CommissionedClassification);
		CommissionedClassification sc=(CommissionedClassification) pc;
		assertEquals(salary,sc.getSalary(),0.01);
		assertEquals(commissionRate,sc.getCommissionRate(),0.0001);
		
		
	}
}
