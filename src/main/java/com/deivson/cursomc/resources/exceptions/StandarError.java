package com.deivson.cursomc.resources.exceptions;

import java.io.Serializable;

public class StandarError implements Serializable {

	 
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timeStatus;

	public StandarError(Integer status, String msg, Long timeStatus) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStatus = timeStatus;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimeStatus() {
		return timeStatus;
	}

	public void setTimeStatus(Long timeStatus) {
		this.timeStatus = timeStatus;
	}

}
