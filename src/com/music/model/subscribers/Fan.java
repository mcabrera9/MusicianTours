package com.music.model.subscribers;

public class Fan implements Subscriber{
	private String status;
	
	@Override
	public void update(String status) {
		this.setStatus(status);
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
