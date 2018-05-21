package fr.univavignon.rodeo.imp;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateTest;

public class ImplIGameState extends IGameStateTest{
	 
		@Override
		public IGameState getIGameStateInstance() {
			return new ImplGameState("myTest");
		}

}
