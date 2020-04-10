package com.music.model.manager;

public class OldManager implements Manager{
	private String status;
	
	@Override
	public void onTour() {
		status = "is touring";
	}

	@Override
	public void offTour() {
		status = "not touring";
		
	}
	
	@Override
	public String getStatus() {
		return status;
	}
}
