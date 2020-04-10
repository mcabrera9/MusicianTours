package com.music.model.musician;
import com.music.model.manager.*;
import com.music.model.subscribers.Subscriber;

public class Rapper extends Musician{
	Manager managerType;
	public Rapper(Manager m){
		super(m);
		this.managerType = m;
	}
	
	public void onTour() {
		managerType.onTour();
	}
	
	public void offTour() {
		managerType.offTour();
	}

	@Override
	public String getStatus() {
		// This returns the touring status of the artist. 
		return managerType.getStatus();
	}
}

