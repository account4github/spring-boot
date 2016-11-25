package org.myself.demo.springboot.exception;


public class BaseException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	protected int code;
	
	public BaseException() {
		super();
	}
	public BaseException(int code) {
		super();
		this.code = code;
	}
	
	public BaseException(int code, String message) {
		super(message);
		this.code = code;
	}
	public BaseException(int code, Throwable cause) {
		super(cause);
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	

}