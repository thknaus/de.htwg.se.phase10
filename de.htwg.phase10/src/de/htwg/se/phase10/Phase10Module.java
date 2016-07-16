package de.htwg.se.phase10;

import com.google.inject.AbstractModule;

import de.htwg.se.phase10.controller.IPhase10Controller;

public class Phase10Module extends AbstractModule{
	@Override
	protected void configure() {
		bind(IPhase10Controller.class).to(de.htwg.se.phase10.controller.impl.Phase10Controller.class);
		
	}
	
}
