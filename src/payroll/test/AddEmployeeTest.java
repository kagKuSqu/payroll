package payroll.test;

import static org.junit.Assert.*;

import org.junit.Test;

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
	}

}
