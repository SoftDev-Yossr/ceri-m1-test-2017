package fr.univavignon.rodeo.imp;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentTest;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.ISpecieTest;

public class ImplEnvironmentTest extends IEnvironmentTest{
	

		@Override
		public IEnvironment getIEnvironmentInstance() {
			List<IAnimal> animals = new ArrayList<IAnimal>();
			animals.add(IAnimalTest.getIAnimalMock());				
			List<ISpecie> species = new ArrayList<ISpecie>();
			species.add(ISpecieTest.getISpecieMock());
			return new ImplEnvironnement( "myName", 1, species) ;
		}
}
