package org.myself.demo.springboot.exception;


public class JsonException extends BaseException {

	private static final long serialVersionUID = 1L;

	public JsonException() {
		super();
	}
	public JsonException(int code) {
		super(code);
	}
	public JsonException(int code, String message) {
		super(code, message);
	}
	public JsonException(int code, Throwable cause) {
		super(code, cause);
	}

}