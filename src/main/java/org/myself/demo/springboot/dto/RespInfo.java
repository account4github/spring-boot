package org.myself.demo.springboot.dto;
/**
 * 
 * <B>文件名称：</B>RespInfo.java<BR>
 * <B>文件描述：</B><BR>
 * 
 * <B>版权声明：</B>(C)2014-2016<BR>
 * <B>公司部门：</B>北京众荟科技<BR>
 * <B>创建时间：</B>2016年11月24日<BR>
 * 
 * @author 曹硕
 * @version 
 * @param <E>
 */
public class RespInfo<E> {
	
	private int errorCode = 0;
	private String errorMsg = null;
	private E data = null;
	
	public RespInfo() {
		super();
	}
	public RespInfo(E data) {
		super();
		this.data = data;
	}
	public RespInfo(int errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	public RespInfo(int errorCode, String errorMsg, E data) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.data = data;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "RespInfo [errorCode=" + errorCode 
				+ ", errorMsg=" + errorMsg 
				+ ", data=" + data + "]";
	}
	
}