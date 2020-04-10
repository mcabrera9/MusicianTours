package com.music.model.musician;
import com.music.model.manager.*;
import com.music.model.subscribers.*;

public abstract class Musician {
	Manager manager;
	Subscriber subscriber;
	String status;
	
	Musician(Manager m){
		this.manager = m;
	}
	public abstract void onTour();
	public abstract void offTour();
	public abstract String getStatus();

}
