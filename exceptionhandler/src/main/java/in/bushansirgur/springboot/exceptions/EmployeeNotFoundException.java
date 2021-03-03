package in.bushansirgur.springboot.exceptions;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
