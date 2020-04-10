package com.music.model.musician;
import com.music.model.manager.*;
import com.music.model.subscribers.Subscriber;

public class Singer extends Musician{
	Manager managerType;
	public Singer(Manager m){
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
		// TODO Auto-generated method stub
		return managerType.getStatus();
	}
}

