package fr.univavignon.rodeo.imp;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.ISpecieTest;

public class ImplSpecieTest  extends ISpecieTest {
	

		@Override
		public  ISpecie getISpecieInstance() {
			List<IAnimal> animals = new ArrayList<IAnimal>();
			animals.add(IAnimalTest.getIAnimalMock());
			return  new ImplSpecies("myName",10,animals) ;
		}

}
