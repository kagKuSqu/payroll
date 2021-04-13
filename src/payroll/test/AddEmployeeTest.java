package payroll.test;

import static org.junit.Assert.*;

import org.junit.Test;

import payroll.Transaction;

public class AddEmployeeTest {

	@Test
	public void testAddHourlyEmployeeTransaction() {
		int empId=1001;
		String name="Bill";
		String address="Home";
		double hourlyRate=12.5;
		Transaction t=new AddHourlyEmployeeTransation(empId,name,address,hourlyRate);
		t.excute();
		Employee e=Payrolldatabase.getEmployee(empId);
		assertNotNull(e);
		assertEquals(name,e.getName());
		assertEquals(address,e.getAddress());
		PaymentClassification pc=e.getPaymentClassification();
		assertTrue(pc instanceof HourlyClassification);
		HourlyClassification hc=(HourlyClassification) pc;
		assertEquals(hourlyRate,hc.getHourlyRate(),0.01);
		PaymentMothod pm=e.getPaymentMethod();
		assertTrue(pm instanceof HolaMethod);
	}

}
