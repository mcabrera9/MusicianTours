package com.music.model.musician;
import com.music.model.manager.*;

public abstract class Musician {
	Manager manager;
	String status;
	
	Musician(Manager m){
		this.manager = m;
	}
	public abstract void onTour();
	public abstract void offTour();
	public abstract String getStatus();

}
