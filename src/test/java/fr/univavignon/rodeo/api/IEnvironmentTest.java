package fr.univavignon.rodeo.api;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Test;
import org.mockito.Mockito;

import fr.univavignon.rodeo.imp.ImplAnimal;
import fr.univavignon.rodeo.imp.ImplSpecies;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class IEnvironmentTest {

	public static IEnvironment iEnvironment;

	
	/**
	 * get IEnvironement Mock
	 * @return
	 */
	public static IEnvironment getIEnvironmentMock() {
		
		iEnvironment = mock(IEnvironment.class);
		
        when(iEnvironment.getName()).thenReturn("envtest");

        
		// defining the value of Areas
        when(iEnvironment.getAreas()).thenReturn(1);
        

		//Creating List of Species
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(new ImplAnimal("test",1,true,true,false));				
		List<ISpecie> species = new ArrayList<ISpecie>();
		species.add(new ImplSpecies("myName",10,animals));
		
		// defining the value of Species
        when(iEnvironment.getSpecies()).thenReturn(species);
        
		return  iEnvironment;
	}
	
	/**
	 * get IEnvironement Instance
	 * @return
	 */
	public  IEnvironment getIEnvironmentInstance() {
		return getIEnvironmentMock();
	}
	
	/**
	 * Testing of Get Areas
	 */
	@Test
	public void testGetAreas() {
		// init IEnvironment
		iEnvironment=getIEnvironmentInstance();

        //test the getXP
        assertEquals(iEnvironment.getAreas(), 1);
	}	
	
	/**
	 * Testing Get Species
	 */
	@Test
	public void testGetSpecies() {
		// init IEnvironment
		iEnvironment=getIEnvironmentInstance();
		
        
		//Creating List of Species
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(IAnimalTest.getIAnimalMock());				
		List<ISpecie> species = new ArrayList<ISpecie>();
		species.add(ISpecieTest.getISpecieMock());
		
        //testing getAnimals() size
		//assertEquals(species.size(), iEnvironment.getSpecies().size());
		
		//test if same name (element)
		//assertEquals("myName", iEnvironment.getSpecies().get(0).getName());
	}

}
