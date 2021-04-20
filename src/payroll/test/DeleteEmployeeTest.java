package payroll.test;

import static org.junit.Assert.*;

import org.junit.Test;

import payroll.Transaction;
import payroll.trans.AddHourlyEmployeeTransation;

public class DeleteEmployeeTest {

	@Test
	public void testDeleteEmployeeExisted() {
		int empId=2001;
		new AddHourlyEmployeeTransation(empId,"Bill","Home",12.5).execute();
		Transaction t=new DeleteEmployeeTransaction(empId);
		t.execute();
	}

}
