package fr.univavignon.rodeo.api;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;




public class ISpecieTest {

	
	/**
	 * get ISpecie Mock
	 * @return
	 */
	public static ISpecie getISpecieMock() {
		
		ISpecie iSpecie = mock(ISpecie.class);
		// defining the value of getArea
		when(iSpecie.getArea()).thenReturn(10);

		// defining the value of Name
		when(iSpecie.getName()).thenReturn("myName");
		

		//Creating List of Animals
		List<IAnimal> animals = new ArrayList<IAnimal>();
		animals.add(IAnimalTest.getIAnimalMock());
		
		 // defining the value of getAnimals
        when(iSpecie.getAnimals()).thenReturn(animals);

		return  iSpecie;
	}	
	

	/**
	 * get ISpecie instance
	 * @return
	 */
	public ISpecie getISpecieInstance() {
		return  getISpecieMock();
	}	
	
	
	/**
	 * testing get Area
	 */
	@Test
	public void testGetArea() {
		//Create mock
		ISpecie iSpecie = getISpecieInstance();
		
        //testing getArea()
        assertEquals(iSpecie.getArea(), 10);

	}	
	
	/**
	 * testing get Animals
	 */
	@Test
	public void testGetAnimals() {
		//Create mock
		ISpecie iSpecie = getISpecieInstance();

		List<IAnimal> animals = new ArrayList<IAnimal>();
		IAnimal animal = IAnimalTest.getIAnimalMock();
		animals.add(animal);
        //testing getAnimals() size
		assertEquals(animals.size(), iSpecie.getAnimals().size());
		
		//test if same name (element)
		assertEquals(animal.getName(), iSpecie.getAnimals().get(0).getName());


	}
}
