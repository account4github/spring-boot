package org.myself.demo.springboot.exception;


public class ViewException extends BaseException {

	private static final long serialVersionUID = 1L;

	public ViewException() {
		super();
	}
	public ViewException(int code, String message) {
		super(code, message);
	}
	public ViewException(int code, Throwable cause) {
		super(code, cause);
	}
	public ViewException(int code) {
		super(code);
	}
	
}