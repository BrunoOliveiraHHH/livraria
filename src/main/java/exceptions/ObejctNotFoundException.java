package exceptions;

public class ObejctNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObejctNotFoundException(String msg) {
		super(msg);
	}

	public ObejctNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
