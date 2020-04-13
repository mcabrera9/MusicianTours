package com.music.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.music.model.manager.*;
import com.music.model.musician.*;
import com.music.model.subscribers.*;

public class Tests {
	
	NewManager newManager = new NewManager();
	OldManager oldManager = new OldManager();
	Collaborator collabsub = new Collaborator();
	Musician KatyPerry = new Singer(new OldManager());
	Musician Drake = new Rapper(new NewManager());
	Fan fansub = new Fan();
	
	@BeforeEach
	void setUp() throws Exception {
		newManager.getStatus();
		oldManager.getStatus();
		collabsub.getStatus();
		fansub.getStatus();
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testOnTourManager() {
		//test showing when Musician is on tour
		KatyPerry.onTour();
		assertEquals("is touring", KatyPerry.getStatus());
	}
	
	@Test
	void testOffTourManager() {
		//test showing when Musician is not on tour
		Drake.offTour();
		assertEquals("not touring", Drake.getStatus());
	}
	
	@Test
	void testRegister() {
		
	}
	
	@Test
	void testUnregister() {
		
	}

}
