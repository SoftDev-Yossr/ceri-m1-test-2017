package fr.univavignon.rodeo.imp;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;

public class ImplAnimalTest extends IAnimalTest {
	
		
		@Override
		public  IAnimal getIAnimalInstance() {
			return  new ImplAnimal("test",1,true,true,false);
		}
}
