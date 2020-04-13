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
		
	}
	
	@Test
	void testOffTourManager() {
		
	}
	
	@Test
	void testRegister() {
		
	}
	
	@Test
	void testUnregister() {
		
	}

}
