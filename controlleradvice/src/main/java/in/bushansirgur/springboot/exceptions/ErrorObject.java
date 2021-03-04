package in.bushansirgur.springboot.exceptions;

public class ErrorObject {
	
	private Integer statusCode;
	
	private String message;
	
	private long timestamp;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "ErrorObject [statusCode=" + statusCode + ", message=" + message + ", timestamp=" + timestamp + "]";
	}
}
