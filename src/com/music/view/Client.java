package com.music.view;
import com.music.model.manager.*;
import com.music.model.musician.*;
import com.music.model.subscribers.*;
public class Client {
	public static void main(String[] args) {
		//This is the bridge implementation.
		Musician KatyPerry = new Singer(new OldManager());
		KatyPerry.onTour();
		System.out.println("The artist status " + KatyPerry.getStatus());
		
		Musician Drake = new Rapper(new NewManager());
		Drake.offTour();
		System.out.println("The artist Drake is " + Drake.getStatus());
		
		//This is the observer implementation.
		SubscriberList KatyPerrySubscribers = new SubscriberList();
		KatyPerrySubscribers.setStatus(KatyPerry.getStatus());
		Fan Matt = new Fan();
		KatyPerrySubscribers.register(Matt);
		KatyPerrySubscribers.statusChanged();
		KatyPerrySubscribers.notifyObservers();
		System.out.println("Matt knows that Katy perry " + Matt.getStatus());
		
		SubscriberList DrakeSubscribers = new SubscriberList();
		DrakeSubscribers.setStatus(Drake.getStatus());
		Collaborator Jess = new Collaborator();
		DrakeSubscribers.register(Jess);
		DrakeSubscribers.statusChanged();
		DrakeSubscribers.notifyObservers();
		System.out.println("Jess knows that Drake is " + Jess.getStatus());
		
		
		
	}
}
