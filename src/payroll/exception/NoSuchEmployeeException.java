package payroll.exception;

public class NoSuchEmployeeException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public NoSuchEmployeeException(String message) {
		super(message);
	}

}
