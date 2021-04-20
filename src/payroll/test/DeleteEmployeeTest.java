package payroll.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteEmployeeTest {

	@Test
	public void testDeleteEmployeeExisted() {
		int empId=2001;
		new AddHourlyEmployeeTransaction(empId,"Bill",12.5).execute();
		
	}

}
