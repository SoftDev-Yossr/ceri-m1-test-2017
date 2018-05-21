package fr.univavignon.rodeo.imp;

import fr.univavignon.rodeo.api.IGameStateProvider;
import fr.univavignon.rodeo.api.IGameStateProviderTest;

public class ImplIGameStateProviderTest extends IGameStateProviderTest {
	 
		@Override
		public IGameStateProvider getIGameStateProviderInstance() {
			return new ImplGameStateProvider();
		}


}